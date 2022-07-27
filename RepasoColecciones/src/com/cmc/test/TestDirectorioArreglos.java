package com.cmc.test;

import com.cmc.colecciones.DirectorioArreglo;
import com.cmc.colecciones.DirectorioMapa;
import com.cmc.entidades.Contacto;

public class TestDirectorioArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectorioArreglo dirArr = new DirectorioArreglo();
		Contacto contac = new Contacto("123456789","carlos","rubiano");
		Contacto contac2 = new Contacto("123456789","carlos","rubiano");
		Contacto contac1 = new Contacto("12345678009","caarlos","ruubiano");
		dirArr.agregarContacto(contac);
		dirArr.agregarContacto(contac1);
		dirArr.agregarContacto(contac2);
		dirArr.imprimir();
		System.out.println("Contacto eliminado: "+dirArr.eliminarContacto("12345678009"));
		dirArr.imprimir();

	}

}
