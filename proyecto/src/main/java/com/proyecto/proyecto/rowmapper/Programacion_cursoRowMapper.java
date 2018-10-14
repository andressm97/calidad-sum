package com.proyecto.proyecto.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.proyecto.proyecto.entity.Programacion_curso;

public class Programacion_cursoRowMapper implements RowMapper<Programacion_curso>{

	@Override
	public Programacion_curso mapRow(ResultSet rs, int rowNum) throws SQLException {
		Programacion_curso programacion=new Programacion_curso();
		programacion.setId_programacion(rs.getInt("id_programacion"));
		programacion.setGrupo(rs.getString("grupo"));
		programacion.setId_curso(rs.getString("id_curso"));
		programacion.setCodigo_profesor(rs.getInt("codigo_profesor"));
		programacion.setMatriculados(rs.getInt("matriculados"));
		programacion.setAula(rs.getString("aula"));
		programacion.setDia(rs.getString("dia"));
		programacion.setH_inicio(rs.getInt("h_inicio"));
		programacion.setH_final(rs.getInt("h_fin"));
		programacion.setClase(rs.getString("clase"));
		
		return programacion;
	}

}
