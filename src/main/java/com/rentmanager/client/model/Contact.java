package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ContactID",
        "FirstName",
        "LastName",
        "MiddleName",
        "IsPrimary",
        "FederalTaxID",
        "Comment",
        "Email",
        "License",
        "Vehicle",
        "IsShowOnBill",
        "Employer",
        "ApplicantType",
        "CreateDate",
        "CreateUserID",
        "UpdateDate",
        "AnnualIncome",
        "UpdateUserID",
        "ParentID",
        "ParentType",
        "PhoneNumbers",
        "Addresses"
})
public class Contact {

    @JsonProperty("ContactID")
    public Integer contactID;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("MiddleName")
    public String middleName;
    @JsonProperty("IsPrimary")
    public Boolean isPrimary;
    @JsonProperty("FederalTaxID")
    public String federalTaxID;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("Email")
    public String email;
    @JsonProperty("License")
    public String license;
    @JsonProperty("Vehicle")
    public String vehicle;
    @JsonProperty("IsShowOnBill")
    public Boolean isShowOnBill;
    @JsonProperty("Employer")
    public String employer;
    @JsonProperty("ApplicantType")
    public String applicantType;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("AnnualIncome")
    public Float annualIncome;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ParentID")
    public Integer parentID;
    @JsonProperty("ParentType")
    public String parentType;
    @JsonProperty("PhoneNumbers")
    public List<PhoneNumber> phoneNumbers = null;
    @JsonProperty("Addresses")
    public List<Address> addresses = null;
    @JsonProperty("DateOfBirth")
    public Date dateOfBirth;
}
