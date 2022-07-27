package com.Clearminds.test;
import com.Clearminds.conceptos.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
	
		Calculadora c = new Calculadora();
		int resultado = c.suma(8, 5);
		System.out.println("resultado:"+resultado);
		
		double resultadoresta = c.resta(8.8, 2);
		System.out.println("resultado resta:"+resultadoresta);
		
		double resultadoMultiplicacion = c.multiplicar(5.5, 5);
		System.out.println("resultado multiplicacion:" +resultadoMultiplicacion);
		
	
		
	}

}
