package com.lucasvieira.apiboleto.entity.dto;

import com.lucasvieira.apiboleto.entity.enums.BarCodeSituation;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BarCodeDTO {

    private String barCode;
    private BarCodeSituation barCodeSituation;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
