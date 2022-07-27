package com.cmc.rest.servicios;

import com.cmc.rest.entidades.Persona;

public class ServicioPersonas {
	Persona persona= new Persona("", "", "");
	public static Persona actualizar (Persona persona){
		persona.setCedula("123123");
		persona.setNombre("SEBASTIAN");
		persona.setApellido("CABAL");
		return persona;}
}
