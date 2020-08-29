package com.rentmanager.client;

import com.rentmanager.client.model.Property;
import com.rentmanager.exception.RentManagerException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class PropertyTest {
    @Test
    void testRentManager() throws RentManagerException {
        RentManager rentManager = new RentManager.RentManagerBuilder().build();
        List<Property> properties = rentManager.newRequestBuilder(Property.class).getEntities(null,
                List.of("PhoneNumbers", "PhoneNumbers.PhoneNumberType", "Addresses", "Addresses.AddressType"), null, null, null, null);
    }

}
