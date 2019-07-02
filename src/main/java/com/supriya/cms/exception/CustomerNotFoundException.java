package com.supriya.cms.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

public class CustomerNotFoundException  extends RuntimeException{
    public CustomerNotFoundException(String message){
        super(message);
    }
}
