package com.clearminds.componentes;

public class Producto {
private String nombre;
private String codigo;
private double precio;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public Producto(String codigo,String nombre,  double precio) {
	super();
	this.nombre = nombre;
	this.precio = precio;
	this.codigo = codigo;
}

public void incrementarPrecio(int porcentaje){
	precio = precio+Double.valueOf(porcentaje)/100;
}
public void disminuirPrecio(double descuento){
	precio= precio-descuento;
}

}
