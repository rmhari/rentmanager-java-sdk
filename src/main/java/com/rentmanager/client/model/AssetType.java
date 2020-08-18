package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "AssetTypes")
public class AssetType {

    @JsonProperty("AssetTypeID")
    public Integer assetTypeID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;

}