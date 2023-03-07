package com.diegokiez.projectwebservices.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.diegokiez.projectwebservices.entity.Restaurante;
import com.diegokiez.projectwebservices.service.RestauranteService;

@Path("RestauranteWS")
public class RestauranteWS {

	private RestauranteService restauranteService = new RestauranteService();

	@Path("guardar")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response guardar(Restaurante restaurante) {
		if (restaurante == null) {
			return Response.status(400).entity("No se ingreso informacion del restaurante, "
					+ "favor de capturar sus datos")
					.build();
		}
		if (restaurante.getIdRestaurante() == null) {
			return Response.status(400).entity("El numero de restaurante es requerido").build();
		}

		if (restaurante.getNombre() == null || restaurante.getNombre().isEmpty()) {
			return Response.status(400).entity("El nombre es requerido").build();
		}
		GenericEntity<Restaurante> restauranteGeneric = new GenericEntity<Restaurante>(restaurante, Restaurante.class);
		return Response.ok(restauranteGeneric).build();

	}

	@Path("consultarLista")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Restaurante> consultarLista() {
		return restauranteService.consultarEmpleados();
	}

}
