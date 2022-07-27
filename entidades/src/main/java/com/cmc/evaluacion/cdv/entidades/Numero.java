package com.cmc.evaluacion.cdv.entidades;

public class Numero {
	private String numeroCarta;
	private int valor;

	public Numero() {

	}

	public Numero(String numeroCarta, int valor) {
		super();
		this.numeroCarta = numeroCarta;
		this.valor = valor;
	}

	public String getNumeroCarta() {
		return numeroCarta;
	}

	public void setNumeroCarta(String numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return numeroCarta + "-" + valor;
	}
}