package com.cmc.evaluacion.fase2.entidades;

import java.util.Date;

public class Prestamo {
	private String numero;
	private Date fecha;
	private double monto;
	private String tipo;
	private String cedulacliente;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCedulacliente() {
		return cedulacliente;
	}
	public void setCedulacliente(String cedulacliente) {
		this.cedulacliente = cedulacliente;
	}
	public Prestamo(String numero,  String cedulacliente) {
		super();
		this.numero = numero;
		this.cedulacliente = cedulacliente;
	}
	@Override
	public String toString() {
		return "Prestamo [numero=" + numero + ", fecha=" + fecha + ", monto=" + monto + ", tipo=" + tipo
				+ ", cedulacliente=" + cedulacliente + "]";
	}

}
