package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		
	Telefono telf = new Telefono();
	Telefono tel = new Telefono();
	Telefono telefono = new Telefono();
	
	
	AdminTelefono at = new AdminTelefono();
	
	telefono.setOperadora("movi");
	tel.setOperadora("claro");
	telf.setOperadora("movi");
	
	
	int imprimir = at.contarMovi(telefono,telf,tel);
	
	
	
	System.out.println("\n numeros movi:"+imprimir);
	
	}

}
