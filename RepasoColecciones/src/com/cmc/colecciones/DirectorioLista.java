package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Contacto;

public class DirectorioLista extends Directorio {
	ArrayList<Contacto> contactos = new ArrayList<Contacto>();
	
	public void agregarContacto(Contacto contacto){
		Contacto contactoEncontrado = buscarContacto(contacto.getCedula());
		if(contactoEncontrado == null){
			contactos.add(contacto);
		}
	}
	
	public Contacto buscarContacto(String cedula){
		for(Contacto contac:contactos){
			if(cedula.equals(contac.getCedula())){
				return contac;
			}
		}
		return null;
	}
	
	public Contacto eliminarContacto(String cedula){
		Contacto contactoEncontrado = buscarContacto(cedula);
		if(contactoEncontrado != null){
			contactos.remove(contactoEncontrado);
			return contactoEncontrado;
		}
		return null;
	}

	public void imprimir(){
		for(int i = 0; i < contactos.size(); i++) {
            System.out.println(contactos.get(i));
        }
	}

}
