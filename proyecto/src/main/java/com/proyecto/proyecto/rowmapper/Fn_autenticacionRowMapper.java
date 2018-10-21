package com.proyecto.proyecto.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.proyecto.proyecto.entity.Fn_autenticacion;

public class Fn_autenticacionRowMapper implements RowMapper<Fn_autenticacion>{

	@Override
	public Fn_autenticacion mapRow(ResultSet rs, int rowNum) throws SQLException {
		Fn_autenticacion autenticacion= new Fn_autenticacion();
		autenticacion.setId_user(rs.getString("id_user"));
		autenticacion.setName(rs.getString("name"));
		autenticacion.setLastname(rs.getString("lastname"));
		autenticacion.setUsername(rs.getString("username"));
		autenticacion.setcontrasena(rs.getString("password"));
		return null;
	}

}
