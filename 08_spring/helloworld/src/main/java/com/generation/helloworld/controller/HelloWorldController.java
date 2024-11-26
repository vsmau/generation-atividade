package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.helloworld.model.ListaBSM;
import com.generation.helloworld.model.Objetivos;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/listabsm")
	public List <ListaBSM> getListaBSM(){
		return Arrays.asList(
				new ListaBSM(1,"Orientação ao futuro"),
				new ListaBSM(2,"Persistência"),
				new ListaBSM(3,"Responsabilidade Pessoal"),
				new ListaBSM(4,"Mentalidade de Crescimento"),
				new ListaBSM(5,"Comunicação"),
				new ListaBSM(6,"Proatividade"),
				new ListaBSM(7,"Orientação ao detalhe"),
				new ListaBSM(8,"Trabalho em equipe")
		);
	}
	
	@GetMapping("/listaobjetivos")
	public List<Objetivos> getObjetivos(){
		return Arrays.asList(
				new Objetivos(1,"Aprender Spring Boot"),
				new Objetivos(2,"Aprender @RESTCONTROLLER"),
				new Objetivos(3,"Aprender @REQUESTMAPPING"),
				new Objetivos(4,"Aprender @GETMAPPING")
				);
				
	}
	
}
