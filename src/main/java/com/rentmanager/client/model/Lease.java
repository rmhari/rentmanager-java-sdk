package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "Leases")
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
    private Integer leaseID;
    @JsonProperty("TenantID")
    private Integer tenantID;
    @JsonProperty("UnitID")
    private Integer unitID;
    @JsonProperty("PropertyID")
    private Integer propertyID;
    @JsonProperty("MoveInDate")
    private String moveInDate;
    @JsonProperty("SortOrder")
    private Integer sortOrder;
    @JsonProperty("CreateDate")
    private String createDate;
    @JsonProperty("UpdateDate")
    private String updateDate;
    @JsonProperty("CreateUserID")
    private Integer createUserID;
    @JsonProperty("UpdateUserID")
    private Integer updateUserID;

    @JsonProperty("LeaseID")
    public Integer getLeaseID() {
        return leaseID;
    }

    @JsonProperty("LeaseID")
    public void setLeaseID(Integer leaseID) {
        this.leaseID = leaseID;
    }

    @JsonProperty("TenantID")
    public Integer getTenantID() {
        return tenantID;
    }

    @JsonProperty("TenantID")
    public void setTenantID(Integer tenantID) {
        this.tenantID = tenantID;
    }

    @JsonProperty("UnitID")
    public Integer getUnitID() {
        return unitID;
    }

    @JsonProperty("UnitID")
    public void setUnitID(Integer unitID) {
        this.unitID = unitID;
    }

    @JsonProperty("PropertyID")
    public Integer getPropertyID() {
        return propertyID;
    }

    @JsonProperty("PropertyID")
    public void setPropertyID(Integer propertyID) {
        this.propertyID = propertyID;
    }

    @JsonProperty("MoveInDate")
    public String getMoveInDate() {
        return moveInDate;
    }

    @JsonProperty("MoveInDate")
    public void setMoveInDate(String moveInDate) {
        this.moveInDate = moveInDate;
    }

    @JsonProperty("SortOrder")
    public Integer getSortOrder() {
        return sortOrder;
    }

    @JsonProperty("SortOrder")
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @JsonProperty("CreateDate")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("CreateDate")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @JsonProperty("UpdateDate")
    public String getUpdateDate() {
        return updateDate;
    }

    @JsonProperty("UpdateDate")
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @JsonProperty("CreateUserID")
    public Integer getCreateUserID() {
        return createUserID;
    }

    @JsonProperty("CreateUserID")
    public void setCreateUserID(Integer createUserID) {
        this.createUserID = createUserID;
    }

    @JsonProperty("UpdateUserID")
    public Integer getUpdateUserID() {
        return updateUserID;
    }

    @JsonProperty("UpdateUserID")
    public void setUpdateUserID(Integer updateUserID) {
        this.updateUserID = updateUserID;
    }

}