package com.example.demo;

public class Futbolista {
	
	private long salario;
	private String nombre;
	private int numero;
	
	//Constructor
	public Futbolista() {
		
	}
	public Futbolista(long salario, String nombre, int numero) {
		this.salario = salario;
		this.nombre = nombre;
		this.numero = numero;
	}
	
	//Getters y setters
	public long getSalario() {
		return salario;
	}
	public void setSalario(long salario) {
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
