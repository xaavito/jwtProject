package com.proyect.jwtProject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyect.jwtProject.dao.UserRepository;
import com.proyect.jwtProject.entity.User;

/**
 * Controller general de los API endpoints de la app.
 * 
 * @author Javier Gonzalez
 *
 */
@RestController
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	private final UserRepository userRepository;

	UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	/**
	 * Metodo Helper para insertar usuario
	 * 
	 * @param usuario
	 * @return
	 */
	@PostMapping("/add-usuario")
	ResponseEntity<Object> addUser(@RequestBody User usuario) {
		logger.info("Adding new User");
		try {
			userRepository.save(usuario);
			return new ResponseEntity<Object>("Usuario Added Correctly", HttpStatus.OK);
		} catch (Exception e) {
			logger.error("NO OK Something Went wrooong adding user ", e);
			return new ResponseEntity<Object>("Error agregando Usuarios", HttpStatus.SERVICE_UNAVAILABLE);
		}
	}

	/**
	 * Metodo helper para obtener usuarios
	 * 
	 * @return
	 */
	@GetMapping("/get-usuarios")
	ResponseEntity<Object> getUsers() {
		logger.info("Get Usuarios");
		List<User> allUsers = null;
		try {
			allUsers = userRepository.findAll();
			if (allUsers != null && allUsers.size() > 0) {
				return new ResponseEntity<Object>(allUsers, HttpStatus.OK);
			}
			return new ResponseEntity<Object>("There are no users", HttpStatus.SERVICE_UNAVAILABLE);
		} catch (Exception e) {
			logger.error("Something Went wrooong getting anuncios ", e);
			return new ResponseEntity<Object>("Error Obteniendo Usuarios", HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
}
