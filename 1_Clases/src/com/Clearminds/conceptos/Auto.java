package com.Clearminds.conceptos;

public class Auto {
private String marca;
private double precio; 
private int anio;
//constructor
public Auto(String marca, double precio, int anio) {
	//super();
	this.marca = marca;
	this.precio = precio;
	this.anio = anio;
}

public Auto(String marca){
	this.marca=marca;
}

//get and set
public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getAnio() {
	return anio;
}
public void setAnio(int anio) {
	this.anio = anio;
}


}
