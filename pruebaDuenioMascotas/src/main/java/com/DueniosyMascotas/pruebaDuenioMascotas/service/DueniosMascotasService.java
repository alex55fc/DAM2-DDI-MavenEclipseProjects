package com.DueniosyMascotas.pruebaDuenioMascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DueniosyMascotas.pruebaDuenioMascotas.controller.Report;
import com.DueniosyMascotas.pruebaDuenioMascotas.model.Duenio;
import com.DueniosyMascotas.pruebaDuenioMascotas.model.Mascota;
import com.DueniosyMascotas.pruebaDuenioMascotas.repository.DueniosMascotaRepository;

@Service
public class DueniosMascotasService {
	//IMPORTANTE PARA EL REPOSITORY
	@Autowired
	DueniosMascotaRepository duenioRepo;
	
	//aun no lo usare
	@Autowired
	Report report;
	
	//metodos para Duenio 
	
	public void insertDuenio(Duenio dueniox){
		System.out.println("name:"+ dueniox.getNombre() );
		//NO hace falta comprobacion de la primery key(dni) ya que si existe la misma PK salta una sqlException
			//send to repository
			duenioRepo.insert(dueniox);
			//report.setMensaje("Insert");
		
	}
	//metodo que nos devuelva todos los Duenios
	public List<Duenio> listaDuenio (){
		List<Duenio> listaDuenio = duenioRepo.findAll();
		for (Duenio dueniox : listaDuenio) {
			System.out.println(dueniox.getDni() + dueniox.getNombre());		
		}
		return listaDuenio;
	}
	public Duenio findDuenioByDni(Integer dni) {
		//primero buscamos el dni del duenio y lo traemos en el obejto  
		Duenio dueniox = duenioRepo.findDuenioByDni(dni);
		return dueniox;
	}
	public Duenio updateDuenio(Duenio dueniox) {
		duenioRepo.update(dueniox);
		return dueniox;
	}
	public void delelteDuenio(Duenio dueniox) {
		duenioRepo.deleteDuenio(dueniox);
		
	}
	//metodos para Mascotas
	
	public void insertMascota(Mascota mascotax){
		System.out.println("name:"+ mascotax.getNombreMascota() );
			//send to repository
			duenioRepo.insertMascota(mascotax);;
			//report.setMensaje("Insert");
		
	}	
	public List<Mascota> listaMascotas (){
		List<Mascota> listaMascotas = duenioRepo.findAllMascotas();
		for (Mascota mascotax : listaMascotas) {
			System.out.println(mascotax.getNumChip() + mascotax.getNombreMascota() + mascotax.isTieneChip() +  mascotax.getDuenio().getDni());		
		}
		return listaMascotas;
	}
	
	
}
