package com.rentmanager.client;

import com.rentmanager.client.model.Tenant;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.http.HttpClient;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

class TenantTest {




    @Test
    void testRentManager() throws IOException, InterruptedException {
//        RentManager rentManager = new RentManager.RentManagerBuilder().createRentManager();
        RentManager rentManager = RentManager.newRentManagerBuilder().build();
        List<Tenant> result = rentManager.newRequestBuilder(Tenant.class).getEntities(null,
                List.of("Addresses", "Contacts.Addresses", "Contacts.PhoneNumbers", "Contacts.PhoneNumbers.PhoneNumberType", "PrimaryContact", "PrimaryContact.PhoneNumbers"), Collections.singletonList("LastFirst"), null);

        System.out.println(result);
    }

}