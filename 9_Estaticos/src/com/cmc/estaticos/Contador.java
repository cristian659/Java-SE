package com.cmc.estaticos;

public class Contador {
	private int contadorNormal;
	private static int contadorEstatico;
	private String nombre;
	
	public Contador(String nombre){
		this.nombre=nombre;
	}

	public void incrementar(){
		contadorNormal=contadorNormal+1;
		contadorEstatico=contadorEstatico+1;
	}
	public void imprimir(){
		System.out.println(nombre+" contadorNormal:"+contadorNormal);
		System.out.println(nombre+" contadorEstatico:"+contadorEstatico);
	}
}
