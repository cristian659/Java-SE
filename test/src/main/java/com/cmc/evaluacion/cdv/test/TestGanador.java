package com.cmc.evaluacion.cdv.test;

import com.cmc.evaluacion.cdv.entidades.Carta;
import com.cmc.evaluacion.cdv.servicios.Juego;

public class TestGanador {

	public static void main(String[] args) {
		String[] jugadores = { "AFE", "SMO", "PGA" };

		Juego juego = new Juego(jugadores);

		juego.entregarCartas(5);

		for (String jugador : juego.getCartasJugador().keySet()) {
			System.out.println("==== CARTAS DEL JUGADOR ==== " + jugador + "(" + juego.devolverTotal(jugador) + ")");
			for (Carta carta : juego.getCartasJugador().get(jugador)) {
				System.out.println("  *** " + carta.getNumero().toString() + " ****** ");
			}
		}

		String ganador = juego.determinarGanador();

		System.out.println("GANADOR============> " + ganador);
	}
}
