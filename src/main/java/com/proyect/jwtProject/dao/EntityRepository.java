package com.proyect.jwtProject.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.proyect.jwtProject.entity.Entity2;

/**
 * Repositorio de acuerdo a las especificaciones, solamente para los anuncios
 * @author Javier Gonzalez
 *
 */
public interface EntityRepository extends MongoRepository<Entity2, Long>{
    Entity2 findById(@Param("id") String id);
}
