package com.cmc.test;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestValidarContactos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono tel = new Telefono("claro","123456");
		Contacto contac = new Contacto("1192918463","cristian","velasco");
		contac.agregarTelefono(tel);
		System.out.println(contac);
	}

}
