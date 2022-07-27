package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class AdminPersona {
	
	private ArrayList<Persona> personas;
	
	public AdminPersona(){
		personas=new ArrayList<Persona>();
	}
	
	public void agregar(Persona persona){
		
		personas.add(persona);//null.add(persona)
		
	}
	public void imprimir(){
		Persona per=null;
		for(int i=0;i<personas.size();i++){//null size
			per=personas.get(i);
			System.out.println("Nombre:"+per.getNombre()+"edad:"+per.getEdad());
		}
	}
	//retorna la persona si el nombre coinciude, caso contrario retorna null
	public Persona buscar(String nombre){
		Persona per;
		for(int i=0;i<personas.size();i++){
			per=personas.get(i);
			if(per.getNombre().equals(nombre)){//solo si es string para comparar equals
				return per;
			}
		}
		//llega a aeste punto solo si no entro al if, luego de iterar toda la lista
		return null;
	}

}
