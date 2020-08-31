package com.rentmanager.exception;

public class RentManagerServerException extends RentManagerException {

    public RentManagerServerException(final String developerMessage, final String userMessage, final Long errorCode,
            final String moreInfoUri, final String exception, final String details, final String innerException) {
      super(developerMessage, userMessage, errorCode, moreInfoUri, exception, details, innerException);
    }


}