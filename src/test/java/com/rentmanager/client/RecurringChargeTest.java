package com.rentmanager.client;

import com.rentmanager.client.model.RecurringCharge;
import com.rentmanager.exception.RentManagerException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class RecurringChargeTest {

    @Test
    void testRentManager() throws RentManagerException {
        RentManager rentManager = new RentManager.RentManagerBuilder().build();
        rentManager.newRequestBuilder(RecurringCharge.class).consumeEntities(null,
                List.of("ChargeType"), null, null, recurringCharge -> {System.out.println("Consuming RecurringCharge" + recurringCharge.recurringChargeID); 
            });

        rentManager.newRequestBuilder(RecurringCharge.class).getEntity(3L, List.of("ChargeType"));
    }
}
