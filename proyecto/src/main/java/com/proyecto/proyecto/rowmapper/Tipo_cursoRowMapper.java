package com.proyecto.proyecto.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.proyecto.proyecto.entity.Tipo_curso;

public class Tipo_cursoRowMapper implements RowMapper<Tipo_curso> {

	@Override
	public Tipo_curso mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tipo_curso tipocurso= new Tipo_curso();
		tipocurso.setId_tipo(rs.getInt("id_tipo"));
		tipocurso.setSiglas(rs.getString("siglas"));
		tipocurso.setText(rs.getString("nombre"));
		
		return tipocurso;
	}

}
