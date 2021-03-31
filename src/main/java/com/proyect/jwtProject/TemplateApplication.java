package com.proyect.jwtProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Punto de entrada y ejecucion de la aplicacion Template
 * 
 * @author Javier Gonzalez
 *
 */
@SpringBootApplication
@ComponentScan("com.proyect.jwtProject") // to scan packages mentioned
@EnableMongoRepositories(basePackages = "com.proyect.jwtProject")
//@EnableSwagger2
public class TemplateApplication {
	public static void main(String[] args) {
		SpringApplication.run(TemplateApplication.class, args);
	}
}
