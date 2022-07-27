package com.cmc.rest.entidades;

public class Persona {
	private String nombre;
	private String cedula;
	private String apellido;
	
	public Persona(){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Persona(String nombre, String cedula, String apellido) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", cedula=" + cedula + ", apellido=" + apellido + "]";
	}
	
	
	
	
	
	
	

}
