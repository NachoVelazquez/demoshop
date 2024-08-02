package com.shop.demoshop.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public abstract class Actor {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID")
        private int userId;

        @Column(name = "NOMBRE", nullable = false)
        private String name;

        @Column(name = "APELLIDO1", nullable = false)
        private String surname1;

        @Column(name = "APELLIDO2")
        private String surname2;

        @Column(name = "DNI", nullable = false)
        private String dni;

        @Column(name = "TELEFONO_MOVIL", nullable = false)
        private String mobilePhone;

        @Column(name = "CORREO")
        private String email;

        @Column(name = "FECHA_CREACION", nullable = false)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
        private Date creationDate;
}
