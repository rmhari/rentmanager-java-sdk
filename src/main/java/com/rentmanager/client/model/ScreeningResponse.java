package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ScreeningResponseID",
        "ScreeningID",
        "ContactID",
        "Agency",
        "Score",
        "ScoreDate",
        "RangeMinimum",
        "RangeMaximum",
        "CreateUserID",
        "CreateDate",
        "UpdateUserID",
        "UpdateDate",
        "ConcurrencyID",
        "ScreeningResponseFactors"
})
public class ScreeningResponse {

    @JsonProperty("ScreeningResponseID")
    public Integer screeningResponseID;
    @JsonProperty("ScreeningID")
    public Integer screeningID;
    @JsonProperty("ContactID")
    public Integer contactID;
    @JsonProperty("Agency")
    public String agency;
    @JsonProperty("Score")
    public Integer score;
    @JsonProperty("ScoreDate")
    public String scoreDate;
    @JsonProperty("RangeMinimum")
    public Integer rangeMinimum;
    @JsonProperty("RangeMaximum")
    public Integer rangeMaximum;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("ScreeningResponseFactors")
    public List<ScreeningResponseFactor> screeningResponseFactors = null;

}