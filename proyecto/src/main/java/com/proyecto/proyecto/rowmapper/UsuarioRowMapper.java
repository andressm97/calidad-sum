package com.proyecto.proyecto.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.proyecto.proyecto.entity.Usuario;

public class UsuarioRowMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario u= new Usuario();
		u.setId_user(rs.getString("id_user"));
		u.setName(rs.getString("name"));
		u.setLastname(rs.getString("lastname"));
		u.setUsername(rs.getString("username"));
		u.setId_profile(rs.getString("id_profile"));
		
		return u;
	}

}
