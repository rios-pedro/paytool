package com.pedrodev.paytool.com.pedrodev.paytool.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }

}
