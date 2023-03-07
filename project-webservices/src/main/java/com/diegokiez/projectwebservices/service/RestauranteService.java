package com.diegokiez.projectwebservices.service;

import java.util.ArrayList;
import java.util.List;

import com.diegokiez.projectwebservices.entity.Restaurante;

public class RestauranteService {
	public List<Restaurante> consultarEmpleados(){
		List<Restaurante> restaurantes = new ArrayList();
		
		Restaurante restaurante1 = new Restaurante();
		restaurante1.setNombre("BurgerKing");
		restaurante1.setDireccion("Guanajuato, MEX");
		restaurante1.setSlogan("Comida deliciosa");
		restaurante1.setIdRestaurante(1L);
		
		Restaurante restaurante2 = new Restaurante();
		restaurante2.setNombre("McDonalds");
		restaurante2.setDireccion("Washington, EUA");
		restaurante2.setSlogan("Delicious food");
		restaurante2.setIdRestaurante(2L);
		
		restaurantes.add(restaurante1);
		restaurantes.add(restaurante2);
		
		return restaurantes;
		
	}
}
