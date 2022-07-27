package com.cmc.evaluacion.fase2.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Cliente;
import com.cmc.excepciones.EvaluacionException;

public class AdminClientes {
	private static Logger logger = LogManager.getLogger(AdminClientes.class);

	public static Cartera armarCartera(String rutaArchivo) {
		Cartera cartera = new Cartera();
		File file = new File(rutaArchivo);
		String path = file.getAbsolutePath();
		System.out.println(path);
		FileReader fr = null;
		BufferedReader br = null;
		String linea = "";

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while ((linea = br.readLine()) != null) {
				armarCliente(linea, cartera);

			}

		} catch (FileNotFoundException e) {
			System.out.println("error al encontrar el archivo " + e);
			logger.error("error al encontrar", e);
			throw new EvaluacionException("No se puedo encontrar el archivo" + rutaArchivo);

		} catch (IOException e) {
			System.out.println("error al controlar " + e);
			logger.error("Error al leer el archivo", e);
			throw new EvaluacionException("No se puedo leer el archivo" + rutaArchivo);

		} finally {

			try {
				if (br != null) {
					br.close();
				}

			} catch (IOException e) {
				System.out.println("Error al cerrar el buffered " + e);
			}

			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				System.out.println("Error al cerrar el file reader " + e);
			}

		}

		return cartera;

	}

	private static void armarCliente(String linea, Cartera cartera) {
		String[] partesLinea;

		try {
			partesLinea = linea.split(",");
			Cliente cliente = new Cliente(partesLinea[0], partesLinea[1], partesLinea[2]);
			cartera.agregarCliente(cliente);
		} catch (Exception e) {
			logger.error("Error al armar cliente en la linea", linea, e.getStackTrace());
		}

	}
}
