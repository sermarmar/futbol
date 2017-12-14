package com.example.demo;

import java.util.ArrayList;
import java.awt.List;


public class Equipo {
	
	private Futbolista[] futbolistas = new Futbolista[11];
	
	public Futbolista crearNuevoFutbolista() {
		return new Futbolista();
	}
	public Futbolista crearNuevoFutbolistaConParam(long i, String apodo, int numero) {
		return new Futbolista(i, apodo, numero);
	}
	public void agregarFutbolista(Futbolista f) {
		for(int i=0;i<11;i++) {
			if(futbolistas[i]==null) {
				futbolistas[i]=f;
				break;
			}
		}
	}
	
	//Getters y setters
	public Futbolista[] getFutbolistas() {
		return futbolistas;
	}
	public void setFutbolistas(Futbolista[] futbolistas) {
		this.futbolistas = futbolistas;
	}
	
	//Metodos
	public void pintarArray(Futbolista[] futbolistasArray) {
		for (Futbolista futbolista : futbolistasArray) {
			if(futbolista!=null) {
				System.out.println(futbolista.getNombre());
			}
		}
	}
	
}
