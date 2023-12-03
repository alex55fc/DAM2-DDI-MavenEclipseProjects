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
	//Metodos  para Duenios
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
	/*Uso dos metodos para UpdateDuenio ya que el primer  metodo unicamentelo encuentraal duenio por dni
	 * luego lo mete en un objetoy para nosotros poder cambiar la info de ese objeto envio a otra vista paraahi darle
	 * nuevos valores al objeto, luego uso el VERDADERO update y ahi si lo envio a la vista fin */
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
	/*En estedelete como no necesito rellenar otros datos en un avista aparte puedo hacerlo todo en el mismo meteodo,
	 * no de la forma que yo quisiera que seria, usar un metodo findDuenioByDni y queeso usarlo tanto para update como para delete
	 * porque por como es este ejercicio no se hacerlo,tengo que upgradearlo  luego de examenes*/
	@RequestMapping("/deleteDuenioByDni/{dni}")
	public String deleteDuenioByDni(@PathVariable Integer dni,Model model) {
		Duenio dueniox = service.findDuenioByDni(dni);
		service.delelteDuenio(dueniox);
		model.addAttribute("mensaje", "Duenio eliminated");
		
		List<Duenio> listaDuenio = service.listaDuenio();
		model.addAttribute("listaDuenios", listaDuenio);		
		return "fin";
	}
	//Metodos para Mascotas
	//no voy a manegar la excepcion de escoger un Duenio que no exista, dejare que salte SQLException y no hare el catch
	@RequestMapping("/insertMascota")
	public String insertMascota(Mascota mascota, Model model) {
		
		service.insertMascota(mascota);
		model.addAttribute("mensaje", "Mascota added");
		
		return "fin";	
			
	}	
}
