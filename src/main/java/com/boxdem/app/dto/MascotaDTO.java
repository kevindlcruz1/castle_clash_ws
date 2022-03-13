package com.boxdem.app.dto;

public class MascotaDTO {

	private String nombre;
	private String habilidad;
	private int nivelHabilidad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(String habilidadMascota) {
		this.habilidad = habilidadMascota;
	}
	public int getNivelHabilidad() {
		return nivelHabilidad;
	}
	public void setNivelHabilidad(int nivelHabilidad) {
		this.nivelHabilidad = nivelHabilidad;
	}
	@Override
	public String toString() {
		return "MascotaDTO [nombre=" + nombre + ", habilidadMascota=" + habilidad + ", nivelHabilidad="
				+ nivelHabilidad + "]";
	}
	
	
	
}
