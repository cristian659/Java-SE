package com.cmc.test;

import com.cmc.colecciones.AdminPersona;
import com.cmc.entidades.Persona;

public class TestAdmin {
	public static void main(String[] args) {
		AdminPersona admin= new AdminPersona();
		admin.agregar(new Persona("Malcom", 10));
		admin.agregar(new Persona("Reese", 11));
		
		admin.imprimir();
		
		Persona personaBuescada = admin.buscar("Reese");
		if(personaBuescada==null){
			System.out.println("esta vacio");
		}else{
		System.out.println("Encontrado:"+personaBuescada.getNombre());
		}
		
	}

}
