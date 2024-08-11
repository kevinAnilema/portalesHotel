package com.tuempresa.hotel.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Reserva {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Integer idreserva;

    @Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
    @Column
    private LocalDate fechaInicio;

    @Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
    @Column
    private LocalDate fechaFin;

    @Column
    private Double total;
    
    @ManyToOne
	(fetch=FetchType.LAZY,optional=true)
	private Huesped huesped;
    
    @ManyToOne
	(fetch=FetchType.LAZY,optional=true)
	private Habitacion habitacion;
}
