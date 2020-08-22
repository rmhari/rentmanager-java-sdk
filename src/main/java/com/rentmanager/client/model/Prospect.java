package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Prospect {

    @JsonProperty("ProspectID")
    public Integer prospectID;
    @JsonProperty("ProspectDisplayID")
    public Integer prospectDisplayID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("WebMessage")
    public String webMessage;
    @JsonProperty("Comment")
    public String comment;
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
    @JsonProperty("ProspectStatus")
    public String prospectStatus;
    @JsonProperty("ProspectLostReasonDescription")
    public String prospectLostReasonDescription;
    @JsonProperty("LastStatusChangedDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date lastStatusChangedDate;
    @JsonProperty("FirstContact")
    public String firstContact;
    @JsonProperty("LastHistoryItem")
    public String lastHistoryItem;

}