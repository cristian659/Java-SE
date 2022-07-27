package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona =new Persona();
		
		System.out.println("nombre:"+persona.getNombre());
		System.out.println("edad:"+persona.getEdad());
		System.out.println("direccion"+persona.getDireccion());
		
		Direccion dir=persona.getDireccion();
		if(dir!=null){
			System.out.println("Direccion calle principal"+dir.getCallePricnipal());
			
		}else{
			System.out.println("direccion no ha sido asignada");
		}
		
		
	}
	//NULL.XXXXXXX CAUSAL DE UN NULLPOINTEREXCEPTION INTERESA LA SIGUIENTE LINEA

}
