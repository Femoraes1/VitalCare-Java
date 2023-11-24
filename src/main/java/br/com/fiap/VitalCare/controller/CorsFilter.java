package br.com.fiap.VitalCare.controller;

import java.io.IOException;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;

@Provider
public class CorsFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext
			ResponseContext) 
					throws IOException{
		ResponseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
		ResponseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
		ResponseContext.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
		ResponseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
		
	}
}
