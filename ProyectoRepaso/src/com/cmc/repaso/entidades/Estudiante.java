package com.cmc.repaso.entidades;

public class Estudiante {
private String nombre;
private boolean nota;
private String resultado;

public Estudiante(String nombre) {
	//super();
	this.nombre = nombre;
}
public void calificar(int nota){
	if (nota < 8){
		resultado="F";
	}else{
		resultado="A";
	}
	System.out.println(resultado);
}



}
