package com.aws.docencia.service.exeption;

public class CreateException extends RuntimeException{
    public CreateException(String message){
        super(message);
    }
    public CreateException(String message, Exception cause){
        super(message, cause);
    }
}
