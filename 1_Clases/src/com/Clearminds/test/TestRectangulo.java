package com.Clearminds.test;
import com.Clearminds.conceptos.Rectangulo;
public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1= new Rectangulo(10,2);
		//r1.base=10;
		//r1.altura=2;
		int perimetro = r1.CalcularPerimetro();
		System.out.println("El perimetro es:" +perimetro);
		
		Rectangulo r2= new Rectangulo(12,8);
	//	r2.base=12;
		//r2.altura=8;
		int perimetro2 = r2.CalcularPerimetro();
		System.out.println("El perimetro r2 es:" +perimetro2);
		
		Rectangulo r3= new Rectangulo(12,8);
		//r3.base=12;
		//r3.altura=8;
		int area = r3.CalcularArea();
		System.out.println("El Area r3 es:" +area);

	}

}
