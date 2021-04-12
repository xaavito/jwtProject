package com.proyect.jwtProject.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.proyect.jwtProject.entity.User;

/**
 * Repositorio de acuerdo a las especificaciones, solamente para los anuncios
 * @author Javier Gonzalez
 *
 */
public interface UserRepository extends MongoRepository<User, Long>{
    User findById(@Param("id") String id);
}
