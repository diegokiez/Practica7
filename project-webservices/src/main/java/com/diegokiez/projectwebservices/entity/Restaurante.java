package com.diegokiez.projectwebservices.entity;

public class Restaurante {
	private Long idRestaurante;
	private String nombre;
	private String direccion;
	private String slogan;

	public Long getIdRestaurante() {
		return idRestaurante;
	}
	
	public void setIdRestaurante(Long idRestaurante) {
		this.idRestaurante = idRestaurante;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getSlogan() {
		return slogan;
	}
	
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
}
