package com.proyecto.proyecto.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.proyecto.dao.IProgramacion_cursoDAO;
import com.proyecto.proyecto.entity.Programacion_curso;
import com.proyecto.proyecto.rowmapper.Programacion_cursoRowMapper;

@Transactional
@Repository
public class Programacion_cursoDaoImpl implements IProgramacion_cursoDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Programacion_curso> getProgramacion_curso() {
		String sql="select * from programacion_cursos";
		
		RowMapper<Programacion_curso> rowMapper= new Programacion_cursoRowMapper();
		return jdbcTemplate.query(sql,rowMapper);
	}

}
