package com.cmc.test;

import java.util.HashMap;

import com.cmc.entidades.Cliente;

public class TestMapaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Cliente> mapa = new HashMap<String, Cliente>();
		mapa.put("1193918456", new Cliente("1193918456", "camilo"));
		mapa.put("11111222333", new Cliente("11111222333", "carlos"));
		
		mapa.get("1193918456");
		mapa.get("11111222333");
		
		Cliente c = mapa.get("11111222333");
		System.out.println(c);
		

	}

}
