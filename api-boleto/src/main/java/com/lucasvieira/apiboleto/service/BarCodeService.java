package com.lucasvieira.apiboleto.service;


import com.lucasvieira.apiboleto.entity.BarCodeEntity;
import com.lucasvieira.apiboleto.entity.enums.BarCodeSituation;
import com.lucasvieira.apiboleto.repository.BarCodeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class BarCodeService {

    private final BarCodeRepository barCodeRepository;


    public BarCodeService(BarCodeRepository barCodeRepository) {
        this.barCodeRepository = barCodeRepository;
    }

    public void save(String barCode) {
        Optional<BarCodeEntity> barCodeEntity = barCodeRepository.findBarCodeEntityByBarCode(barCode);
        if (barCodeEntity.isPresent()) {
            throw new RuntimeException("Bar code already exists");
        }
        BarCodeEntity entity = BarCodeEntity.builder()
                .barCode(barCode)
                .barCodeSituation(BarCodeSituation.INITIALIZED)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();

        barCodeRepository.save(entity);
    }
}
