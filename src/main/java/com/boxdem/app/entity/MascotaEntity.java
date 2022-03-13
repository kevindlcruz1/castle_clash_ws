package com.boxdem.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mascotas")
public class MascotaEntity {

	@Id
	@Column(name = "mascotas_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long mascotasId;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "habilidad")
	private String habilidad;
	
	@Column(name = "nivel_habilidad")
	private int nivel_habilidad;
	
	@OneToOne(mappedBy = "mascota")
    private HeroeEntity heroe;

	public long getMascotasId() {
		return mascotasId;
	}

	public void setMascotasId(long mascotasId) {
		this.mascotasId = mascotasId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public int getNivel_habilidad() {
		return nivel_habilidad;
	}

	public void setNivel_habilidad(int nivel_habilidad) {
		this.nivel_habilidad = nivel_habilidad;
	}

	public HeroeEntity getHeroe() {
		return heroe;
	}

	public void setHeroe(HeroeEntity heroe) {
		this.heroe = heroe;
	}
	
	
	
}
