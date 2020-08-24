package com.rentmanager.client.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationSubApplicantField {

    @JsonProperty("ApplicationSubApplicantFieldID")
    public Integer applicationSubApplicantFieldID;
    @JsonProperty("ApplicationMajorSectionID")
    public Integer applicationMajorSectionID;
    @JsonProperty("ApplicationSubApplicantSetups")
    public List<Object> applicationSubApplicantSetups = null;

}