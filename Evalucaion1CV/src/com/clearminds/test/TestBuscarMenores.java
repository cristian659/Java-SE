package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		maquina.agregarCelda("E");
		maquina.agregarCelda("F");
		
		maquina.cargarProducto(new Producto("BDCR", "Gatorade", 2.54),"A",5);
		maquina.cargarProducto(new Producto("ABRS", "Leche",8),"B",6);
		maquina.cargarProducto(new Producto("MNVS", "Chocolatina", 3.52),"C",4);
		maquina.cargarProducto(new Producto("QWER", "Bombom", 1),"D",3);
		maquina.cargarProducto(new Producto("ASDF", "Banana", 2),"E",8);
		maquina.cargarProducto(new Producto("WERT", "Coco", 4.5),"F",5);
		
		ArrayList<Producto>menores= maquina.buscarMenores(4);
		
		for (int i = 0; i < menores.size(); i++) {
			System.out.println("Producto : "+menores.get(i).getNombre());
		}
		
	}

}
