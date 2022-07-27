package com.cmc.admin;

import com.cmc.entidades.Producto;

public class AdminProducto {
	//comparar: recibe 2 parametros de tipo producto
	//comparar: los precios de losproductos
	//retorna el producto de mayor valor
	
	public Producto obtenerProductoMasCaro(Producto a,Producto b){
		if(a.getPrecio()>b.getPrecio()){
			return a;
		}else if(b.getPrecio()>a.getPrecio()){
			return b;
		}else{
			return null;
		}
	}

}
