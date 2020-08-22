package com.rentmanager.client;

import com.rentmanager.client.model.Tenant;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.http.HttpClient;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

class TenantTest {

    final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();
    RentManager rentManager = RentManager.newRentManagerBuilder().userName("User").password("pass").build();

    TenantTest() throws IOException, InterruptedException {
    }

    @Test
    void testRentManager() throws IOException, InterruptedException {
//        RentManager rentManager = new RentManager.RentManagerBuilder().createRentManager();
        RentManager rentManager = RentManager.newRentManagerBuilder().build();
        List<Tenant> result = rentManager.getEntities(Tenant.class, null,
                List.of("Addresses", "Contacts.Addresses", "Contacts.PhoneNumbers", "Contacts.PhoneNumbers.PhoneNumberType", "PrimaryContact", "PrimaryContact.PhoneNumbers"), Collections.singletonList("LastFirst"), null);
        System.out.println(result);
    }

}