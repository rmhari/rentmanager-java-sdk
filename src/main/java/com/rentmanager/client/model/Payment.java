package com.rentmanager.client.model;

import java.beans.JavaBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
@JavaBean(defaultProperty = "Payments")
public class Payment {

    @JsonProperty("Allocations")
    public List<Allocation> allocations = null;
    @JsonProperty("ID")
    public Integer iD;
    @JsonProperty("AccountID")
    public Integer accountID;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("TransactionType")
    public String transactionType;
    @JsonProperty("AmountAllocated")
    public Double amountAllocated;
    @JsonProperty("IsFullyAllocated")
    public Boolean isFullyAllocated;
    @JsonProperty("ReceiptID")
    public Integer receiptID;
    @JsonProperty("IsRecordingCashReallocations")
    public Boolean isRecordingCashReallocations;
    @JsonProperty("IsRecordingCashPreallocationsAsLiability")
    public Boolean isRecordingCashPreallocationsAsLiability;
    @JsonProperty("IsRecordingAccrualPrepayments")
    public Boolean isRecordingAccrualPrepayments;
    @JsonProperty("PrepayPropertyID")
    public Integer prepayPropertyID;
    @JsonProperty("PrepayUnitID")
    public Integer prepayUnitID;
    @JsonProperty("Tenant")
    public Tenant tenant;
    @JsonProperty("AccountType")
    public String accountType;
    @JsonProperty("Reference")
    public String reference;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("Amount")
    public Double amount;
    @JsonProperty("TransactionDate")
    public String transactionDate;
    @JsonProperty("EpayTransactionInformationDetail")
    public EpayTransactionInformationDetail epayTransactionInformationDetail;
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