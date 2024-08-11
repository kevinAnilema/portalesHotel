package com.tuempresa.hotel.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Huesped {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Integer idHuesped;

    @Column(length = 45)
    private String nombre;

    @Column(length = 45)
    private String cedula;

    @Column(length = 45)
    private String email;

    @Column(length = 45)
    private String telefono;

}
