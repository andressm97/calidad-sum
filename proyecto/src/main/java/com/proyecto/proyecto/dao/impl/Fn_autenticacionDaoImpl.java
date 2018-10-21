package com.proyecto.proyecto.dao.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.proyecto.proyecto.dao.IFn_autenticacion;
import com.proyecto.proyecto.entity.Fn_autenticacion;
@Transactional  
@Repository

public class Fn_autenticacionDaoImpl implements IFn_autenticacion{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Fn_autenticacion autenticacion(String correo, String clave, String tipo) {
		String sql="select * from fn_autenticacion(?,?,?)";
		RowMapper<Fn_autenticacion> rowMapper= new BeanPropertyRowMapper<Fn_autenticacion>(Fn_autenticacion.class);
		Fn_autenticacion auntenticacion= jdbcTemplate.queryForObject(sql,rowMapper,correo,clave,tipo);
		return auntenticacion;
	}

}
