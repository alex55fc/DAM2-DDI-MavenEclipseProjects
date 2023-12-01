package com.DueniosyMascotas.pruebaDuenioMascotas.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DuenioRowMapper implements RowMapper<Duenio>{

	@Override
	public Duenio mapRow(ResultSet rs, int rowNum) throws SQLException {
		Duenio duenio = new Duenio();
		duenio.setDni(rs.getInt("dni"));
		duenio.setNombre(rs.getString("nombre"));
		return duenio;
	}

}
