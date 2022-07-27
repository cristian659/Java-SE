package com.cmc.flujo;

public class Validador {
	public void validarEdad(int edad){
		if(edad>18){
			System.out.println("es mayor de edad");
			
		}else if(edad<18){
			System.out.println("es menor de edad");
		}
		
		else {
			System.out.println("su edad es 18");
		}
	}
	public String ValidarEdadMsg(int edad){
		if(edad>18){
			return "es mayor de edad";
			
		}else if(edad == 18){
			return "tiene 18";
		}else{
			return "es menor de edad";
		}
	}
	
	public boolean esMayorDeEdad(int edad){
		if(edad>=18){
			return true;
		}else {
			return false;
		}
		
	}

}
