package com.rentmanager.client.model;

import java.beans.JavaBean;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@JavaBean(defaultProperty = "Locations")
public class Location {

    @JsonProperty("LocationID")
    public Integer locationID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("FriendlyName")
    public String friendlyName;
    @JsonProperty("LocationSortOrder")
    public List<Object> locationSortOrder = null;

}