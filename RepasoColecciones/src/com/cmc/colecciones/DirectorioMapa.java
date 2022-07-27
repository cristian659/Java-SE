package com.cmc.colecciones;

import java.util.HashMap;
import java.util.Map.Entry;

import com.cmc.entidades.Contacto;

public class DirectorioMapa {
HashMap<String, Contacto> mapas = new HashMap<String, Contacto>();

public void agregarContacto(Contacto contacto){
	Contacto contactoEncontrado = buscarContacto(contacto.getCedula());
	if(contactoEncontrado == null){
		mapas.put(contacto.getCedula(),contacto );
	}
}

public Contacto buscarContacto(String cedula){
	return mapas.get(cedula);
}

public Contacto eliminarContacto(String cedula){
	Contacto contactoEncontrado = buscarContacto(cedula);
	if(contactoEncontrado != null){
		mapas.remove(cedula);
		return contactoEncontrado;
	}
	return null;
}

public void imprimir(){
	for (Entry<String, Contacto> Entry : mapas.entrySet()) {
	    System.out.printf("Clave: %s \n", Entry.getKey());
	}
}
}
