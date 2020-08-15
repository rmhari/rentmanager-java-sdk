package com.rentmanager.client;

import java.time.LocalDate;
import java.util.Date;

public class Contract {
    /**
     * tells the id.
     */
    private Long id;
    /**
     * tells the rent amount.
     */
    private Double rentAmount;
    /**
     * tells the unique account number.
     */
    private String uniqueAccountNumber;
    /**
     * tells the verification pin.
     */
    private String verificationPin;

    /**
     * tells the start date.
     */
    private LocalDate startDate;
    /**
     * tells the end date.
     */
    private LocalDate endDate;

    /**
     * tells the customer preferred payment plan dates json.
     */
    private String customerPreferredPaymentPlanDatesJson;
    /**
     * tells the pause customer date.
     */
    private Date pauseCustomerDate;
    /**
     * tells the created by value.
     */
    private Long createdBy;
    /**
     * tells the updated by value.
     */
    private Long updatedBy;

    /**
     * tells the status.
     */
    private Integer status;
    /**
     * tells the is deleted value.
     */
    private Integer isDeleted;
    /**
     * reference id of subentity.
     */
    private String referenceId;
    /**
     * tells the account id.
     */
    private Long accountId;
    /**
     * tells the customer id.
     */
    private Long customerId;
    /**
     * tells the unit id.
     */
    private Long unitId;
    /**
     * tells the customer preffered payment plan id.
     */
    private Long customerPreferredPaymentPlanId;
    /**
     * tells the customerPreferredBankAccountId.
     */
    private Long customerPreferredBankAccountId;
    /**
     * tells the customerPreferredGlobalPaymentId.
     */
    private Long customerPreferredGlobalPaymentId;

    /**
     * tells the provider id.
     */
    private Integer providerId;

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
     * @return Long Integer
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
     * gets the unique account number.
     *
     * @return String
     */
    public String getUniqueAccountNumber() {
        return uniqueAccountNumber;
    }

    /**
     * sets the unique account number.
     *
     * @param uniqueAccountNumber
     */
    public void setUniqueAccountNumber(final String uniqueAccountNumber) {
        this.uniqueAccountNumber = uniqueAccountNumber;
    }

    /**
     * gets verifiaction pin.
     *
     * @return String
     */
    public String getVerificationPin() {
        return verificationPin;
    }

    /**
     * sets verification pin.
     *
     * @param verificationPin
     */
    public void setVerificationPin(final String verificationPin) {
        this.verificationPin = verificationPin;
    }

    /**
     * gets the start date.
     *
     * @return Date
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * sets the start date.
     *
     * @param startDate
     */
    public void setStartDate(final LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * gets the end date.
     *
     * @return Date
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * sets the end date.
     *
     * @param endDate
     */
    public void setEndDate(final LocalDate endDate) {
        this.endDate = endDate;
    }


    /**
     * gets the Customer Preferred Payment Plan Dates Json.
     *
     * @return String
     */
    public String getCustomerPreferredPaymentPlanDatesJson() {
        return customerPreferredPaymentPlanDatesJson;
    }

    /**
     * sets the Customer Preferred Payment Plan Dates Json.
     *
     * @param customerPreferredPaymentPlanDatesJson
     */
    public void setCustomerPreferredPaymentPlanDatesJson(final String customerPreferredPaymentPlanDatesJson) {
        this.customerPreferredPaymentPlanDatesJson = customerPreferredPaymentPlanDatesJson;
    }

    /**
     * gets the pause customer date.
     *
     * @return Date
     */
    public Date getPauseCustomerDate() {
        return pauseCustomerDate;
    }

    /**
     * sets the pause customer date.
     *
     * @param pauseCustomerDate
     */
    public void setPauseCustomerDate(final Date pauseCustomerDate) {
        this.pauseCustomerDate = pauseCustomerDate;
    }

    /**
     * gets created by value.
     *
     * @return Long Integer
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * sets created by value.
     *
     * @param createdBy
     */
    public void setCreatedBy(final Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * gets updated by value.
     *
     * @return Long Integer
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * sets updated by value.
     *
     * @param updatedBy
     */
    public void setUpdatedBy(final Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * gets the status.
     *
     * @return Integer
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * sets the status.
     *
     * @param status
     */
    public void setStatus(final Integer status) {
        this.status = status;
    }

    /**
     * gets account id.
     *
     * @return Long Integer
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * sets account id.
     *
     * @param accountId
     */
    public void setAccountId(final Long accountId) {
        this.accountId = accountId;
    }

    /**
     * gets customer id.
     *
     * @return Long Integer
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * sets customer id.
     *
     * @param customerId
     */
    public void setCustomerId(final Long customerId) {
        this.customerId = customerId;
    }

    /**
     * gets unit id.
     *
     * @return Long Integer
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
     * gets customer preferred payment plan id.
     *
     * @return Long Integer
     */
    public Long getCustomerPreferredPaymentPlanId() {
        return customerPreferredPaymentPlanId;
    }

    /**
     * sets customer preferred payment plan id.
     *
     * @param customerPreferredPaymentPlanId
     */
    public void setCustomerPreferredPaymentPlanId(final Long customerPreferredPaymentPlanId) {
        this.customerPreferredPaymentPlanId = customerPreferredPaymentPlanId;
    }

    /**
     * gets the customer preferred bank account id.
     *
     * @return Long Integer
     */
    public Long getCustomerPreferredBankAccountId() {
        return customerPreferredBankAccountId;
    }

    /**
     * sets the customer preferred bank account id.
     *
     * @param customerPreferredBankAccountId
     */
    public void setCustomerPreferredBankAccountId(final Long customerPreferredBankAccountId) {
        this.customerPreferredBankAccountId = customerPreferredBankAccountId;
    }

    /**
     * sets the customer preferred global payment id.
     *
     * @return Long Integer
     */
    public Long getCustomerPreferredGlobalPaymentId() {
        return customerPreferredGlobalPaymentId;
    }

    /**
     * sets the customer preferred global payment id.
     *
     * @param customerPreferredGlobalPaymentId
     */
    public void setCustomerPreferredGlobalPaymentId(final Long customerPreferredGlobalPaymentId) {
        this.customerPreferredGlobalPaymentId = customerPreferredGlobalPaymentId;
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
}
