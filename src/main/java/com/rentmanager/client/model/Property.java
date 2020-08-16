package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.List;

@JavaBean(defaultProperty = "Properties")
public class Property {

    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("ShortName")
    public String shortName;
    @JsonProperty("BillingName1")
    public String billingName1;
    @JsonProperty("BillingName2")
    public String billingName2;
    @JsonProperty("ManagerName")
    public String managerName;
    @JsonProperty("IsActive")
    public Boolean isActive;
    @JsonProperty("PropertyType")
    public String propertyType;
    @JsonProperty("Email")
    public String email;
    @JsonProperty("TaxID")
    public String taxID;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("IsSystemDefaultAssignedUser")
    public Boolean isSystemDefaultAssignedUser;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("IsLateChargeEnabled")
    public Boolean isLateChargeEnabled;
    @JsonProperty("IsEpayEnabled")
    public Boolean isEpayEnabled;
    @JsonProperty("EndorsementOverride")
    public String endorsementOverride;
    @JsonProperty("DefaultBankID")
    public Integer defaultBankID;
    @JsonProperty("PrimaryOwnerID")
    public Integer primaryOwnerID;
    @JsonProperty("PostingDay")
    public Integer postingDay;
    @JsonProperty("LastMonthlyPost")
    public String lastMonthlyPost;
    @JsonProperty("LastManagementFeePost")
    public String lastManagementFeePost;
    @JsonProperty("PhoneNumbers")
    public List<PhoneNumber> phoneNumbers = null;

}

