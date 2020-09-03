package com.rentmanager.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.rentmanager.exception.RentManagerClientException;
import com.rentmanager.exception.RentManagerException;
import com.rentmanager.exception.RentManagerServerException;

import java.beans.JavaBean;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class RequestBuilder<T> {

    private final Class<T> clazz;
    private final ObjectMapper objectMapper;
    private final String url;
    private final String token;
    private final String resourceName;

    private static final Integer MAXPAGESIZE = 1000;

    RequestBuilder(Class<T> clazz, String url, String token) {
        this.clazz = clazz;
        this.objectMapper = new ObjectMapper();
        this.url = url;
        this.token = token;
        this.resourceName = clazz.getAnnotation(JavaBean.class).defaultProperty();
    }

    private Optional<String> getParamsString(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            result.append("&");
        }

        String resultString = result.toString();

        return resultString.length() == 0 ? Optional.empty()
                : Optional.of(resultString.substring(0, resultString.length() - 1));
    }

    public void consumeEntities(List<String> fields, List<String> embeds, List<String> ordering,
                                String filterExpression, Consumer<T> consumer) throws RentManagerException {

        Integer pageNumber = 1;

        Optional<List<T>> optionalEntries;

        while ((optionalEntries = getEntities(fields, embeds, ordering, filterExpression, MAXPAGESIZE, pageNumber))
                .isPresent()) {

            optionalEntries.get().stream().forEach(consumer);
            // If Records are lesses that MAXPAGESIZE this is last page so no need for next
            // API Call
            if (optionalEntries.get().size() != MAXPAGESIZE) {
                break;
            }
            pageNumber++;
        }
    }

    public Optional<List<T>> getEntities(List<String> fields, List<String> embeds, List<String> ordering,
                                         String filterExpression, Integer pageSize, Integer pageNumber) throws RentManagerException {
        // if (pageSize > MAXPAGESIZE) {
        //     throw new RentManagerException("max size exceeded", null);
        // }
        List<T> entities = null;
        final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10)).build();

        final StringBuilder entitiesUrl = new StringBuilder(this.url + "/" + this.resourceName);

        Map<String, String> requestParameters = new HashMap<>();
        if (fields != null) {
            requestParameters.put("fields", fields.stream().collect(Collectors.joining(",")));
        }
        if (embeds != null) {
            requestParameters.put("embeds", embeds.stream().collect(Collectors.joining(",")));
        }
        if (ordering != null) {
            requestParameters.put("orderingOptions", ordering.stream().collect(Collectors.joining(",")));
        }
        if (filterExpression != null) {
            requestParameters.put("filters", filterExpression);
        }
        if (pageSize != null) {
            requestParameters.put("PageSize", pageSize.toString());
        }
        if (pageNumber != null) {
            requestParameters.put("PageNumber", pageNumber.toString());

        }

        try {
            getParamsString(requestParameters).ifPresent(paramString -> {
                entitiesUrl.append("?").append(paramString);
            });

            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(entitiesUrl.toString()))
                    .setHeader("Content-Type", "application/json").setHeader("X-RM12Api-ApiToken", this.token).build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            int responseCode = response.statusCode();

            if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_PARTIAL) {
                CollectionType javaType = objectMapper.getTypeFactory().constructCollectionType(List.class, this.clazz);
                entities = objectMapper.readValue(response.body(), javaType);
            } else if (responseCode != HttpURLConnection.HTTP_NO_CONTENT) {
                handleException(response);
            }

        } catch (InterruptedException | IOException | NullPointerException e) {
            throw new RentManagerException("unable get entities", e);
        }

        return Optional.ofNullable(entities);

    }

    public Optional<T> getEntity(Long id, List<String> embeds) throws RentManagerException {
        Objects.requireNonNull(id);
        Optional<T> entity = null;
        final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10)).build();

        final StringBuilder entitiesUrl = new StringBuilder(this.url + "/" + this.resourceName + "/" + id);

        Map<String, String> requestParameters = new HashMap<>();

        if (embeds != null) {
            requestParameters.put("embeds", embeds.stream().collect(Collectors.joining(",")));
        }
        try {
            getParamsString(requestParameters).ifPresent(paramString -> {
                entitiesUrl.append("?").append(paramString);
            });

            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(entitiesUrl.toString()))
                    .setHeader("Content-Type", "application/json").setHeader("X-RM12Api-ApiToken", this.token).build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            int responseCode = response.statusCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                entity = Optional.of(objectMapper.readValue(response.body(), this.clazz));
            } else if (responseCode != HttpURLConnection.HTTP_NOT_FOUND) {
                entity = Optional.empty();
            } else {
                handleException(response);
            }
        } catch (InterruptedException | IOException e) {
            throw new RentManagerException("unable get entity", e);
        }
        return entity;
    }
    private void handleException(HttpResponse<String> response) throws JsonProcessingException, RentManagerClientException, RentManagerServerException {

        Map<String, Object> errorResponse = objectMapper.readValue(response.body(), Map.class);
        int responseCode = response.statusCode();

        if (responseCode >= 400 && responseCode < 500) {

            RentManagerClientException.ModelState modelState = new RentManagerClientException.ModelState((List<String>) ((Map) errorResponse.get("ModelState")).get("filters"));
            RentManagerClientException rentManagerClientException = new RentManagerClientException(errorResponse.get("Message").toString(),
                    modelState);

            throw rentManagerClientException;

        } else {

            System.out.println(errorResponse);

            RentManagerServerException rentManagerServerException = new RentManagerServerException((String) errorResponse.get("UserMessage"), (String) errorResponse.get("DeveloperMessage"),
                    (Integer) errorResponse.get("ErrorCode"), (String) errorResponse.get("MoreInfoUri"),
                    (String) errorResponse.get("Exception"), (String) errorResponse.get("Details"),
                    (String) errorResponse.get("InnerException"),
                    (Map<String, Object>) errorResponse.get("AdditionalData"));

            throw rentManagerServerException;
        }
    }
}