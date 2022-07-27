package com.cmc.evaluacion.fase2.entidades;

import java.util.ArrayList;

public class Cartera {
	private ArrayList<Cliente> clientes;

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cartera() {
		clientes = new ArrayList<Cliente>();
	}

	public Cliente buscarCliente(String cedulaCliente) {

		Cliente clienteIterador;
		for (int i = 0; i < clientes.size(); i++) {
			clienteIterador = clientes.get(i);
			if (clienteIterador.getCedula().equals(cedulaCliente)) {
				return clienteIterador;
			}

		}

		return null;
	}

	public boolean agregarCliente(Cliente cliente) {
		Cliente clienteEncontrado = buscarCliente(cliente.getCedula());

		if (clienteEncontrado == null) {
			clientes.add(cliente);
			return true;
		}

		return false;
	}
	
	public void colocarPrestamo(Prestamo prestamo) {
		Cliente clienteEncontrado = buscarCliente(prestamo.getCedulacliente());
		if(clienteEncontrado!=null) {
			clienteEncontrado.agregarPrestamo(prestamo);
		}
	}

}
