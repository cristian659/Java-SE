package com.cmc.evaluacion.cdv.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	public Naipe() {

		numerosPosibles = new ArrayList<Numero>();
		cartas = new ArrayList<Carta>();

		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));

		for (Numero numero : numerosPosibles) {

			cartas.add(new Carta(numero, Palos.CORAZON_NEGRO));
			cartas.add(new Carta(numero, Palos.CORAZON_ROJO));
			cartas.add(new Carta(numero, Palos.DIAMANTE));
			cartas.add(new Carta(numero, Palos.TREBOL));

		}

	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		Carta cartaItera;
		for (int i = 1; i <= 100; i++) {
			int numero = Random.obtenerPosicion();
			cartaItera = cartas.get(numero);

			if (cartaItera.getEstado().equals("N")) {
				cartaItera.setEstado("C");
				auxiliar.add(cartaItera);
			}

		}

		for (Carta carta : cartas) {

			if (carta.getEstado().equals("N")) {
				carta.setEstado("C");
				auxiliar.add(carta);

			}

		}

		return auxiliar;
	}

}
