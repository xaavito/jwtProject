package com.proyect.jwtProject.service;

import java.util.List;

import com.proyect.jwtProject.entity.Entity1;

/**
 * Servicio interfaz de advertising manager
 * 
 * @author Javier Gonzalez
 */
public interface ITemplateService {
	public List<Entity1> getRandomAnuncios(List<Entity1> anunciosFromDB);
}
