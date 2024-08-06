package com.shop.demoshop.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tabla {
    @Id
    private int id;
    @Column(name="anchura", nullable= false)
    private float anchura;
    @Column(name="material", nullable= false)
    private String material;
    @Column(name="Fibra_Vidrio", nullable= false)
    private boolean isFibraVidrio;    
}
