package com.proyect.jwtProject.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.proyect.jwtProject.entity.Entity1;

/**
 * Repositorio de acuerdo a las especificaciones, solamente para los anuncios
 * 
 * @author Javier Gonzalez
 *
 */
public interface TemplateRepository extends MongoRepository<Entity1, Long> {
	@Query("{ 'pais' : ?0, edad: ?1, genero: ?2 }")
	public List<Entity1> findBySegmentacion(String pais, int edad, String genero);
}
