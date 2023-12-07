package com.helloworld.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade")
public class HelloWorldController {

	@GetMapping("/Hello-World")
	public String HelloWorld() {
		return "Hello World!";
	}

	@GetMapping("/ListaBSM")
		public String ListaBSM() {
			return " - Lista de BSM's da Generation:\n"
					+ "Persistência;\r\n"
					+ "Mentalidade de Crescimento;\r\n"
					+ "Responsabilidade Pessoal;\r\n"
					+ "Orientação ao Futuro;\r\n"
					+ "Proatividade;\r\n"
					+ "Comunicação;\r\n"
					+ "Trabalho em Equipe;\r\n"
					+ "Orientação ao Detalhe;";
	}
	
	@GetMapping("/ObjAprender")
	public String ObjAprender() {
		return " - Lista de Aprendizagem Semanal:\n"
				+ "Melhorar as habilidades em SQL;"
				+ "Melhorar as habilidades no Spring;";
	}
}