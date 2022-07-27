package com.cmc.capacitacion.test;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.capacitacion.archivos.ManejadorArchivos;
import com.cmc.capacitacion.entidades.Persona;
import com.cmc.capacitacion.excepciones.ToxicaException;

public class TestManejador {
	private static Logger logger = LogManager.getLogger(TestManejador.class);

	public static void main(String[] args) {
		ManejadorArchivos ma = new ManejadorArchivos("C:\\Users\\velas\\OneDrive\\Documentos\\ejemplo.txt");
		try {
			ArrayList<Persona> persona = ma.leer();
			System.out.println(persona);
		} catch (ToxicaException e) {
			logger.error("error al leer el arhcivo", e);
			System.out.println(e.getMessage());
		}catch(Exception ex){
			logger.error("el sistema esta dormido", ex);
			System.out.println("el sistema esta dormido");
		}

	}

}
