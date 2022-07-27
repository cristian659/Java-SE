package com.cmc.test;

import com.cmc.colecciones.DirectorioLista;
import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestAgregarContacto {

	public static void main(String[] args) {
		DirectorioLista direct = new DirectorioLista();
		Contacto contac = new Contacto("123456789","carlos","rubiano");
		Contacto contac2 = new Contacto("123456789","carlos","rubiano");
		Contacto contac1 = new Contacto("12345678009","caarlos","ruubiano");
		direct.agregarContacto(contac);
		direct.agregarContacto(contac1);
		direct.agregarContacto(contac2);
		direct.imprimir();
		System.out.println("Contacto eliminado: "+direct.eliminarContacto("12345678009"));
		
	}

}
