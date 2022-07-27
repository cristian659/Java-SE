package com.cmc.test;

import java.util.HashMap;

import com.cmc.entidades.Cliente;
import com.cmc.mapas.AdminClientes;

public class TestAdminClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashMap<String, Cliente> mapa = new HashMap<String, Cliente>();
		mapa.put("1193918456", new Cliente("1193918456", "camilo"));
		mapa.put("11111222333", new Cliente("11111222333", "carlos"));
		
		mapa.get("1193918456");
		mapa.get("11111222333");
		
		Cliente c = mapa.get("1192918463");
		System.out.println(c);*/
		AdminClientes cl = new AdminClientes();
		Cliente cliente1 = new Cliente("2292918457", "Sebastian");
		Cliente cliente2 = new Cliente("2295555864", "Cristian");
		
		cl.agregarCliente(cliente1);
		cl.agregarCliente(cliente2);
		
		Cliente cli = cl.recuperar("2295555864");
		System.out.println(cli);
		
		
		

	}

}
