package com.proyecto.proyecto.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.proyecto.proyecto.entity.Curso;

public class CursoRowMapper implements RowMapper<Curso> {

	@Override
	public Curso mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Curso curso= new Curso();
		curso.setIdCurso(rs.getString("id_curso"));
		curso.setNombre(rs.getString("nombre"));
		curso.setCreditos(rs.getInt("creditos"));
		curso.setId_tipo(rs.getInt("id_tipo"));
		curso.setHoras(rs.getInt("horas"));
		curso.setTeoria(rs.getInt("teoria"));
		curso.setLaboratorio(rs.getInt("laboratorio"));
		curso.setPractica(rs.getInt("practica"));
		curso.setPlan(rs.getString("plan"));
		
		return curso;
	}

}
