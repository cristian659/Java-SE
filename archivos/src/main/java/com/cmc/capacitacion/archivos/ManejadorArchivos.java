package com.cmc.capacitacion.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.capacitacion.entidades.Persona;
import com.cmc.capacitacion.excepciones.ToxicaException;

public class ManejadorArchivos {
	private String rutaArchivo;
	private static Logger logger = LogManager.getLogger();

	public ManejadorArchivos(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	public ArrayList<Persona> leer() throws ToxicaException {

		File file = new File(rutaArchivo);
		BufferedReader br = null;
		FileReader filereader = null;
		String linea = "";
		String[] partes;
		Persona p;
		ArrayList<Persona> persona = new ArrayList<Persona>();
		try {
			filereader = new FileReader(file);
			br = new BufferedReader(filereader);
			
			while ((linea = br.readLine()) != null) {
				 partes = linea.split(",");// me devuelve un arreglo de
													// string dependiendo de el
													// parametro al que le mando
				 p = new Persona(partes[0], partes[1], partes[2]);
				persona.add(p);
			}
		} catch (FileNotFoundException e) {
			logger.error("error al leer el arhcivo", e);
			throw new ToxicaException("No existe el archivo" + rutaArchivo);

		} catch (IOException e) {
			logger.error("error al leer el arhcivo", e);
			throw new ToxicaException("Error al leer el archivo" + rutaArchivo);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				logger.error("error al cerrar el BufferedReader br", e);
			}
		}
		try {
			if (filereader != null) {
				filereader.close();
			}

		} catch (IOException e) {
			logger.error("error al cerrar el FileReader filereader", e);
		}
		return persona;
	}
}
