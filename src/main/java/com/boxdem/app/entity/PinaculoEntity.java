package com.boxdem.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pinaculos")
public class PinaculoEntity {
	
	
	@Id
	@Column(name = "pinaculo_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long pinaculoId;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "icono")
	private String icono;

}
