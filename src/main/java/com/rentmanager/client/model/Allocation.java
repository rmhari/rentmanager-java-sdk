package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Allocation {

    @JsonProperty("AllocationID")
    public Integer allocationID;
    @JsonProperty("PaymentID")
    public Integer paymentID;
    @JsonProperty("ChargeID")
    public Integer chargeID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("Amount")
    public Double amount;
    @JsonProperty("TransactionDate")
    public String transactionDate;
    @JsonProperty("AllocationType")
    public String allocationType;
    @JsonProperty("IsCash")
    public Boolean isCash;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("CreditID")
    public Integer creditID;
    @JsonProperty("DebitID")
    public Integer debitID;
    @JsonProperty("Charge")
    public Charge charge;
    }