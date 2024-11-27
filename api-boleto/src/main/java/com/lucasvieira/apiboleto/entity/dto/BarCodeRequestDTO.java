package com.lucasvieira.apiboleto.entity.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BarCodeRequestDTO {

    @NotNull(message = "BarCode not be null")
    @NotEmpty(message = "BarCode is required")
    private String barCode;
}
