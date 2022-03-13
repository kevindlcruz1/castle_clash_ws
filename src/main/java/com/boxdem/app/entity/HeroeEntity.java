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
@Table(name = "heroes")
public class HeroeEntity {
	
	@Id
	@Column(name = "heroes_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long heroeId;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "equipamiento")
	private String equipamiento;
	 
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mascotas_id", referencedColumnName = "mascotas_id")
    private MascotaEntity mascota;

	public long getHeroeId() {
		return heroeId;
	}

	public void setHeroeId(long heroeId) {
		this.heroeId = heroeId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEquipamiento() {
		return equipamiento;
	}

	public void setEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}

	public MascotaEntity getMascota() {
		return mascota;
	}

	public void setMascota(MascotaEntity mascota) {
		this.mascota = mascota;
	}
	
	

}
