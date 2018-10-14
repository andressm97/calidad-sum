package com.proyecto.proyecto.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.proyecto.proyecto.dao.ICursoDAO;
import com.proyecto.proyecto.entity.Curso;
import com.proyecto.proyecto.rowmapper.CursoRowMapper;

@Transactional
@Repository
public class CursoDaoImpl implements ICursoDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Curso> getCursos() {
		String sql="select * from cursos";
		RowMapper<Curso> rowMapper = new CursoRowMapper();
		
		return this.jdbcTemplate.query(sql, rowMapper);
		
		
	}

}
