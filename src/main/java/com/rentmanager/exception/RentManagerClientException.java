package com.rentmanager.exception;

public class RentManagerClientException extends RentManagerException{

    private final ModelState modelState;
    
    public RentManagerClientException(String message, ModelState modelState) {
        super(message, null);
        this.modelState = modelState;
    }

    public static class ModelState {
        private String[] fields;

        public ModelState(String[] fields) {
        this.fields = fields;
        }
    }    
}