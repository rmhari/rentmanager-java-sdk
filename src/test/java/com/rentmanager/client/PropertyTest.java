package com.rentmanager.client;

import com.rentmanager.client.model.Property;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class PropertyTest {
    @Test
    void testRentManager() throws IOException, InterruptedException {
        RentManager rentManager = new RentManager();
        List<Property> properties = rentManager.getEntities(Property.class, null,
                List.of("PhoneNumbers", "PhoneNumbers.PhoneNumberType", "Addresses", "Addresses.AddressType"), null, null);
    }

}
