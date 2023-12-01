package com.DueniosyMascotas.pruebaDuenioMascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DueniosyMascotas.pruebaDuenioMascotas.controller.Report;
import com.DueniosyMascotas.pruebaDuenioMascotas.model.Duenio;


import com.DueniosyMascotas.pruebaDuenioMascotas.repository.DueniosMascotaRepository;

@Service
public class DueniosMascotasService {
	//IMPORTANTE PARA EL REPOSITORY
	@Autowired
	DueniosMascotaRepository repo;
	
	//aun no lo usare
	@Autowired
	Report report;
	
	public void insertDuenio(Duenio dueniox){
		System.out.println("name:"+ dueniox.getNombre() );
		//NO hace falta comprobacion de la primery key(dni) ya que si existe la misma PK salta una sqlException
			//send to repository
			repo.insert(dueniox);
			//report.setMensaje("Insert");
		
	}
	//metodo que nos devuelva todos los Duenios
	public List<Duenio> listaDuenio (){
		List<Duenio> listaDuenio = repo.findAll();
		for (Duenio dueniox : listaDuenio) {
			System.out.println(dueniox.getDni() + dueniox.getNombre());		
		}
		return listaDuenio;
	}
	
	
	
}
