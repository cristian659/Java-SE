package com.Clearminds.test;
import com.Clearminds.entidades.Persona;

public class TestPersona {
	public static void main(String[] args){
		Persona p1;// Declaro la variable p1 tipo Persona
		
		p1 = new Persona("Juan");//Creo el objeto persona contructor y lo referencio con p1 
		System.out.println("nombre"+p1.getNombre());
		System.out.println("edad:" +p1.getEdad());
		System.out.println("estatura"+p1.getEstatura());
		System.out.println("*********************");
		
		//p1.setNombre("andres");
		p1.setEdad(20);
		p1.setEstatura(1.75);
		
		System.out.println("nombre:"+p1.getNombre());
		System.out.println("edad:" +p1.getEdad());
		System.out.println("estatura"+p1.getEstatura());
		
		System.out.println("*********************");
		Persona p2;
		p2=new Persona("Marco");
		System.out.println("nombre: "+p2.getNombre());
		//p2.setNombre("Carlos");
		System.out.println("nombre: "+p2.getNombre());
		
		Persona p4;
		p4=new Persona("cristian",22,4.5);
		
	}

}
