package com.DueniosyMascotas.pruebaDuenioMascotas.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MascotaRowMapper implements RowMapper<Mascota>{

	@Override
	public Mascota mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mascota mascota = new Mascota();
		mascota.setNumChip(rs.getInt("numChip"));
		mascota.setNombreMascota(rs.getString("nombreMascota"));
		mascota.setTieneChip(rs.getBoolean("tieneChip"));
		
		int dni = rs.getInt("duenio_dni");
		Duenio dueniox = new Duenio();
		dueniox.setDni(dni);
		mascota.setDuenio(dueniox);
		return mascota;
	}

}
