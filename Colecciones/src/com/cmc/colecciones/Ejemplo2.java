package com.cmc.colecciones;

import java.util.ArrayList;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista=new ArrayList<String>();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		lista.add("d");
		
		String recuperado=lista.get(3);
		System.out.println("valor:"+recuperado);

		int tamanio=lista.size();
		System.out.println("tamanio:"+tamanio);
		
		String cadena=null;
		for (int i=0;i<lista.size();i++){
			cadena=lista.get(i);
			System.out.println("Valor:"+cadena);
		}
		
	}

}
