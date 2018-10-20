package com.proyecto.proyecto.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.proyecto.proyecto.entity.Alumno;

public class AlumnoRowMapper implements RowMapper<Alumno>{

	@Override
	public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Alumno alumno= new Alumno();
		
		alumno.setCodigo_alumno(rs.getString("codigo_alumno"));
		alumno.setNombre(rs.getString("nombre"));
		alumno.setApellido(rs.getString("apellido"));
		alumno.setCorreo(rs.getString("correo"));
		alumno.setContrasena(rs.getString("contraseña"));
		alumno.setCiclo(rs.getInt("ciclo"));
		alumno.setId_carrera(rs.getString("id_carrera"));
		return alumno;
	}

}
