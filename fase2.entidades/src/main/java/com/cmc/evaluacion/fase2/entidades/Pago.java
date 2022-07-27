package com.cmc.evaluacion.fase2.entidades;

import java.util.Date;

public class Pago {
	private String numeroprestamo; 
	private Date fechapago;
	private double monto;
	public String getNumeroprestamo() {
		return numeroprestamo;
	}
	public void setNumeroprestamo(String numeroprestamo) {
		this.numeroprestamo = numeroprestamo;
	}
	public Date getFechapago() {
		return fechapago;
	}
	public void setFechapago(Date fechapago) {
		this.fechapago = fechapago;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public Pago(String numeroprestamo) {
		super();
		this.numeroprestamo = numeroprestamo;
	}
	@Override
	public String toString() {
		return "Pago [numeroprestamo=" + numeroprestamo + ", fechapago=" + fechapago + ", monto=" + monto + "]";
	}
	
	

}
