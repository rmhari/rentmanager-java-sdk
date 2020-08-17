package com.rentmanager.client.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    }

}