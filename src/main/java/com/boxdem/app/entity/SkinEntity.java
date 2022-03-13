package com.boxdem.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skin")
public class SkinEntity {
	
	@Id
	@Column(name = "skin_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long skinId;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "beneficio")
	private String beneficio;

}
