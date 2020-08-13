package com.rentmanager.client;

import com.rentmanager.client.model.Tenant;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RentManagerTest {

    @Test
    void testRentManager() throws IOException, InterruptedException {
        RentManager rentManager = new RentManager();
        List<Tenant> result = rentManager.getEntities(Tenant.class, null, Collections.singletonList("Addresses"), Collections.singletonList("LastFirst"));
        System.out.println(result);
    }

}