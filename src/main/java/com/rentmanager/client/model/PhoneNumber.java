package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "PhoneNumberID",
        "PhoneNumberTypeID",
        "PhoneNumber",
        "Extension",
        "StrippedPhoneNumber",
        "IsPrimary",
        "ParentID",
        "ParentType",
        "PhoneNumberType"
})
public class PhoneNumber {

    @JsonProperty("PhoneNumberID")
    public Integer phoneNumberID;
    @JsonProperty("PhoneNumberTypeID")
    public Integer phoneNumberTypeID;
    @JsonProperty("PhoneNumber")
    public String phoneNumber;
    @JsonProperty("Extension")
    public String extension;
    @JsonProperty("StrippedPhoneNumber")
    public String strippedPhoneNumber;
    @JsonProperty("IsPrimary")
    public Boolean isPrimary;
    @JsonProperty("ParentID")
    public Integer parentID;
    @JsonProperty("ParentType")
    public String parentType;
    @JsonProperty("PhoneNumberType")
    public PhoneNumberType phoneNumberType;

}
