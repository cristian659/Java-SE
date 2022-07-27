package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista=new ArrayList<String>();
		ArrayList<Persona> listaPersona=new ArrayList<Persona>();
		
		lista.add("xx");
		listaPersona.add(new Persona("A",12));
		
		String a=lista.get(0);
		Persona p=listaPersona.get(0);
	}

}
