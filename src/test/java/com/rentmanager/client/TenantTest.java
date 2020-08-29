package com.rentmanager.client;

import com.rentmanager.client.model.Tenant;
import com.rentmanager.exception.RentManagerException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.http.HttpClient;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

class TenantTest {


    @Test
    void testRentManager() throws RentManagerException {
//        RentManager rentManager = new RentManager.RentManagerBuilder().createRentManager();
        RentManager rentManager = RentManager.newRentManagerBuilder().build();
        Optional<List<Tenant>> result = rentManager.newRequestBuilder(Tenant.class).getEntities(null,
                List.of("Addresses", "Contacts.Addresses", "Contacts.PhoneNumbers", "Contacts.PhoneNumbers.PhoneNumberType", "PrimaryContact", "PrimaryContact.PhoneNumbers"), Collections.singletonList("LastFirst"), null, null, null);
        result.ifPresent(e -> {
            System.out.println(e);
        });

    }

}