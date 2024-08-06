package com.shop.demoshop.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Skate {
    @Id
    private Long id_skate;
    @Column(name = "ejes", nullable = false)
    private Ejes ejes;
    @Column(name = "tabla", nullable = false)
    private Tabla tabla;
    @Column(name = "lija", nullable = false)
    private Lija lija;
    @Column(name = "ruedas", nullable = false)
    private Ruedas ruedas;
    @Column(name = "rodamientos", nullable = false)
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
