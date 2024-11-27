package com.lucasvieira.apiboleto.controller;

import com.lucasvieira.apiboleto.entity.dto.BarCodeDTO;
import com.lucasvieira.apiboleto.entity.dto.BarCodeRequestDTO;
import com.lucasvieira.apiboleto.service.BarCodeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/barcode")
public class BarCodeController {

    private final BarCodeService barCodeService;

    public BarCodeController(BarCodeService barCodeService) {
        this.barCodeService = barCodeService;
    }

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody BarCodeRequestDTO barCodeRequestDTO) {
        BarCodeDTO barCodeDto = barCodeService.save(barCodeRequestDTO.getBarCode());
        return new ResponseEntity<>(barCodeDto, HttpStatus.CREATED);
    }

}
