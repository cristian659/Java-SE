package com.cmc.herencia;

import java.lang.reflect.Constructor;

public class Persona {
private String nombre;
private String apellido;

public Persona(String nombre, String apellido) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
}



}
