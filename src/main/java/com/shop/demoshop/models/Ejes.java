package com.shop.demoshop.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Ejes {

    @Column(name = "anchura" , nullable = false)
    private int anchura;
    @Column(name = "material", nullable = false)
    private String material;
    @Column(name = "marca", nullable = false)
    private String marca;
    @Column(name="color", nullable = false)
    private String color;

    // Public constructor
    public Ejes(){
        super();
    }

    public Ejes(int anchura,String material, String marca, String color){
        this.anchura = anchura;
        this.color = color;
        this.marca = marca;
        this.material = material;
    }

}
