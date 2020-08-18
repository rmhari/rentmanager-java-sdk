package com.rentmanager.client.model;

import java.beans.JavaBean;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


@JavaBean(defaultProperty = "Credits")
public class Credit {

    @JsonProperty("ID")
    public Integer iD;
    @JsonProperty("AccountID")
    public Integer accountID;
    @JsonProperty("ChargeTypeID")
    public Integer chargeTypeID;
    @JsonProperty("TransactionType")
    public String transactionType;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("TransactionDate")
    public String transactionDate;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("AmountAllocated")
    public Float amountAllocated;
    @JsonProperty("IsFullyAllocated")
    public Boolean isFullyAllocated;
    @JsonProperty("IsRecordingCashReallocations")
    public Boolean isRecordingCashReallocations;
    @JsonProperty("IsRecordingCashPreallocationsAsLiability")
    public Boolean isRecordingCashPreallocationsAsLiability;
    @JsonProperty("IsRecordingAccrualPrepayments")
    public Boolean isRecordingAccrualPrepayments;
    @JsonProperty("AccountType")
    public String accountType;
    @JsonProperty("Reference")
    public String reference;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("Amount")
    public Float amount;
    @JsonProperty("Allocations")
    public List<Allocation> allocations = null;
    @JsonProperty("Preallocations")
    public List<Object> preallocations = null;
    @JsonProperty("ChargeType")
    public ChargeType chargeType;
//    @JsonProperty("Unit")
//    public Unit_ unit;
//    @JsonProperty("Property")
//    public Property_ property;
    @JsonProperty("Tenant")
    public Tenant tenant;
//    @JsonProperty("Prospect")
//    public Prospect prospect;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;

}