package com.boxdem.app.dto;

public class SkinDTO {
	
	private String nombre;
	private String descripcion;
	private String beneficio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}
	@Override
	public String toString() {
		return "SkinDTO [nombre=" + nombre + ", descripcion=" + descripcion + ", beneficio=" + beneficio + "]";
	}

}
