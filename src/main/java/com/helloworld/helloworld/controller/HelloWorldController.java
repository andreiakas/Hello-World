package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	
	}
	
	@GetMapping
	public String bsm() {
		return "-> Lista de BSM's <- "
				+ "Mentalidades:"
				+ "Orientação ao Futuro"
				+ "Responsabilidade Pessoal"
				+ "Mentalidade de Crescimento"
				+ "Persistencia"
				+ ""
				+ "Habilidades:"
				+ "Trabalho e equipe"
				+ "Atenção aos detalhes"
				+ "Proatividade"
				+ "Comunicação";
	}
	
	@GetMapping
	public String objetivoSemana() {
		return "Aprender conteúdos novos de Spring Boot";

}
}
