package com.rentmanager.client;

import com.rentmanager.client.model.Address;

import java.util.Date;
import java.util.List;

public class Unit {
    /**
     * tells the id .
     */
    private Long id;

    /**
     * tells the unit name.
     */
    private String unitName;
    /**
     * tells the building name.
     */
    private String buildingName;
    /**
     * tells the square feet.
     */
    private Double squareFeet;
    /**
     * tells the no of bathrooms.
     */
    private Integer noOfBathrooms;
    /**
     * tells the no of bedrooms.
     */
    private Integer noOfBedrooms;
    /**
     * tells other information.
     */
    private String otherInformation;
    /**
     * tells about the account created by whom.
     */
    private Long createdBy;
    /**
     * tells about the account updated by whom.
     */
    private Long updatedBy;
    /**
     * tells whether is deleted.
     */
    private Integer isDeleted;
    /**
     * tells the reference_id.
     */
    private String referenceId;
    /**
     * tells the unit type id.
     */
    private Long unitTypeId;
    /**
     * tells the unit group id.
     */
    private Long unitGroupId;
    /**
     * tells the account id.
     */
    private Long accountId;
    /**
     * tells the address id.
     */
    private Long addressId;
    /**
     * tells the subEntityId.
     */
    private Long subEntityId;
    /**
     * tells when the account created.
     */
    private Date createdAt;
    /**
     * tells when the account updated.
     */
    private Date updatedAt;
    /**
     * tells the provider id.
     */
    private Integer providerId;

    /**
     * addresses.
     */
    private List<Address> addresses;

    /**
     * gets provider id.
     *
     * @return providerId
     */
    public Integer getProviderId() {
        return providerId;
    }

    /**
     * sets provider id.
     *
     * @param providerId
     */
    public void setProviderId(final Integer providerId) {
        this.providerId = providerId;
    }

    /**
     * gets the id.
     *
     * @return Integer
     */
    public Long getId() {
        return id;
    }

    /**
     * sets the id.
     *
     * @param id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * gets created by.
     *
     * @return Long Integer
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * sets created by.
     *
     * @param createdbyvalue
     */
    public void setCreatedBy(final Long createdbyvalue) {
        this.createdBy = createdbyvalue;
    }

    /**
     * gets updated by.
     *
     * @return Long Integer
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * sets updated by.
     *
     * @param updatedBy
     */
    public void setUpdatedBy(final Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * gets is deleted value.
     *
     * @return Integer
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * sets is deleted value.
     *
     * @param isDeleted
     */
    public void setIsDeleted(final Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * get accountid.
     *
     * @return Long Integer
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * set accountid.
     *
     * @param accountId
     */
    public void setAccountId(final Long accountId) {
        this.accountId = accountId;
    }

    /**
     * get addressid.
     *
     * @return Long
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * get addressid.
     *
     * @param addressId
     */
    public void setAddressId(final Long addressId) {
        this.addressId = addressId;
    }

    /**
     * gets created at value.
     *
     * @return Date
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * sets created at value.
     *
     * @param createdAt
     */
    public void setCreatedAt(final Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * gets updated at value.
     *
     * @return Date
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * sets updated at value.
     *
     * @param updatedAt
     */
    public void setUpdatedAt(final Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * gets the UnitName.
     *
     * @return String
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * sets the UnitName.
     *
     * @param unitName
     */
    public void setUnitName(final String unitName) {
        this.unitName = unitName;
    }

    /**
     * gets the BuildingName.
     *
     * @return String
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * sets the BuildingName.
     *
     * @param buildingName
     */
    public void setBuildingName(final String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * gets Square Feet.
     *
     * @return Double
     */
    public Double getSquareFeet() {
        return squareFeet;
    }

    /**
     * sets Square Feet.
     *
     * @param squareFeet
     */
    public void setSquareFeet(final Double squareFeet) {
        this.squareFeet = squareFeet;
    }

    /**
     * gets the No Of Bathrooms.
     *
     * @return Integer
     */
    public Integer getNoOfBathrooms() {
        return noOfBathrooms;
    }

    /**
     * sets the No Of Bathrooms.
     *
     * @param noOfBathrooms
     */
    public void setNoOfBathrooms(final Integer noOfBathrooms) {
        this.noOfBathrooms = noOfBathrooms;
    }

    /**
     * gets the No Of Bedrooms.
     *
     * @return Integer
     */
    public Integer getNoOfBedrooms() {
        return noOfBedrooms;
    }

    /**
     * sets the No Of Bedrooms.
     *
     * @param noOfBedrooms
     */
    public void setNoOfBedrooms(final Integer noOfBedrooms) {
        this.noOfBedrooms = noOfBedrooms;
    }

    /**
     * gets the Other Information.
     *
     * @return String
     */
    public String getOtherInformation() {
        return otherInformation;
    }

    /**
     * sets the Other Information.
     *
     * @param otherInformation
     */
    public void setOtherInformation(final String otherInformation) {
        this.otherInformation = otherInformation;
    }

    /**
     * gets the Unit Type Id.
     *
     * @return Long Integer
     */
    public Long getUnitTypeId() {
        return unitTypeId;
    }

    /**
     * sets the Unit Type Id.
     *
     * @param unitTypeId
     */
    public void setUnitTypeId(final Long unitTypeId) {
        this.unitTypeId = unitTypeId;
    }

    /**
     * gets the Unit Group Id.
     *
     * @return Long Integer
     */
    public Long getUnitGroupId() {
        return unitGroupId;
    }

    /**
     * sets the Unit Group Id.
     *
     * @param unitGroupId
     */
    public void setUnitGroupId(final Long unitGroupId) {
        this.unitGroupId = unitGroupId;
    }

    /**
     * gets sub entity id.
     *
     * @return Long Integer
     */
    public Long getSubEntityId() {
        return subEntityId;
    }

    /**
     * sets sub entity id.
     *
     * @param subEntityId
     */
    public void setSubEntityId(final Long subEntityId) {
        this.subEntityId = subEntityId;
    }


    /**
     * gets the reference id.
     *
     * @return String
     */
    public String getReferenceId() {
        return referenceId;
    }


    /**
     * sets the reference id.
     *
     * @param referenceId
     */
    public void setReferenceId(final String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * @return Addresses
     */
    public List<Address> getAddresses() {
        return addresses;
    }


    /**
     * @param addresses
     */
    public void setAddresses(final List<Address> addresses) {
        this.addresses = addresses;
    }

}
