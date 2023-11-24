package br.com.fiap.VitalCare.controller;
 

import br.com.fiap.VitalCare.model.entity.ContatoEmergencia;
import br.com.fiap.VitalCare.model.repository.ContatoEmergenciaRepository;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;



@Path("/VitalCare/ContatosDeEmergencia")
public class ContatoEmergenciaResource {

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("id") Long id) {
		ContatoEmergencia resposta = ContatoEmergenciaRepository.findById(id);
		ResponseBuilder response = Response.ok();
		if (resposta == null) {
			response = Response.status(404);
		}
		response.entity(resposta);
		return response.build();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(@Valid ContatoEmergencia contato) {
		ContatoEmergencia resposta = ContatoEmergenciaRepository.save(contato);
		ResponseBuilder response = null;
		if (resposta != null) {
			response = Response.created(null); 
		} else {
			response = Response.status(400); 
		}
		response.entity(resposta);
		return response.build();
	}
	
	@DELETE
	@Path("/delete/{id}")
	public Response delete(@PathParam("id") Long id) {
		if (ContatoEmergenciaRepository.delete(id)) {
			ResponseBuilder response = Response.noContent(); 
			return response.build();
		} else {
			ResponseBuilder response = Response.status(404); 
			return response.build();
		}
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@Valid ContatoEmergencia contato) {
		ContatoEmergencia resposta = ContatoEmergenciaRepository.update(contato);
		ResponseBuilder response = null;
		if (resposta != null) {
			response = Response.created(null); 
		} else {
			response = Response.status(400); 
		}
		response.entity(resposta);
		return response.build();
	}
	
	
}
