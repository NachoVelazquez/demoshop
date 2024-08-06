package com.shop.demoshop.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lija {
    @Id
    private int id;
    @Column(name = "marca", nullable = false)
    private Marcas marca;
    @Column(name = "abrasion", nullable = false)
    private Abrasion abrasion;
}
