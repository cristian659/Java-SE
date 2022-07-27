package com.cmc.excepciones;

public class TestCuentas {

	public static void main(String[] args) {
		Cuenta c=new Cuenta();
		try{
			c.retirar(-100);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			
		}
		

	}

}
