package com.rentmanager.client;

import java.util.Date;

public class UnitRent {
    /**
     * tells the id .
     */
    private Long id;
    /**
     * tells the rent amount.
     */
    private Double rentAmount;
    /**
     * tells the start date.
     */
    private Date rentStartDate;
    /**
     * tells the end date.
     */
    private Date rentEndDate;
    /**
     * tells the unit id.
     */
    private Long unitId;
    /**
     * tells the rent type.
     */
    private String rentType;
    /**
     * tells about the account created by who.
     */
    private Long createdBy;
    /**
     * tells about the account updated by who.
     */
    private Long updatedBy;
    /**
     * tells whether is deleted.
     */
    private Integer isDeleted;
    /**
     * tells when the account created.
     */
    private Date createdAt;
    /**
     * tells when the account updated.
     */
    private Date updatedAt;

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
     * @return Long
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * sets created by.
     *
     * @param createdBy
     */
    public void setCreatedBy(final Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * gets updated by.
     *
     * @return Long
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
     * gets the rent amount.
     *
     * @return Double
     */
    public Double getRentAmount() {
        return rentAmount;
    }

    /**
     * sets the rent amount.
     *
     * @param rentAmount
     */
    public void setRentAmount(final Double rentAmount) {
        this.rentAmount = rentAmount;
    }

    /**
     * gets the rent start date.
     *
     * @return Date
     */
    public Date getRentStartDate() {
        return rentStartDate;
    }

    /**
     * sets the rent start date.
     *
     * @param rentStartDate
     */
    public void setRentStartDate(final Date rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    /**
     * gets the rent end date.
     *
     * @return Date
     */
    public Date getRentEndDate() {
        return rentEndDate;
    }

    /**
     * sets the rent end date.
     *
     * @param rentEndDate
     */
    public void setRentEndDate(final Date rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    /**
     * gets unit id.
     *
     * @return Long
     */
    public Long getUnitId() {
        return unitId;
    }

    /**
     * sets unit id.
     *
     * @param unitId
     */
    public void setUnitId(final Long unitId) {
        this.unitId = unitId;
    }

    /**
     * gets the rent type.
     *
     * @return String
     */
    public String getRentType() {
        return rentType;
    }

    /**
     * sets the rent type.
     *
     * @param rentType
     */
    public void setRentType(final String rentType) {
        this.rentType = rentType;
    }
}

