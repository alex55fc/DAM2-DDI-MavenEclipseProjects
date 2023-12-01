package com.DueniosyMascotas.pruebaDuenioMascotas.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.DueniosyMascotas.pruebaDuenioMascotas.model.Duenio;
import com.DueniosyMascotas.pruebaDuenioMascotas.model.DuenioRowMapper;

@Repository
public class DueniosMascotaRepository {
	
	//IMPORTANTE
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void insert(Duenio duenio) {
		//ponemos el objeto vacio que teniamos al inicio en el controlador
		jdbcTemplate.update("insert into duenio(dni, nombre) values(?, ?);",
				duenio.getDni(), duenio.getNombre());
	}
	public List<Duenio> findAll(){
		return jdbcTemplate.query("SELECT * FROM duenio", new DuenioRowMapper());
	}
}
