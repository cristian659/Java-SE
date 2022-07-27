package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVenderConCambio {

	public static void main(String[] args) {
		
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("B1");
		maquina.agregarCelda("A21");
		
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2 = new Producto("kipitos", "SW21", 1);
		maquina.cargarProducto(producto2, "A21", 2);
		
		
		maquina.vender("B1");
		maquina.vender("A21");
		double cambio=maquina.venderConCambio("B1",1);
		
		double cambio1=maquina.venderConCambio("A21",1);
		
		maquina.mostrarProductos();
			
		System.out.println("SU CAMBIO ES:"+cambio);
		System.out.println("SU CAMBIO ES:"+cambio1);
	}

}
