package com.shop.demoshop.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tabla {
    @Column(name="anchura", nullable= false)
    private int anchura;
    
    @Column(name="material", nullable= false)
    private String material;
    @Column(name="Fibra_Vidrio", nullable= false)
    private boolean isFibraVidrio;    
}
