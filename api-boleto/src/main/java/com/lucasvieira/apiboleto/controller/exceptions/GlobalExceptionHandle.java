package com.lucasvieira.apiboleto.controller.exceptions;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<ErrorResponse> applicationException(ApplicationException e, WebRequest request) {
        ErrorResponse error = ErrorResponse.builder()
                .message(e.getMessage())
                .code(400)
                .timestamp(new Date())
                .path(request.getDescription(false))
                .build();

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> methodArgumentNotValidException(MethodArgumentNotValidException e, WebRequest request) {

        var errors = e.getFieldErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .reduce("", (s1, s2) -> s1 + " " + s2);

        ErrorResponse error = ErrorResponse.builder()
                .message(errors)
                .code(400)
                .timestamp(new Date())
                .path(request.getDescription(false))
                .build();

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
