package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
	Telefono telf = new Telefono("movi","09823424",20);
	
	AdminTelefono at = new AdminTelefono();
	
	at.ActivarMensajeria(telf);
	
	System.out.println("Operadora:"+telf.getOperadora());
	System.out.println("numero :"+telf.getNumero());
	System.out.println("codigo:"+telf.getCodigo());
	System.out.println("tiene whatsapp:"+telf.isTieneWhatsapp());
	

	}


}
