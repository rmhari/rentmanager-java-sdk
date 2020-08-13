package com.rentmanager.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

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
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RentManager {
    private final String url;
    private final String token;
    ObjectMapper objectMapper = new ObjectMapper();

    public RentManager(String url, String userName, String password) throws IOException, InterruptedException {
        this.url = url;
        this.token = getToken(userName, password);
    }

    public RentManager() throws IOException, InterruptedException {
        this(System.getenv("RENTMANAGER_URL"), System.getenv("RENTMANAGER_USERNAME"), System.getenv("RENTMANAGER_PASSWORD"));
    }

    private String getToken(String userName, String password) throws IOException, InterruptedException {
        String token = null;

        //Connection created
        final HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        final StringBuilder loginUrl = new StringBuilder(this.url+"/authentication/AuthorizeUser/");

        //set header
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString("{\"userName\":\"" + userName + "\",\"password\":\"" + password + "\"}"))
                .uri(URI.create(loginUrl.toString()))
                .setHeader("Content-Type", "application/json")
                .build();


        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        //send request
        int responsecode = response.statusCode();

        //if successful
        if (responsecode == HttpURLConnection.HTTP_OK) {
            token = response.body();
            token = token.substring(1, token.length() - 1);
        }
        return token;

    }

    public <T> List<T> getEntities(Class<T> clazz,List<String> fields, List<String> embeds, List<String> ordering) throws IOException, InterruptedException {
        return new RequestBuilder(clazz,url,token).getEntities(fields,embeds,ordering);
    }

}
