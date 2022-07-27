package com.cmc.evaluacion.cdv.servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cmc.evaluacion.cdv.entidades.Carta;
import com.cmc.evaluacion.cdv.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<Carta> naipeBarajado;
	private HashMap<String, ArrayList<Carta>> cartasJugador;

	public Juego(String[] array) {
		cartasJugador = new HashMap<String, ArrayList<Carta>>();
		naipe = new Naipe();
		this.naipeBarajado = naipe.barajar();
		
		for (String idJugador : array) {

			cartasJugador.put(idJugador, new ArrayList<Carta>());

		}

	}

	public HashMap<String, ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}

	public void entregarCartas(int cartasPorJugador) {

		ArrayList<Carta> cartasARepartir;

		int contador = 0;

		for (String jugador : cartasJugador.keySet()) {
			cartasARepartir = new ArrayList<Carta>();
			for (int i = 0; i < cartasPorJugador; i++) {

				cartasARepartir.add(naipeBarajado.get(contador));
				contador++;
			}
			cartasJugador.put(jugador, cartasARepartir);
		}

	}

	public int devolverTotal(String jugador) {

		ArrayList<Carta> cartas = new ArrayList<Carta>();
		cartas = cartasJugador.get(jugador);

		int suma = 0;

		for (Carta carta : cartas) {
			suma += carta.getNumero().getValor();
		}

		return suma;

	}

	public String determinarGanador() {
		Map.Entry<String, ArrayList<Carta>> map = cartasJugador.entrySet().iterator().next();
		String idGanador = map.getKey();
		int sumaGanador = devolverTotal(idGanador);
		int sumaIterador = 0;
		for (String jugador : cartasJugador.keySet()) {
			sumaIterador = devolverTotal(jugador);
			if (sumaIterador > sumaGanador) {
				sumaGanador = sumaIterador;
				idGanador = jugador;
			}
		}

		return idGanador;
	}

}
