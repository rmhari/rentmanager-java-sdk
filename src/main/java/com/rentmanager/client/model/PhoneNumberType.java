package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "PhoneNumberTypeID",
        "Name",
        "Description",
        "SortOrder",
        "ParentType"
})
public class PhoneNumberType {

    @JsonProperty("PhoneNumberTypeID")
    public Integer phoneNumberTypeID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("ParentType")
    public String parentType;

}
