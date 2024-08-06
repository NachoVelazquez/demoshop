package com.shop.demoshop.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ruedas {
    @Id
    private Long id_rueda;
    @Column(name = "medida", nullable = false)
    private int medida;
    @Column(name = "dureza", nullable = false)
    private Dureza dureza;


}
