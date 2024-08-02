package com.shop.demoshop.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Skate {

    private Ejes ejes;
    private Tabla tabla;
    private Lija lija;
    private Ruedas ruedas;
    private Rodamientos rodamientos;


    public Skate() {
        super();
    }

    public Skate(Ejes ejes, Tabla tabla, Lija lija, Ruedas ruedas, Rodamientos rodamientos) {
        this.ejes = ejes;
        this.tabla = tabla;
        this.lija = lija;
        this.ruedas = ruedas;
        this.rodamientos = rodamientos;
    }
}
