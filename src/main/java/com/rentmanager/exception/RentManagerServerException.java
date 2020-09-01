package com.rentmanager.exception;

public class RentManagerServerException extends RentManagerException {

    private String developerMessage;
    private Long errorCode;
    private String userMessage;
    private String moreInfoUri;
    private String exception;
    private String details;
    private String innerException;

  public RentManagerServerException(final String developerMessage, final String userMessage, final Long errorCode,
            final String moreInfoUri, final String exception, final String details, final String innerException) {
      super(developerMessage, null);
      this.developerMessage = developerMessage;
      this.userMessage = userMessage;
      this.errorCode = errorCode;
      this.moreInfoUri = moreInfoUri;
      this.exception = exception;
      this.details = details;
      this.innerException = innerException;
    }

    public String getDeveloperMessage() {
      return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
      this.developerMessage = developerMessage;
    }

    public Long getErrorCode() {
      return errorCode;
    }

    public void setErrorCode(Long errorCode) {
      this.errorCode = errorCode;
    }

    public String getUserMessage() {
      return userMessage;
    }

    public void setUserMessage(String userMessage) {
      this.userMessage = userMessage;
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

}