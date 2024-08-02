package com.shop.demoshop.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ruedas {
    private int medida;
    private Dureza dureza;


}
