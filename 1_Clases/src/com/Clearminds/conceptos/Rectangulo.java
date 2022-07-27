package com.Clearminds.conceptos;
public class Rectangulo {
	private int base;
	private int altura; 
	
	public Rectangulo(int base, int altura){
		this.base=base;
		this.altura=altura;
		
	}
	
public int CalcularPerimetro(){
	int per=(2*base)+(2*altura);
	return per;
}

//calcular area = base*altura

public int CalcularArea() {
	int area=(base*altura);
	return area;
	
}
}
