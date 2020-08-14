package com.rentmanager.client.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
private Integer contactID;
@JsonProperty("FirstName")
private String firstName;
@JsonProperty("LastName")
private String lastName;
@JsonProperty("MiddleName")
private String middleName;
@JsonProperty("IsPrimary")
private Boolean isPrimary;
@JsonProperty("FederalTaxID")
private String federalTaxID;
@JsonProperty("Comment")
private String comment;
@JsonProperty("Email")
private String email;
@JsonProperty("License")
private String license;
@JsonProperty("Vehicle")
private String vehicle;
@JsonProperty("IsShowOnBill")
private Boolean isShowOnBill;
@JsonProperty("Employer")
private String employer;
@JsonProperty("ApplicantType")
private String applicantType;
@JsonProperty("CreateDate")
private String createDate;
@JsonProperty("CreateUserID")
private Integer createUserID;
@JsonProperty("UpdateDate")
private String updateDate;
@JsonProperty("AnnualIncome")
private Double annualIncome;
@JsonProperty("UpdateUserID")
private Integer updateUserID;
@JsonProperty("ParentID")
private Integer parentID;
@JsonProperty("ParentType")
private String parentType;
@JsonProperty("PhoneNumbers")
@Valid
private List<PhoneNumber> phoneNumbers = null;
@JsonProperty("Addresses")
@Valid
private List<Address> addresses = null;
@JsonIgnore
@Valid
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("ContactID")
public Integer getContactID() {
return contactID;
}

@JsonProperty("ContactID")
public void setContactID(Integer contactID) {
this.contactID = contactID;
}

@JsonProperty("FirstName")
public String getFirstName() {
return firstName;
}

@JsonProperty("FirstName")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("LastName")
public String getLastName() {
return lastName;
}

@JsonProperty("LastName")
public void setLastName(String lastName) {
this.lastName = lastName;
}

@JsonProperty("MiddleName")
public String getMiddleName() {
return middleName;
}

@JsonProperty("MiddleName")
public void setMiddleName(String middleName) {
this.middleName = middleName;
}

@JsonProperty("IsPrimary")
public Boolean getIsPrimary() {
return isPrimary;
}

@JsonProperty("IsPrimary")
public void setIsPrimary(Boolean isPrimary) {
this.isPrimary = isPrimary;
}

@JsonProperty("FederalTaxID")
public String getFederalTaxID() {
return federalTaxID;
}

@JsonProperty("FederalTaxID")
public void setFederalTaxID(String federalTaxID) {
this.federalTaxID = federalTaxID;
}

@JsonProperty("Comment")
public String getComment() {
return comment;
}

@JsonProperty("Comment")
public void setComment(String comment) {
this.comment = comment;
}

@JsonProperty("Email")
public String getEmail() {
return email;
}

@JsonProperty("Email")
public void setEmail(String email) {
this.email = email;
}

@JsonProperty("License")
public String getLicense() {
return license;
}

@JsonProperty("License")
public void setLicense(String license) {
this.license = license;
}

@JsonProperty("Vehicle")
public String getVehicle() {
return vehicle;
}

@JsonProperty("Vehicle")
public void setVehicle(String vehicle) {
this.vehicle = vehicle;
}

@JsonProperty("IsShowOnBill")
public Boolean getIsShowOnBill() {
return isShowOnBill;
}

@JsonProperty("IsShowOnBill")
public void setIsShowOnBill(Boolean isShowOnBill) {
this.isShowOnBill = isShowOnBill;
}

@JsonProperty("Employer")
public String getEmployer() {
return employer;
}

@JsonProperty("Employer")
public void setEmployer(String employer) {
this.employer = employer;
}

@JsonProperty("ApplicantType")
public String getApplicantType() {
return applicantType;
}

@JsonProperty("ApplicantType")
public void setApplicantType(String applicantType) {
this.applicantType = applicantType;
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

@JsonProperty("AnnualIncome")
public Double getAnnualIncome() {
return annualIncome;
}

@JsonProperty("AnnualIncome")
public void setAnnualIncome(Double annualIncome) {
this.annualIncome = annualIncome;
}

@JsonProperty("UpdateUserID")
public Integer getUpdateUserID() {
return updateUserID;
}

@JsonProperty("UpdateUserID")
public void setUpdateUserID(Integer updateUserID) {
this.updateUserID = updateUserID;
}

@JsonProperty("ParentID")
public Integer getParentID() {
return parentID;
}

@JsonProperty("ParentID")
public void setParentID(Integer parentID) {
this.parentID = parentID;
}

@JsonProperty("ParentType")
public String getParentType() {
return parentType;
}

@JsonProperty("ParentType")
public void setParentType(String parentType) {
this.parentType = parentType;
}

@JsonProperty("PhoneNumbers")
public List<PhoneNumber> getPhoneNumbers() {
return phoneNumbers;
}

@JsonProperty("PhoneNumbers")
public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
this.phoneNumbers = phoneNumbers;
}

@JsonProperty("Addresses")
public List<Address> getAddresses() {
return addresses;
}

@JsonProperty("Addresses")
public void setAddresses(List<Address> addresses) {
this.addresses = addresses;
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