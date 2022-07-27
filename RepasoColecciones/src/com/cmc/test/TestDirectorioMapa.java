package com.cmc.test;

import com.cmc.colecciones.DirectorioMapa;
import com.cmc.entidades.Contacto;

public class TestDirectorioMapa {

	public static void main(String[] args) {
		DirectorioMapa dirmap = new DirectorioMapa();
		Contacto contac = new Contacto("123456789","carlos","rubiano");
		Contacto contac2 = new Contacto("123456789","carlos","rubiano");
		Contacto contac1 = new Contacto("12345678009","caarlos","ruubiano");
		dirmap.agregarContacto(contac);
		dirmap.agregarContacto(contac1);
		dirmap.agregarContacto(contac2);
		dirmap.imprimir();
		System.out.println("Contacto eliminado: "+dirmap.eliminarContacto("12345678009"));

	}

}
