package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScreeningResponseFactor {

    @JsonProperty("ScreeningResponseFactorID")
    public Integer screeningResponseFactorID;
    @JsonProperty("ScreeningResponseID")
    public Integer screeningResponseID;
    @JsonProperty("Factor")
    public String factor;

}