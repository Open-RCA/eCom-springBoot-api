package com.openrca.templates.ecomspringboot.exceptions;

public class ApiRequestException  extends RuntimeException{
    public ApiRequestException(String message) {
        super(message);
    }
}