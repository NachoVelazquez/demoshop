package com.shop.demoshop.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Rodamientos {
    @Id
    private int id_rodam;
    @Column(name = "categoria", nullable = false)
    private Categoria categoria;
    @Column(name = "marca", nullable = false)
    private Marcas marca;

}
