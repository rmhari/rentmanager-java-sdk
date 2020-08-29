package com.rentmanager.exception;

import java.util.Map;

public class RentManagerException extends Exception {

    private Integer responseCode;
    private String developerMessage;
    private String userMessage;
    private Long errorCode;
    private String moreInfoUri;
    private String exception;
    private String details;
    private String innerException;
    private Map<String, Object> additionalData;

    public RentManagerException(String message, Throwable cause) {
        super(message, cause);
    }

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

    public RentManagerException(Integer responseCode, String developerMessage, String userMessage, Long errorCode, String moreInfoUri, String exception, String details, String innerException, Map<String, Object> additionalData) {
        super(userMessage);
        this.responseCode = responseCode;
        this.developerMessage = developerMessage;
        this.userMessage = userMessage;
        this.errorCode = errorCode;
        this.moreInfoUri = moreInfoUri;
        this.exception = exception;
        this.details = details;
        this.innerException = innerException;
        this.additionalData = additionalData;
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