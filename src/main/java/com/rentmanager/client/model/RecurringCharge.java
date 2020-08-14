package com.rentmanager.client.model;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JavaBean(defaultProperty = "RecurringCharges" )

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"RecurringChargeID",
"EntityType",
"EntityKeyID",
"UnitID",
"Frequency",
"ChargeTypeID",
"Amount",
"Comment",
"FromDate",
"ToDate",
"Calculation",
"SortOrder",
"CreateDate",
"CreateUserID",
"UpdateDate",
"UpdateUserID",
"ChargeType"
})
public class RecurringCharge {

@JsonProperty("RecurringChargeID")
private Integer recurringChargeID;
@JsonProperty("EntityType")
private String entityType;
@JsonProperty("EntityKeyID")
private Integer entityKeyID;
@JsonProperty("UnitID")
private Integer unitID;
@JsonProperty("Frequency")
private Integer frequency;
@JsonProperty("ChargeTypeID")
private Integer chargeTypeID;
@JsonProperty("Amount")
private Double amount;
@JsonProperty("Comment")
private String comment;
@JsonProperty("FromDate")
private String fromDate;
@JsonProperty("ToDate")
private String toDate;
@JsonProperty("Calculation")
private String calculation;
@JsonProperty("SortOrder")
private Integer sortOrder;
@JsonProperty("CreateDate")
private String createDate;
@JsonProperty("CreateUserID")
private Integer createUserID;
@JsonProperty("UpdateDate")
private String updateDate;
@JsonProperty("UpdateUserID")
private Integer updateUserID;
@JsonProperty("ChargeType")
@Valid
private ChargeType chargeType;
@JsonIgnore
@Valid
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("RecurringChargeID")
public Integer getRecurringChargeID() {
return recurringChargeID;
}

@JsonProperty("RecurringChargeID")
public void setRecurringChargeID(Integer recurringChargeID) {
this.recurringChargeID = recurringChargeID;
}

@JsonProperty("EntityType")
public String getEntityType() {
return entityType;
}

@JsonProperty("EntityType")
public void setEntityType(String entityType) {
this.entityType = entityType;
}

@JsonProperty("EntityKeyID")
public Integer getEntityKeyID() {
return entityKeyID;
}

@JsonProperty("EntityKeyID")
public void setEntityKeyID(Integer entityKeyID) {
this.entityKeyID = entityKeyID;
}

@JsonProperty("UnitID")
public Integer getUnitID() {
return unitID;
}

@JsonProperty("UnitID")
public void setUnitID(Integer unitID) {
this.unitID = unitID;
}

@JsonProperty("Frequency")
public Integer getFrequency() {
return frequency;
}

@JsonProperty("Frequency")
public void setFrequency(Integer frequency) {
this.frequency = frequency;
}

@JsonProperty("ChargeTypeID")
public Integer getChargeTypeID() {
return chargeTypeID;
}

@JsonProperty("ChargeTypeID")
public void setChargeTypeID(Integer chargeTypeID) {
this.chargeTypeID = chargeTypeID;
}

@JsonProperty("Amount")
public Double getAmount() {
return amount;
}

@JsonProperty("Amount")
public void setAmount(Double amount) {
this.amount = amount;
}

@JsonProperty("Comment")
public String getComment() {
return comment;
}

@JsonProperty("Comment")
public void setComment(String comment) {
this.comment = comment;
}

@JsonProperty("FromDate")
public String getFromDate() {
return fromDate;
}

@JsonProperty("FromDate")
public void setFromDate(String fromDate) {
this.fromDate = fromDate;
}

@JsonProperty("ToDate")
public String getToDate() {
return toDate;
}

@JsonProperty("ToDate")
public void setToDate(String toDate) {
this.toDate = toDate;
}

@JsonProperty("Calculation")
public String getCalculation() {
return calculation;
}

@JsonProperty("Calculation")
public void setCalculation(String calculation) {
this.calculation = calculation;
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

@JsonProperty("CreateUserID")
public Integer getCreateUserID() {
return createUserID;
}

@JsonProperty("CreateUserID")
public void setCreateUserID(Integer createUserID) {
this.createUserID = createUserID;
}

@JsonProperty("UpdateDate")
public String getUpdateDate() {
return updateDate;
}

@JsonProperty("UpdateDate")
public void setUpdateDate(String updateDate) {
this.updateDate = updateDate;
}

@JsonProperty("UpdateUserID")
public Integer getUpdateUserID() {
return updateUserID;
}

@JsonProperty("UpdateUserID")
public void setUpdateUserID(Integer updateUserID) {
this.updateUserID = updateUserID;
}

@JsonProperty("ChargeType")
public ChargeType getChargeType() {
return chargeType;
}

@JsonProperty("ChargeType")
public void setChargeType(ChargeType chargeType) {
this.chargeType = chargeType;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}