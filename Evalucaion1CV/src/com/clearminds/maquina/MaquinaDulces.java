package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}
	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(String codigo) {
		Celda c = new Celda(codigo);
		celdas.add(c);
	}
	public void mostrarConfiguracion(){
		for(int i=0; i<celdas.size();i++){
			System.out.println("Celdas: "+celdas.get(i).getCodigo());
		}
	}
	public Celda buscarCelda(String codigo) {
		Celda encontrada = null;
		for (int i = 0; i < celdas.size(); i++) {
			if (codigo.equals(celdas.get(i).getCodigo())) {
				encontrada = celdas.get(i);
				return encontrada;
			}
		}

		return null;

	}


	public void cargarProducto(Producto p, String codigoCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(p, cantidad);
	}

	
	public void mostrarProductos() {

		for (int i = 0; i < celdas.size(); i++) {
			System.out.print("Celda: " + celdas.get(i).getCodigo());
			System.out.print(" Stock: " + celdas.get(i).getStock());
			if (celdas.get(i).getProducto() != null) {
				System.out.print(" Producto: " + celdas.get(i).getProducto().getNombre());
				System.out.print(" Precio: " + celdas.get(i).getProducto().getPrecio());
			} else {
				System.out.print(" Sin producto Asignado");
			}
			System.out.print(" Saldo : " + saldo);
			System.out.println("");

		}
	}


	public Producto buscarProductoEnCelda(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);

		if (celdaEncontrada != null) {
			return celdaEncontrada.getProducto();
		} else {
			return null;
		}

	}


	public double consultarPrecio(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);

		if (celdaEncontrada != null) {
			return celdaEncontrada.getProducto().getPrecio();
		} else {
			return 0;
		}
	}

	
	public Celda buscarCeldaProducto(String codigo) {
		Celda celdaEncontrada = null;
		for (int i = 0; i < celdas.size(); i++) {
			if (celdas.get(i).getProducto() != null) {
				if (codigo.equals(celdas.get(i).getProducto().getCodigo())) {
					celdaEncontrada = celdas.get(i);
					return celdaEncontrada;
				}
			}

		}
		return null;
	}


	public void incrementarProductos(String codigo, int items) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		if (celdaEncontrada != null) {
			int itemsT = celdaEncontrada.getStock() + items;
			celdaEncontrada.setStock(itemsT);
		}

	}

	
	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);

		if (celdaEncontrada != null) {
			int stockActual = celdaEncontrada.getStock();
			celdaEncontrada.setStock(stockActual - 1);

			saldo += celdaEncontrada.getProducto().getPrecio();
		}

	}

	
	public double venderConCambio(String codigo, double valor) {
		Celda celdaEncontrada = buscarCelda(codigo);

		if (celdaEncontrada != null) {
			int stockActual = celdaEncontrada.getStock();
			celdaEncontrada.setStock(stockActual - 1);

			saldo += celdaEncontrada.getProducto().getPrecio();
			return valor - celdaEncontrada.getProducto().getPrecio();
		} else {
			return -1;
		}
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> menores = new ArrayList<Producto>();

		for (int i = 0; i < celdas.size(); i++) {
			if (celdas.get(i).getProducto().getPrecio() <= limite) {
				menores.add(celdas.get(i).getProducto());

			}
		}
		return menores;

	}
}
