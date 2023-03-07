package com.diegokiez.projectwebservicesconsumer.client;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.diegokiez.projectwebservicesconsumer.dto.RestauranteDTO;

public class RestauranteWSClient {
	
	public static void main(String[] args) {
		
		//
		//	CODIGO PARA CONSULTAR (GET)
		//
		/*
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/project-webservices/diegokiez/RestauranteWS")
				.path("consultarLista");
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON); 
		Response response = invocationBuilder.get();
		System.out.println(response.readEntity(String.class));
		*/
		
		//
		//	CODIGO PARA GUARDAR (POST)
		//
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/project-webservices/diegokiez/RestauranteWS")
				.path("guardar");
		RestauranteDTO restaurante = new RestauranteDTO();

		restaurante.setNombre("Dominos Pizza");
		restaurante.setDireccion("Buenos Aires, ARG");
		restaurante.setIdRestaurante(3L);
		restaurante.setSlogan("No pizza no life");
		
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON); 
		Response response = invocationBuilder.post(Entity.entity(restaurante, MediaType.APPLICATION_JSON));
		RestauranteDTO restauranteDTO =response.readEntity(RestauranteDTO.class);
		System.out.println(restauranteDTO.getNombre());
	}

}
