package com.lucasvieira.apiboleto.repository;

import com.lucasvieira.apiboleto.entity.BarCodeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BarCodeRepository extends CrudRepository<BarCodeEntity, Long> {

    Optional<BarCodeEntity> findBarCodeEntityByBarCode(String barCode);
}
