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
        Optional<List<RecurringCharge>> recurringCharges = rentManager.newRequestBuilder(RecurringCharge.class).getEntities(null,
                List.of("ChargeType"), null, null, 20000, null);
        recurringCharges.ifPresent(entities -> {
            System.out.println(entities);
        });

    }

}
