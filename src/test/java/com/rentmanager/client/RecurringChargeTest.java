package com.rentmanager.client;

import com.rentmanager.client.model.RecurringCharge;
import com.rentmanager.exception.RentManagerException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class RecurringChargeTest {

    @Test
    void testRentManager() throws RentManagerException {
        RentManager rentManager = new RentManager.RentManagerBuilder().build();
        List<RecurringCharge> recurringCharges = rentManager.newRequestBuilder(RecurringCharge.class).getEntities(null,
                List.of("ChargeType"), null, null, null, null);
        System.out.println(recurringCharges);
    }

}
