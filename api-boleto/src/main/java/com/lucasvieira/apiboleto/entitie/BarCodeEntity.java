package com.lucasvieira.apiboleto.entitie;

import com.lucasvieira.apiboleto.entitie.enums.BarCodeSituation;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tb_bar_code")
public class BarCodeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String barCode;

    private BarCodeSituation barCodeSituation;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

}
