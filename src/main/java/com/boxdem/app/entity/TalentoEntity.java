package com.boxdem.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "talentos")
public class TalentoEntity {

	@Column(name = "talento_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long talentoId;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "icono")
	private String icono;
	
}
