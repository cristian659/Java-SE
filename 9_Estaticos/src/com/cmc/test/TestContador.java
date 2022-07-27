package com.cmc.test;

import com.cmc.estaticos.Contador;

public class TestContador {

	public static void main(String[] args) {
		Contador contador=new Contador("objeto1");
		contador.incrementar();
		contador.imprimir();
		
		Contador c1=new Contador("objeto2");
		c1.incrementar();
		c1.imprimir();

	}

}
