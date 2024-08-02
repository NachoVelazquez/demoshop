package com.shop.demoshop.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lija {
    private Marcas marca;
    private Abrasion abrasion;
}
