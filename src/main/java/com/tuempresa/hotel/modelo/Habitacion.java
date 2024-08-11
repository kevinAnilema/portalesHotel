package com.tuempresa.hotel.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Habitacion {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Integer idhabitacion;

    @Column
    private Integer numero;

    @ManyToOne
	(fetch=FetchType.LAZY,optional=true)
    @DescriptionsList(descriptionProperties = "tipo")
	private TipoHabitacion tipo;
    
    @Column
    private Double precio;

}
