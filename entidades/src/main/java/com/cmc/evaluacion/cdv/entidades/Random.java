package com.cmc.evaluacion.cdv.entidades;

public class Random {

	public static int obtenerPosicion() {
		int size = 51;
		int num = (int) (Math.random() * (size + 1));
		return num;
	}
}
