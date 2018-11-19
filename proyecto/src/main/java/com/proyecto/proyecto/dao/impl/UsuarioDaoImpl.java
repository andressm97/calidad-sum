package com.proyecto.proyecto.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.proyecto.proyecto.dao.IUsuario;
import com.proyecto.proyecto.entity.Usuario;
import com.proyecto.proyecto.rowmapper.UsuarioRowMapper;

@Transactional
@Repository
public class UsuarioDaoImpl implements IUsuario{
	
	@Autowired
	JdbcTemplate JdbcTemplate;
	
	@Override
	public List<Usuario> listaUsuarios() {
		String sql="select * from fn_listar()";
		
		RowMapper<Usuario> usuario= new UsuarioRowMapper();
		
		
		return this.JdbcTemplate.query(sql, usuario);
	}

	@Override
	public Usuario getUsuarioByUsername(String username,String password) {
		
		String sql="select * from fn_listar() where username=CONCAT(?,'@unmsm.edu.pe') and password=?";
		
		RowMapper<Usuario>rowMapper=new BeanPropertyRowMapper<Usuario>(Usuario.class);		

		Usuario usuario=JdbcTemplate.queryForObject(sql,rowMapper,username,password);
		
		return usuario;
	}

}
