package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion = new Validacion();
		boolean val=validacion.validarMonto(8);
		System.out.println(val);
	}

}
