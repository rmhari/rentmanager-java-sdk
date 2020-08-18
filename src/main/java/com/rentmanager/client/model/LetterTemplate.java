package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LetterTemplate {

    @JsonProperty("LetterTemplateID")
    public Integer letterTemplateID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("LetterTemplateType")
    public String letterTemplateType;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Token")
    public String token;
    @JsonProperty("IsAllUsers")
    public Boolean isAllUsers;
    @JsonProperty("RecordsPerPage")
    public Integer recordsPerPage;
    @JsonProperty("ScriptBeforeMerge")
    public String scriptBeforeMerge;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("VPOToAddress")
    public String vPOToAddress;
    @JsonProperty("VPOFromAddress")
    public String vPOFromAddress;
    @JsonProperty("SortOrder")
    public Integer sortOrder;

}