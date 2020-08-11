import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class RentManager {
    private final String url;
    private final String token;
    ObjectMapper objectMapper = new ObjectMapper();

    public RentManager(String url, String userName, String password) throws IOException, InterruptedException {
        this.url = url;
        this.token = getToken(userName, password);
    }

    public String getToken(String userName, String password) throws IOException, InterruptedException {
        String token = null;

        //Connection created
        final HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        final StringBuilder loginUrl = new StringBuilder(this.url + "/authentication/AuthorizeUser/");

        //set header
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(loginUrl.toString()))
                .setHeader("Content-Type", "application/json")
                .build();

        //set the content inside connection, "{\"username\":\""+username+"\",\"password\":\""+password+"\"}";
        String jsoncontent = "{\"userName\":\"" + userName + "\",\"password\":\"" + password + "\"}";

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        //send request
        int responsecode = response.statusCode();

        //if successful
        if (responsecode == HttpURLConnection.HTTP_OK) {
            System.out.println(response.body());
        }
        return token;

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
    public List<Map<String, Object>> getTenants(List<String> fields) throws IOException, InterruptedException {

        final HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        final StringBuilder entitiesUrl = new StringBuilder(this.url + "/Tenants");

        Map<String,String> requestParameters = new HashMap<>();
        if(fields != null) {
            requestParameters.put("fields",fields.stream().collect(Collectors.joining(",")));
        }
        getParamsString(requestParameters).ifPresent(paramString->{
            entitiesUrl.append("?").append(paramString) ;
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
            return objectMapper.readValue(response.body(), new TypeReference<List<Map<String, Object>>>() {
            });
        }
        return null;
    }
}
