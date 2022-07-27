package com.cmc.excepciones;

public class Cuenta {
	private double saldo;
public void depositar(double monto) throws CheckedException{
	if(monto<0){
		throw new CheckedException("monto es incorrecto");
	}
}
	public void retirar(double monto) throws UnCheckedException{
		if(monto<0){
			throw new UnCheckedException("monto es incorrecto");
		}
}
}
