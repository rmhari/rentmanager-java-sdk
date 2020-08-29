package com.rentmanager.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class RequestBuilder<T> {

    private final Class<T> clazz;
    private final ObjectMapper objectMapper;
    private final String url;
    private final String token;
    private final String resourceName;

    RequestBuilder(Class<T> clazz,String url,String token) {
        this.clazz = clazz;
        this.objectMapper = new ObjectMapper();
        this.url = url;
        this.token=token;
        this.resourceName = clazz.getAnnotation(JavaBean.class).defaultProperty();
    }

    private Optional<String> getParamsString(Map<String, String> params)
            throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            result.append("&");
        }

        String resultString = result.toString();

        return resultString.length() == 0
                ? Optional.empty()
                : Optional.of(resultString.substring(0, resultString.length() - 1));
    }

    public List<T> getEntities(List<String> fields, List<String> embeds, List<String> ordering, String filterExpression, 
            Integer pageSize, Integer pageNumber) throws IOException, InterruptedException {

        final HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        final StringBuilder entitiesUrl = new StringBuilder(this.url + "/" + this.resourceName);

        Map<String, String> requestParameters = new HashMap<>();
        if (fields != null)  {
            requestParameters.put("fields", fields.stream().collect(Collectors.joining(",")));
        }
        if(embeds != null) {
            requestParameters.put("embeds", embeds.stream().collect(Collectors.joining(",")));
        }
        if (ordering != null)  {
            requestParameters.put("orderingOptions", ordering.stream().collect(Collectors.joining(",")));
        }
        if (filterExpression != null)  {
            requestParameters.put("filters", filterExpression);
        }
        if (pageSize != null) {
            requestParameters.put("PageSize", pageSize.toString());
        }
        if (pageNumber != null) {
            requestParameters.put("PageNumber", pageNumber.toString());
            
        }
        getParamsString(requestParameters).ifPresent(paramString -> {
            entitiesUrl.append("?").append(paramString);
        });

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(entitiesUrl.toString()))
                .setHeader("Content-Type", "application/json")
                .setHeader("X-RM12Api-ApiToken", this.token)
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        int responseCode = response.statusCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            CollectionType javaType = objectMapper.getTypeFactory()
                    .constructCollectionType(List.class, this.clazz);
            return objectMapper.readValue(response.body(), javaType);
        }
        return null;
    }
}
