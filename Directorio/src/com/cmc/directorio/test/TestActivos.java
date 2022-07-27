package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf = new Telefono("comcel","1192918586",15);
		Contacto contacto1 = new Contacto("carlos","cabal",telf,1.15);
		Contacto contacto2 = new Contacto("carlitos","cabalito",telf,1.50);
		AdminContactos a = new AdminContactos();
		telf.setTieneWhatsapp(true);
		a.activarUsuario(contacto1);
		
		System.out.println(telf.isTieneWhatsapp());
		System.out.println(contacto1.isActivo());

	}

}
