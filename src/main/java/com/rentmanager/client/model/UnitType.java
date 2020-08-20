package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.List;

@JavaBean(defaultProperty = "UnitTypes")
public class UnitType {

    @JsonProperty("UnitTypeID")
    public Integer unitTypeID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("RecurringCharges")
    public List<Object> recurringCharges = null;
    @JsonProperty("RecurringChargeSummaries")
    public List<Object> recurringChargeSummaries = null;
    @JsonProperty("Properties")
    public List<Property> properties = null;
    @JsonProperty("UnitTypeProperties")
    public List<UnitTypeProperty> unitTypeProperties = null;
    @JsonProperty("Units")
    public List<Unit> units = null;
    @JsonProperty("Images")
    public List<Object> images = null;

}