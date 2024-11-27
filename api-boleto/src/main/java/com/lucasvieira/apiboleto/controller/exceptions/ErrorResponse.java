package com.lucasvieira.apiboleto.controller.exceptions;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
public class ErrorResponse {

    private String message;
    private Integer code;
    private Date timestamp;
    private String path;
}
