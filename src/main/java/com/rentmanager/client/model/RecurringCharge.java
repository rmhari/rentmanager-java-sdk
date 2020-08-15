package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "RecurringChargeID",
        "EntityType",
        "EntityKeyID",
        "UnitID",
        "Frequency",
        "ChargeTypeID",
        "Amount",
        "Comment",
        "FromDate",
        "ToDate",
        "Calculation",
        "SortOrder",
        "CreateDate",
        "CreateUserID",
        "UpdateDate",
        "UpdateUserID",
        "ChargeType"
})
public class RecurringCharge {

    @JsonProperty("RecurringChargeID")
    public Integer recurringChargeID;
    @JsonProperty("EntityType")
    public String entityType;
    @JsonProperty("EntityKeyID")
    public Integer entityKeyID;
    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("Frequency")
    public Integer frequency;
    @JsonProperty("ChargeTypeID")
    public Integer chargeTypeID;
    @JsonProperty("Amount")
    public Float amount;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("FromDate")
    public String fromDate;
    @JsonProperty("ToDate")
    public String toDate;
    @JsonProperty("Calculation")
    public String calculation;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ChargeType")
    public ChargeType chargeType;

}
