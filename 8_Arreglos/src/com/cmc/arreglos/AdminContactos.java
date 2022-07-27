package com.cmc.arreglos;

import com.cmc.entidades.Contacto;

public class AdminContactos {
	private Contacto[] contactos;
	private int elementosAgregados;
	
	public AdminContactos(){
		contactos= new Contacto[10];
	}
	
	public void agregar(Contacto contacto){
		if(elementosAgregados<contactos.length){
			contactos[elementosAgregados]=contacto;
			elementosAgregados=elementosAgregados+1;
		}
	}
		
	public Contacto buscar(Contacto contacto){
		for(int i=0;elementosAgregados<contactos.length;i++){
			
		}
		return null;
	}// me falta;
	public void mostrar(){
		
	}
	

}
