package com.hak.mygarden.exception;

public class ResourceNotFoundException extends Exception{
    public ResourceNotFoundException(){
        super("ERROR: The Resource you are trying to access cannot be found [or] does not exist.");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
