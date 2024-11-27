package com.lucasvieira.apiboleto.mapper;


import com.lucasvieira.apiboleto.entity.BarCodeEntity;
import com.lucasvieira.apiboleto.entity.dto.BarCodeDTO;

public class BarCodeMapper {

    public static BarCodeDTO toDto(BarCodeEntity barCodeEntity) {
        return BarCodeDTO.builder()
                .barCode(barCodeEntity.getBarCode())
                .barCodeSituation(barCodeEntity.getBarCodeSituation())
                .createdDate(barCodeEntity.getCreatedDate())
                .updatedDate(barCodeEntity.getUpdatedDate())
                .build();
    }

}
