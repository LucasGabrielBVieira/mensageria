package com.lucasvieira.apiboleto.controller.exceptions;

public class ApplicationException extends RuntimeException{

    public ApplicationException(String message) {
        super(message);
    }
}
