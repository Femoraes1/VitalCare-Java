package br.com.fiap.VitalCare.controller;



import java.util.ArrayList;
 

import br.com.fiap.VitalCare.model.entity.Pulseira;
import br.com.fiap.VitalCare.model.repository.PulseiraRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;



@Path("/VitalCare/Pulseiras")
public class PulseiraResource {
	
	@GET
	@Path("/AllData")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		ArrayList<Pulseira> resposta = PulseiraRepository.findAll();
		ResponseBuilder response = Response.ok();
		response.entity(resposta);
		return response.build();
	}
	
}