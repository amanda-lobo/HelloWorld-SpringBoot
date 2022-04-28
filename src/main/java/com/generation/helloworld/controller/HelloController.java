package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {

	@GetMapping
	public String hello()
	{
		return "<h1/ >Hello World!";
	}
	
	@GetMapping ("/bsm")
	public String bsm()
	{
		return "<h1/ >BSM's da Generation Brasil!<br>"
				+ "<br/ > <li/ >BSM-0 - Introdução às Habilidades Comportamentais e Mentalidades"
				+ "<br/ > <li/ >BSM-GM: Mentalidade de Crescimento"
				+ "<br/ > <li/ >BSM-P: Persistência"
				+ "<br/ > <li/ >BSM-PR: Responsabilidade Pessoa"
				+ "<br/ > <li/ >BSM-FO - Orientação ao Futuro"
				+ "<br/ > <li/ >BSM-C - Comunicação"
				+ "<br/ > <li/ >BSM-OD - Orientação ao Detalhe"
				+ "<br/ > <li/ >BSM-PA - Proatividade"
				+ "<br/ > <li/ >BSM-T - Trabalho em Equipe";
	}
	
	@GetMapping ("/objetivos")
	public String objetivos()
	{
		return"<h1/ >Objetivos de Aprendizagem para essa semana:<br> "
				+ "<br/ > <li/ > Banco de Dados SQL"
				+ "<br/ > <li/ > Inner Join"
				+ "<br/> <li/ > Introdução ao Spring Boot.";
	}
}
