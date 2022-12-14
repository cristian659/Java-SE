package com.cmc.entidades;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cmc.rest.entidades.Persona;
import com.cmc.rest.servicios.ServicioPersonas;
@Path("/personas")
public class PersonaRest {
	
	@Path("/cambiar")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
public Persona modificar(Persona persona){
	System.out.println(persona);
	Persona p=ServicioPersonas.actualizar(persona);
	return p;
}
}
