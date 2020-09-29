package com.hak.mygarden.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
    public ResourceNotFoundException(){
        super("ERROR: The Resource you are trying to access cannot be found [or] does not exist.");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
