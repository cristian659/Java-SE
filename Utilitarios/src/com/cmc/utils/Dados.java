package com.cmc.utils;

public class Dados {
	
	public static int lanzar(){
		double d=Math.random();
		int valor=(int)(d*6);//cast cuando almaceno un double en un entero se almacena con el (int) antes de 
		return valor+1;
	}
}
