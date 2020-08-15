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
"AddressID",
"AddressTypeID",
"Address",
"Street",
"City",
"State",
"PostalCode",
"IsPrimary",
"ParentID",
"ParentType"
})
public class Address {

@JsonProperty("AddressID")
private Integer addressID;
@JsonProperty("AddressTypeID")
private Integer addressTypeID;
@JsonProperty("Address")
private String address;
@JsonProperty("Street")
private String street;
@JsonProperty("City")
private String city;
@JsonProperty("State")
private String state;
@JsonProperty("PostalCode")
private String postalCode;
@JsonProperty("IsPrimary")
private Boolean isPrimary;
@JsonProperty("ParentID")
private Integer parentID;
@JsonProperty("ParentType")
private String parentType;
@JsonIgnore
@Valid
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("AddressID")
public Integer getAddressID() {
return addressID;
}

@JsonProperty("AddressID")
public void setAddressID(Integer addressID) {
this.addressID = addressID;
}

@JsonProperty("AddressTypeID")
public Integer getAddressTypeID() {
return addressTypeID;
}

@JsonProperty("AddressTypeID")
public void setAddressTypeID(Integer addressTypeID) {
this.addressTypeID = addressTypeID;
}

@JsonProperty("Address")
public String getAddress() {
return address;
}

@JsonProperty("Address")
public void setAddress(String address) {
this.address = address;
}

@JsonProperty("Street")
public String getStreet() {
return street;
}

@JsonProperty("Street")
public void setStreet(String street) {
this.street = street;
}

@JsonProperty("City")
public String getCity() {
return city;
}

@JsonProperty("City")
public void setCity(String city) {
this.city = city;
}

@JsonProperty("State")
public String getState() {
return state;
}

@JsonProperty("State")
public void setState(String state) {
this.state = state;
}

@JsonProperty("PostalCode")
public String getPostalCode() {
return postalCode;
}

@JsonProperty("PostalCode")
public void setPostalCode(String postalCode) {
this.postalCode = postalCode;
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
