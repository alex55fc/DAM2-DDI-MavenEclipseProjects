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
	//encontrar duenio por dni y devolver objeto 
	public Duenio findDuenioByDni(long dni) {
		return jdbcTemplate.queryForObject("SELECT * FROM duenio WHERE dni =?"
				, new DuenioRowMapper(),dni);
		/*yo no uso BeanPropertyRowMapper como lo hace Gorka, no lo veo necesario
		 * BeanPropertyRowMapper , que es un RowMapper especial provisto por Spring que mapea automáticamente las columnas del resultado
		 *  de la consulta a las propiedades de la clase */
		
	}
	public void update(Duenio duenio) {
		//ponemos el objeto vacio que teniamos al inicio en el controlador
		jdbcTemplate.update("UPDATE duenio SET nombre = ? WHERE dni = ?;",
				 duenio.getNombre(), duenio.getDni());
	}
	public void deleteDuenio(Duenio duenio) {
		jdbcTemplate.update("DELETE FROM duenio WHERE dni=?", duenio.getDni() );
	}
	
}
