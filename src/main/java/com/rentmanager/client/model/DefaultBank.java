package com.rentmanager.client.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DefaultBank {

    @JsonProperty("GLAccountID")
    public Integer gLAccountID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Reference")
    public String reference;
    @JsonProperty("GLAccountType")
    public String gLAccountType;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("ChildGLAccounts")
    public List<Object> childGLAccounts = null;

}