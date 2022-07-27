package com.cmc.entidades;

public class Persona {
private String nombre;
private String cedula;
private int edad;

private Direccion direccion;


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

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public Direccion getDireccion() {
	return direccion;
}

public void setDireccion(Direccion direccion) {
	this.direccion = direccion;
}


}
