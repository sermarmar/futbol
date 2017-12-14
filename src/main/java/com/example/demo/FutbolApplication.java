package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FutbolApplication {

	public static void main(String[] args) {
		SpringApplication.run(FutbolApplication.class, args);
		
		Equipo equipo=new Equipo();
		
		Futbolista futbolista=equipo.crearNuevoFutbolistaConParam(10000000, "Summer", 11);
		
		equipo.agregarFutbolista(futbolista);
		
		equipo.pintarArray(equipo.getFutbolistas());
	}
}
