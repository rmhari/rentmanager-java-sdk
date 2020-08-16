package com.rentmanager.client;

import com.rentmanager.client.model.Property;
import com.rentmanager.client.model.Tenant;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PropertyTest {
    @Test
    void testRentManager() throws IOException, InterruptedException {
        RentManager rentManager = new RentManager();
        List<Property> properties = rentManager.getEntities(Property.class, null,
                List.of("PhoneNumbers", "PhoneNumbers.PhoneNumberType"), null, null);

    }

}
