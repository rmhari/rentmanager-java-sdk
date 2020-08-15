package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "LeaseID",
        "TenantID",
        "UnitID",
        "PropertyID",
        "MoveInDate",
        "SortOrder",
        "CreateDate",
        "UpdateDate",
        "CreateUserID",
        "UpdateUserID"
})
public class Lease {

    @JsonProperty("LeaseID")
    public Integer leaseID;
    @JsonProperty("TenantID")
    public Integer tenantID;
    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("MoveInDate")
    public String moveInDate;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;

}