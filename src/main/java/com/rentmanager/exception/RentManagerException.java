package com.rentmanager.exception;

import java.util.Map;

public class RentManagerException extends Exception {

    public RentManagerException(String message, Throwable cause) {
        super(message, cause);
    }

	public RentManagerException(String developerMessage, String userMessage, Long errorCode, String moreInfoUri,
			String exception, String details, String innerException) {
	}
}