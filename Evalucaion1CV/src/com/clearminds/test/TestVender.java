package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVender {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda("B1");
		maquina.agregarCelda("A21");
		maquina.agregarCelda("C31");

		Producto producto = new Producto("Papitas", "KE34", 0.85);
		maquina.cargarProducto(producto, "B1", 4);

		Producto producto2 = new Producto("kipitos", "SW21", 1);
		maquina.cargarProducto(producto2, "A21", 2);

		maquina.vender("B1");
		maquina.vender("A21");
		maquina.mostrarProductos();
	}

}
