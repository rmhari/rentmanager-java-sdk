package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUser {
    @JsonProperty("UserID")
    public Integer userID;
    @JsonProperty("MainLocationUserID")
    public Integer mainLocationUserID;
    @JsonProperty("Username")
    public String username;
    @JsonProperty("Lastname")
    public String lastname;
    @JsonProperty("Firstname")
    public String firstname;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("IsActive")
    public Boolean isActive;
    @JsonProperty("IsAdmin")
    public Boolean isAdmin;
    @JsonProperty("IsStrongPassword")
    public Boolean isStrongPassword;
    @JsonProperty("Email")
    public String email;
    @JsonProperty("LockoutDate")
    public String lockoutDate;
    @JsonProperty("LastPasswordChangeDate")
    public String lastPasswordChangeDate;
    @JsonProperty("PhoneSystemExtension")
    public String phoneSystemExtension;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("DefaultLocationID")
    public Integer defaultLocationID;
}