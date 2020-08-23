package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


public class PropertyManagementFeeSetup {

    @JsonProperty("PropertyManagementFeeSetupID")
    public Integer propertyManagementFeeSetupID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("ManagementFeeSetupID")
    public Integer managementFeeSetupID;
    @JsonProperty("ActiveStartDate")
    public String activeStartDate;
    @JsonProperty("CreateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;

}