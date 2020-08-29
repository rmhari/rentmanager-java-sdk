package com.rentmanager.client;

import com.rentmanager.client.model.Unit;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class UnitTest {

    @Test
    void testRentManager() throws IOException, InterruptedException {
        RentManager rentManager = new RentManager.RentManagerBuilder().build();
        List<Unit> unitsRentManager = rentManager.newRequestBuilder(Unit.class).getEntities(null,
                List.of("Addresses", "Addresses.AddressType"), null, null, null, null);
    }
}
