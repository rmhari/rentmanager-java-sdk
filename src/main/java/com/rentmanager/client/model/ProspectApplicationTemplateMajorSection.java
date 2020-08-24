package com.rentmanager.client.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProspectApplicationTemplateMajorSection {

    @JsonProperty("ApplicationMajorSectionID")
    public Integer applicationMajorSectionID;
    @JsonProperty("ApplicationTemplateID")
    public Integer applicationTemplateID;
    @JsonProperty("Title")
    public String title;
    @JsonProperty("Text")
    public String text;
    @JsonProperty("HelpText")
    public String helpText;
    @JsonProperty("IsSystem")
    public Boolean isSystem;
    @JsonProperty("ApplicationMinorSections")
    public List<ApplicationMinorSection> applicationMinorSections = null;
    @JsonProperty("ApplicationSubApplicantField")
    public ApplicationSubApplicantField applicationSubApplicantField;

}