package com.DueniosyMascotas.pruebaDuenioMascotas.controller;

import org.springframework.stereotype.Component;

@Component
public class Report {
	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
