package com.boxdem.app.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@ToString

public class HabilidadesDTO {

	private String nombre;
	private String descripcion;
	private String icono;
	
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
	public String getIcono() {
		return icono;
	}
	public void setIcono(String icono) {
		this.icono = icono;
	}
	@Override
	public String toString() {
		return "HabilidadesDTO [nombre=" + nombre + ", descripcion=" + descripcion + ", icono=" + icono + "]";
	}
	
}
