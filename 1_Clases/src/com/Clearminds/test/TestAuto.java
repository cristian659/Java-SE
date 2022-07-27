package com.Clearminds.test;
import com.Clearminds.conceptos.Auto;

public class TestAuto {
	public static void main(String[] args){
		Auto a1;// Declaro la variable p1 tipo Persona
		
		a1 = new Auto("subaru",11.000000,2021);//Creo el objeto persona y lo referencio con p1 
		System.out.println("marca"+a1.getMarca());
		System.out.println("anio:" +a1.getAnio());
		System.out.println("precio"+a1.getPrecio());
		
		System.out.println("*********************");
		
		/*a1.marca="subaru";
		a1.anio=2021;
		a1.precio=11.000000;*/
		
		System.out.println("marca"+a1.getMarca());
		System.out.println("anio:" +a1.getAnio() );
		System.out.println("precio"+a1.getPrecio());
		
		System.out.println("*********************");
		Auto a2;
		a2=new Auto("Jeep");
		System.out.println("marca: "+a2.getMarca());
		System.out.println("*********************");
		//a2.setMarca("Jeep");
		System.out.println("marca: "+a2.getMarca());
	}
}
