package com.boxdem.app.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@ToString
public class HeroeDTO {

	private String nombre;
	private String equipamiento;
	private String pinaculo;
	private MascotaDTO mascota;
	private HabilidadesDTO habilidad;
	
	private  List<TalentosDTO>talentos = new ArrayList<TalentosDTO>();
	
	private List<SkinDTO> skin = new ArrayList<SkinDTO>();
	
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

	public String getPinaculo() {
		return pinaculo;
	}
	public void setPinaculo(String pinaculo) {
		this.pinaculo = pinaculo;
	}
	
	public HabilidadesDTO getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(HabilidadesDTO habilidad) {
		this.habilidad = habilidad;
	}
	public List<TalentosDTO> getTalentos() {
		return talentos;
	}
	public void setTalentos(List<TalentosDTO> talentos) {
		this.talentos = talentos;
	}
	public List<SkinDTO> getSkin() {
		return skin;
	}
	public void setSkin(List<SkinDTO> skin) {
		this.skin = skin;
	}
	
	public MascotaDTO getMascota() {
		return mascota;
	}
	public void setMascota(MascotaDTO mascota) {
		this.mascota = mascota;
	}
	@Override
	public String toString() {
		return "HeroeDTO [nombre=" + nombre + ", equipamiento=" + equipamiento + ", pinaculo=" + pinaculo
				+ ", habilidad=" + habilidad + ", talentos=" + talentos + ", skin=" + skin + "]";
	}

		
	
}
