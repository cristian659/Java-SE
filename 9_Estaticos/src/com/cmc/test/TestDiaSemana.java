package com.cmc.test;

import com.cmc.estaticos.DiaSemana;
import static java.lang.Math.PI;
import static java.lang.Math.random;

public class TestDiaSemana {

	public static void main(String[] args) {
		DiaSemana ds =new DiaSemana();
		int valor=ds.MARTES;
		System.out.println(valor);
		
		valor=DiaSemana.MIERCOLES;
		System.out.println(valor);
		
		double d1=PI;
		System.out.println(d1);
		double d2=random();
		System.out.println(d2);

	}

}
