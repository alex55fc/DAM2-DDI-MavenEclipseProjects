package com.DueniosyMascotas.pruebaDuenioMascotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DueniosyMascotas.pruebaDuenioMascotas.model.Duenio;
import com.DueniosyMascotas.pruebaDuenioMascotas.model.Mascota;
import com.DueniosyMascotas.pruebaDuenioMascotas.service.DueniosMascotasService;

@Controller
public class DueniosMascotasController {
	
	//IMPORTANTE PARA EL SERVICE 
	@Autowired
	DueniosMascotasService service;
	
	//Clase para manejar mensajes.Aun no lo usare
	@Autowired
	Report report;
	
	@RequestMapping("/")
	public String index(Model model) {
		//necesario para que el formulario funcione
		//como no tiene constructor me deja crear un duenio vacio sin atributos asociados
		model.addAttribute("dueniox", new Duenio());
		model.addAttribute("mascotax", new Mascota());
		return "index";
		
	}
	/*
	 * buscar manera de hacerlo asi y con el Report report
	@RequestMapping("/listaDuenio")
	public String listaDuenio(Model model) {
		List<Duenio> listaDuenio = service.listaDuenio();
		model.addAttribute("listaDuenios", listaDuenio);
		return "fin";
	}
	*/
	//localhost:8081/insertDuenio
	@RequestMapping("/insertDuenio")
	public String insertDuenio(Duenio duenio, Model model) {
		
		service.insertDuenio(duenio);
		model.addAttribute("mensaje", "Duenio added");
		
		List<Duenio> listaDuenio = service.listaDuenio();
		model.addAttribute("listaDuenios", listaDuenio);
		return "fin";	
			
	}
	@RequestMapping("/findDuenio/{dni}")
	public String findDuenio(@PathVariable Integer dni, Model model) {
		Duenio dueniox = service.findDuenioByDni(dni);
		//aqui le pasamos nuestro objeto para hacer el update con los datos del Duenio con ese dni
		model.addAttribute("dueniox", dueniox);
		
		return "updateView";
	}
	
	@RequestMapping("/updateDuenio")
	public String updateDuenio(Duenio dueniox, Model model) {
		
		service.updateDuenio(dueniox);
		model.addAttribute("mensaje", "Duenio uploaded");
		
		List<Duenio> listaDuenio = service.listaDuenio();
		model.addAttribute("listaDuenios", listaDuenio);		
		return "fin";
	}
	
}
