package com.cmc.entidades;

import java.util.ArrayList;

public class Contacto {
private String cedula; 
private String nombre;
private String apellid;
ArrayList<Telefono> telefonos = new ArrayList<Telefono>();

public Contacto(String cedula, String nombre, String apellid) {
	super();
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellid = apellid;
}

public String getCedula() {
	return cedula;
}
public void setCedula(String cedula) {
	this.cedula = cedula;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellid() {
	return apellid;
}
public void setApellid(String apellid) {
	this.apellid = apellid;
}

@Override
public String toString() {
	return "Contacto [cedula=" + cedula + ", nombre=" + nombre + ", apellid=" + apellid + ", telefonos=" + telefonos
			+ "]";
}

public void agregarTelefono(Telefono telefono){
	telefonos.add(telefono);
}
}
