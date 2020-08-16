package com.rentmanager.client;

import com.rentmanager.client.model.Property;
import com.rentmanager.client.model.Unit;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class UnitTest {

    @Test
    void testRentManager() throws IOException, InterruptedException {
        RentManager rentManager = new RentManager();
        List<Unit> unitsRentManager = rentManager.getEntities(Unit.class, null,
                List.of("Addresses", "Addresses.AddressType"), null, null);
    }
}
