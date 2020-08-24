package com.rentmanager.client.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EnumSource {

    @JsonProperty("EnumSource")
    public String enumSource;
    @JsonProperty("ValuesToExclude")
    public List<String> valuesToExclude = null;

}