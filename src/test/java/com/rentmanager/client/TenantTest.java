package com.rentmanager.client;

import com.rentmanager.client.model.PhoneNumber;
import com.rentmanager.client.model.Tenant;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class TenantTest {

    @Test
    void testRentManager() throws IOException, InterruptedException {
        RentManager rentManager = new RentManager();
        List<Tenant> tenants = rentManager.getEntities(Tenant.class, null,
                List.of("Addresses", "Contacts.Addresses", "Contacts.PhoneNumbers", "Contacts.PhoneNumbers.PhoneNumberType", "PrimaryContact", "PrimaryContact.PhoneNumbers"), Collections.singletonList("LastFirst"), "Status,eq,Current");

    }

}