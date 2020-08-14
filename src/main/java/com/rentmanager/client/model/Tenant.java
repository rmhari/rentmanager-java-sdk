package com.rentmanager.client.model;


import java.beans.JavaBean;
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
@JavaBean(defaultProperty = "Tenants")

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"TenantID",
"TenantDisplayID",
"Name",
"FirstName",
"LastName",
"WebMessage",
"Comment",
"RentDueDay",
"RentPeriod",
"PropertyID",
"PostingStartDate",
"CreateDate",
"CreateUserID",
"UpdateDate",
"UpdateUserID",
"Contacts",
"PrimaryContact",
"Status"
})
public class Tenant {

@JsonProperty("TenantID")
private Integer tenantID;
@JsonProperty("TenantDisplayID")
private Integer tenantDisplayID;
@JsonProperty("Name")
private String name;
@JsonProperty("FirstName")
private String firstName;
@JsonProperty("LastName")
private String lastName;
@JsonProperty("WebMessage")
private String webMessage;
@JsonProperty("Comment")
private String comment;
@JsonProperty("RentDueDay")
private Integer rentDueDay;
@JsonProperty("RentPeriod")
private String rentPeriod;
@JsonProperty("PropertyID")
private Integer propertyID;
@JsonProperty("PostingStartDate")
private String postingStartDate;
@JsonProperty("CreateDate")
private String createDate;
@JsonProperty("CreateUserID")
private Integer createUserID;
@JsonProperty("UpdateDate")
private String updateDate;
@JsonProperty("UpdateUserID")
private Integer updateUserID;
@JsonProperty("Contacts")
@Valid
private List<Contact> contacts = null;
@JsonProperty("PrimaryContact")
@Valid
private PrimaryContact primaryContact;
@JsonProperty("Status")
private String status;
@JsonIgnore
@Valid
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("TenantID")
public Integer getTenantID() {
return tenantID;
}

@JsonProperty("TenantID")
public void setTenantID(Integer tenantID) {
this.tenantID = tenantID;
}

@JsonProperty("TenantDisplayID")
public Integer getTenantDisplayID() {
return tenantDisplayID;
}

@JsonProperty("TenantDisplayID")
public void setTenantDisplayID(Integer tenantDisplayID) {
this.tenantDisplayID = tenantDisplayID;
}

@JsonProperty("Name")
public String getName() {
return name;
}

@JsonProperty("Name")
public void setName(String name) {
this.name = name;
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

@JsonProperty("WebMessage")
public String getWebMessage() {
return webMessage;
}

@JsonProperty("WebMessage")
public void setWebMessage(String webMessage) {
this.webMessage = webMessage;
}

@JsonProperty("Comment")
public String getComment() {
return comment;
}

@JsonProperty("Comment")
public void setComment(String comment) {
this.comment = comment;
}

@JsonProperty("RentDueDay")
public Integer getRentDueDay() {
return rentDueDay;
}

@JsonProperty("RentDueDay")
public void setRentDueDay(Integer rentDueDay) {
this.rentDueDay = rentDueDay;
}

@JsonProperty("RentPeriod")
public String getRentPeriod() {
return rentPeriod;
}

@JsonProperty("RentPeriod")
public void setRentPeriod(String rentPeriod) {
this.rentPeriod = rentPeriod;
}

@JsonProperty("PropertyID")
public Integer getPropertyID() {
return propertyID;
}

@JsonProperty("PropertyID")
public void setPropertyID(Integer propertyID) {
this.propertyID = propertyID;
}

@JsonProperty("PostingStartDate")
public String getPostingStartDate() {
return postingStartDate;
}

@JsonProperty("PostingStartDate")
public void setPostingStartDate(String postingStartDate) {
this.postingStartDate = postingStartDate;
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

@JsonProperty("Contacts")
public List<Contact> getContacts() {
return contacts;
}

@JsonProperty("Contacts")
public void setContacts(List<Contact> contacts) {
this.contacts = contacts;
}

@JsonProperty("PrimaryContact")
public PrimaryContact getPrimaryContact() {
return primaryContact;
}

@JsonProperty("PrimaryContact")
public void setPrimaryContact(PrimaryContact primaryContact) {
this.primaryContact = primaryContact;
}

@JsonProperty("Status")
public String getStatus() {
return status;
}

@JsonProperty("Status")
public void setStatus(String status) {
this.status = status;
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
