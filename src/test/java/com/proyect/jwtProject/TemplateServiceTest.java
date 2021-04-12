package com.proyect.jwtProject;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.reactive.server.WebTestClient.BodyContentSpec;

import com.proyect.jwtProject.dao.UserRepository;
import com.proyect.jwtProject.entity.User;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
@Slf4j
public class TemplateServiceTest {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private WebTestClient webClient;

	@After
	public void limpieza() throws Exception {
		userRepository.deleteAll();
	}


	@Test
	public void addAndgetUsuario() {
		// Add Usuario 1
		User user = new User("Jose", "Perez", "a@a.com", "Argentina", 35, "M");

		this.webClient.post().uri("/add-usuario").contentType(MediaType.APPLICATION_JSON_UTF8)
				.accept(MediaType.APPLICATION_JSON_UTF8).body(Mono.just(user), User.class).exchange().expectStatus()
				.isOk();
		// get Usuario 1
		BodyContentSpec body = this.webClient.get().uri("/get-usuarios").exchange().expectBody();
		body.jsonPath("$[0].['nombre']").isEqualTo("Jose");
	}

	@Test
	public void getNoUsuario() {
		// Get No Usuario
		this.webClient.get().uri("/get-usuarios").exchange().expectStatus().is5xxServerError();
	}
}
