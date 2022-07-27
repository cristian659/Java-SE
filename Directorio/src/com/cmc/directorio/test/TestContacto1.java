package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono  telf = new Telefono("movi","111112222",10);
		Telefono  tel = new Telefono("claro","111113333",11);
		Contacto contacto1 = new Contacto("david","velasco",telf,0.99);
		Contacto contacto2 = new Contacto("cristian","rubiano",tel,0.8);
		AdminContactos a = new AdminContactos();
		
		
		Contacto contactos = a.buscarMasPesado(contacto1, contacto2);
		boolean contactos1 = a.compararOperadoras(contacto1, contacto2);
		
		
		System.out.println("el mas pesado es: \n"+contactos.getNombre()+"\n"+contactos.getApellido()+"\n"+telf.getCodigo()+"\n"+telf.getNumero()+"\n"+telf.getOperadora()+"\n"+contactos.getPeso());
		
		System.out.println(" comparar operadoras: \n"+contactos1);
		
		
		
	}

}
