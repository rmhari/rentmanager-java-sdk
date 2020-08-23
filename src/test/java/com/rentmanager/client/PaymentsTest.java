package com.rentmanager.client;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import com.rentmanager.client.model.Payment;

import org.junit.jupiter.api.Test;

public class PaymentsTest {
 
    @Test
    void testRentManager() throws IOException, InterruptedException {
        RentManager rentManager = new RentManager.RentManagerBuilder().url("https://epc.api.rentmanager.com").userName("heman").password("Eppo1234").build();
        List<Payment> result = rentManager.newRequestBuilder(Payment.class).getEntities( null,
                List.of("Allocations", "Allocations.Charge", "Allocations.Charge.ChargeType", "EpayTransactionInformationDetail.EpayTransactionInformation", "EpayTransactionInformationDetail", "Tenant", "Tenant.Addresses"), Collections.singletonList("LastFirst"), null);
        System.out.println(result);
        assertNotNull(result);
        assertTrue(result.size()>0);
    }

}