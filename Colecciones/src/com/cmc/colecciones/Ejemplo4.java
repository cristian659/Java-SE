package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo4 {
	public static void main(String[] args) {
		ArrayList<Persona> personas=new ArrayList<Persona>();
		personas.add(new Persona("hulk",12));
		personas.add(new Persona("spiderman",14));
		Persona p = new Persona("mujer Maravilla",23);
		personas.add(p);
		System.out.println(personas.size());
		Persona per=null;
		for(int i=0;i<personas.size();i++){
			per=personas.get(i);
			System.out.println(per.getNombre()+"-"+per.getEdad());
		}
	}

}
