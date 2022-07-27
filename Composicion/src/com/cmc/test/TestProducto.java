package com.cmc.test;

import com.cmc.admin.AdminProducto;
import com.cmc.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		AdminProducto admin=new AdminProducto();
		Producto prod1 = new Producto("papas",0.50);
		Producto prod2 = new Producto("doritos", 0.50);
		Producto prodCaro=admin.obtenerProductoMasCaro(prod1,prod2);
		if(prodCaro==null){
			System.out.println("mismo precio");
		}else{
			System.out.println("el producto mas caro es:"+prodCaro.getNombre());
		}
		
	}

}
