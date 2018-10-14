package com.proyecto.proyecto.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.proyecto.dao.IProfesorDAO;
import com.proyecto.proyecto.entity.Profesor;
import com.proyecto.proyecto.rowmapper.ProfesorRowMapper;

@Transactional
@Repository
public class ProfesorDaoImpl implements IProfesorDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Profesor> getProfesor() {
		String sql="select * from profesores";
		RowMapper<Profesor> rowMapper= new ProfesorRowMapper();
		return jdbcTemplate.query(sql, rowMapper);
	}

}
