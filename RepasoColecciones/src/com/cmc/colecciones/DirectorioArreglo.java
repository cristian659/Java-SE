package com.cmc.colecciones;

import com.cmc.entidades.Contacto;

public class DirectorioArreglo extends Directorio {
	Contacto[] contactos = new Contacto[3];
	private int elementosAgregados;
	
	public void agregarContacto(Contacto contacto){
		contactos[elementosAgregados]=contacto;
			if(elementosAgregados<contactos.length){
			elementosAgregados=elementosAgregados+1;
			
		}
	}
	
	public Contacto buscarContacto(String cedula){
		Contacto contacto = null;
		for (int i = 0;i<contactos.length;i++ ){
			contacto = contactos[i];
			return contacto;
		}
		return null;
	}
	
	public Contacto eliminarContacto(String cedula){
		
		Contacto contacto = null;
		for (int i = 0;i<contactos.length-1;i++ ){
			contacto = contactos[i];
			if(cedula.equals(contacto.getCedula())){
				contactos[i]=null;
				return contacto;
			}
		}
		return null;
	}

	public void imprimir(){
		Contacto contacto=null;
		for(int i = 0; i < contactos.length; i++) {
			contacto=contactos[i];
            System.out.println(contacto);
        }
	}
	

}
