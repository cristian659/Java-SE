package com.cmc.entidades;

public class Estudiante {
	private String nombre;
	private int edad;
	private String direccion;
	public Estudiante(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getdireccion() {
		return direccion;
	}
	public void setdireccion(String direccion) {
		direccion = direccion;
	}
	public void imprimir (){
		System.out.println("Nombre:"+nombre+"Edad:"+edad+"Direccion:"+direccion);
	}

}
