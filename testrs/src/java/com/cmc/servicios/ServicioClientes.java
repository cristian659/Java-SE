package com.cmc.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cmc.entidad.Cliente;

@Path("/clientes") //anotaciones tengo que referenciarlas
public class ServicioClientes {
@Path("/m1")
@GET
	public String metodo1(){
		return "saludando desde el rest web services!!";
	}
@Path("/consultar")
@GET
@Produces(MediaType.APPLICATION_JSON)//aplication/json
public Cliente consultar(){
	Cliente p = new Cliente("cristian","12334",15,false);
	return p;
}
@Path("/guardar")
@POST
@Consumes(MediaType.APPLICATION_JSON)
public void guardar(Cliente cliente){
	System.out.println("nombre:"+cliente.getNombre());
	System.out.println("cedula:"+cliente.getCedula());
}
}
