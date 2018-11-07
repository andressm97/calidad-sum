package com.proyecto.proyecto.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.proyecto.proyecto.entity.fn_sum_course;

public class Fn_sum_courseRowMapper implements RowMapper<fn_sum_course>{

	@Override
	public fn_sum_course mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		fn_sum_course tabla=new fn_sum_course();
		tabla.setId_programacion(rs.getInt("id_programacion"));
		tabla.setDocente(rs.getString("docente"));
		tabla.setCurso(rs.getString("curso"));
		tabla.setCiclo(rs.getInt("ciclo"));
		tabla.setPlan(rs.getString("plan"));
		tabla.setMatriculados(rs.getInt("matriculados"));
		tabla.setDia(rs.getString("dia"));
		tabla.setH_inicio(rs.getInt("h_inicio"));
		tabla.setH_fin(rs.getInt("h_fin"));
		tabla.setGrupo(rs.getString("grupo"));
		tabla.setClase(rs.getString("clase"));
		tabla.setSiglas(rs.getString("siglas"));

		return tabla;
	}
	

}
