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
"PhoneNumberTypeID",
"Name",
"Description",
"SortOrder",
"ParentType"
})
public class PhoneNumberType {

@JsonProperty("PhoneNumberTypeID")
private Integer phoneNumberTypeID;
@JsonProperty("Name")
private String name;
@JsonProperty("Description")
private String description;
@JsonProperty("SortOrder")
private Integer sortOrder;
@JsonProperty("ParentType")
private String parentType;
@JsonIgnore
@Valid
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("PhoneNumberTypeID")
public Integer getPhoneNumberTypeID() {
return phoneNumberTypeID;
}

@JsonProperty("PhoneNumberTypeID")
public void setPhoneNumberTypeID(Integer phoneNumberTypeID) {
this.phoneNumberTypeID = phoneNumberTypeID;
}

@JsonProperty("Name")
public String getName() {
return name;
}

@JsonProperty("Name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("Description")
public String getDescription() {
return description;
}

@JsonProperty("Description")
public void setDescription(String description) {
this.description = description;
}

@JsonProperty("SortOrder")
public Integer getSortOrder() {
return sortOrder;
}

@JsonProperty("SortOrder")
public void setSortOrder(Integer sortOrder) {
this.sortOrder = sortOrder;
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