package com.proyecto.proyecto.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.proyecto.proyecto.entity.Profesor;

public class ProfesorRowMapper implements RowMapper<Profesor>{

	@Override
	public Profesor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Profesor profesor= new Profesor();
		profesor.setCodigo_profesor(rs.getString("codigo_profesor"));
		profesor.setNombre(rs.getString("nombre"));
		profesor.setApellido(rs.getString("apellido"));
		profesor.setCorreo(rs.getString("correo"));
		profesor.setContraseña(rs.getString("contraseña"));
		return profesor;
	}

}
