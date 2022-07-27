package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf = new Telefono();
		Telefono tel = new Telefono();
		Telefono telefono = new Telefono();
		Telefono tele = new Telefono();
		
		AdminTelefono at = new AdminTelefono();
		
		telefono.setOperadora("movi");
		tel.setOperadora("claro");
		telf.setOperadora("movi");
		tele.setOperadora("claro");
		
		int imprimirc = at.contarMoviC(telefono,telf,tel,tele);
		
		System.out.println("\n numeros claro:"+imprimirc);
		}

	}


