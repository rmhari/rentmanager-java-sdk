
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"PhoneNumberID",
"PhoneNumberTypeID",
"PhoneNumber",
"Extension",
"StrippedPhoneNumber",
"IsPrimary",
"ParentID",
"ParentType"
})
public class PhoneNumber_ {

@JsonProperty("PhoneNumberID")
private Integer phoneNumberID;
@JsonProperty("PhoneNumberTypeID")
private Integer phoneNumberTypeID;
@JsonProperty("PhoneNumber")
private String phoneNumber;
@JsonProperty("Extension")
private String extension;
@JsonProperty("StrippedPhoneNumber")
private String strippedPhoneNumber;
@JsonProperty("IsPrimary")
private Boolean isPrimary;
@JsonProperty("ParentID")
private Integer parentID;
@JsonProperty("ParentType")
private String parentType;
@JsonIgnore
@Valid
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("PhoneNumberID")
public Integer getPhoneNumberID() {
return phoneNumberID;
}

@JsonProperty("PhoneNumberID")
public void setPhoneNumberID(Integer phoneNumberID) {
this.phoneNumberID = phoneNumberID;
}

@JsonProperty("PhoneNumberTypeID")
public Integer getPhoneNumberTypeID() {
return phoneNumberTypeID;
}

@JsonProperty("PhoneNumberTypeID")
public void setPhoneNumberTypeID(Integer phoneNumberTypeID) {
this.phoneNumberTypeID = phoneNumberTypeID;
}

@JsonProperty("PhoneNumber")
public String getPhoneNumber() {
return phoneNumber;
}

@JsonProperty("PhoneNumber")
public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}

@JsonProperty("Extension")
public String getExtension() {
return extension;
}

@JsonProperty("Extension")
public void setExtension(String extension) {
this.extension = extension;
}

@JsonProperty("StrippedPhoneNumber")
public String getStrippedPhoneNumber() {
return strippedPhoneNumber;
}

@JsonProperty("StrippedPhoneNumber")
public void setStrippedPhoneNumber(String strippedPhoneNumber) {
this.strippedPhoneNumber = strippedPhoneNumber;
}

@JsonProperty("IsPrimary")
public Boolean getIsPrimary() {
return isPrimary;
}

@JsonProperty("IsPrimary")
public void setIsPrimary(Boolean isPrimary) {
this.isPrimary = isPrimary;
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

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}