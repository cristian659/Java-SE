package com.cmc.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("inicio");
		try{
			String a=null;
			a.substring(1,3);
		}catch(Exception e){
			System.out.println("entra al catch");
		}finally{
			System.out.println("entra al finally");//es un bloque de codigo que si o si va a entrar 
			//para liberar recursos se usa por lo general
		}
		
		System.out.println("fin");

	}

}
