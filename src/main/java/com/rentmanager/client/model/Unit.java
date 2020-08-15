package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "UnitID",
        "PropertyID",
        "Name",
        "Comment",
        "UnitTypeID",
        "SortOrder",
        "CreateDate",
        "CreateUserID",
        "UpdateDate",
        "UpdateUserID",
        "Addresses"
})
public class Unit {

    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("UnitTypeID")
    public Integer unitTypeID;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("Addresses")
    public List<Address> addresses = null;

}