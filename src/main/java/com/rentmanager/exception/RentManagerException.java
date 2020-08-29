package com.rentmanager.exception;

import java.util.Map;

public class RentManagerException extends Exception {

    private String developerMessage;
    private String userMessage;
    private Long errorCode;
    private String moreInfoUri;
    private String exception;
    private String details;
    private String innerException;
    private Map<String, Object> additionalData;

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }

    public String getMoreInfoUri() {
        return moreInfoUri;
    }

    public void setMoreInfoUri(String moreInfoUri) {
        this.moreInfoUri = moreInfoUri;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getInnerException() {
        return innerException;
    }

    public void setInnerException(String innerException) {
        this.innerException = innerException;
    }

    public Map<String, Object> getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(Map<String, Object> additionalData) {
        this.additionalData = additionalData;
    }
  
    
}