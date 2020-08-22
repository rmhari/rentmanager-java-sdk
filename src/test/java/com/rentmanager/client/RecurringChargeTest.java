package com.rentmanager.client;

import com.rentmanager.client.model.RecurringCharge;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class RecurringChargeTest {

    @Test
    void testRentManager() throws IOException, InterruptedException {
        RentManager rentManager = new RentManager.RentManagerBuilder().build();
        List<RecurringCharge> recurringCharges = rentManager.getEntities(RecurringCharge.class, null,
                List.of("ChargeType"), null, null);

    }

}
