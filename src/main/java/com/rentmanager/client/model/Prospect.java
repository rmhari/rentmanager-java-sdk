package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ProspectStatus")
    public String prospectStatus;
    @JsonProperty("ProspectLostReasonDescription")
    public String prospectLostReasonDescription;
    @JsonProperty("LastStatusChangedDate")
    public String lastStatusChangedDate;
    @JsonProperty("FirstContact")
    public String firstContact;
    @JsonProperty("LastHistoryItem")
    public String lastHistoryItem;

}