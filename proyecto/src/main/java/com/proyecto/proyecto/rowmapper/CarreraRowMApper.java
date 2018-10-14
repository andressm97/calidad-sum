package com.proyecto.proyecto.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.proyecto.proyecto.entity.Carrera;

public class CarreraRowMApper implements RowMapper<Carrera>{

	@Override
	public Carrera mapRow(ResultSet rs, int rowNum) throws SQLException {
		Carrera carreras= new Carrera();
		carreras.setId_carrera(rs.getString("id_carrera"));
		carreras.setEscuela(rs.getString("escuela"));
		
		return carreras;
	}

}
