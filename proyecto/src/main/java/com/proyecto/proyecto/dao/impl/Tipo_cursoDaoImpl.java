package com.proyecto.proyecto.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.proyecto.dao.ITipo_curso;
import com.proyecto.proyecto.entity.Tipo_curso;
import com.proyecto.proyecto.rowmapper.Tipo_cursoRowMapper;

@Transactional
@Repository
public class Tipo_cursoDaoImpl implements ITipo_curso{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Tipo_curso> getTipo_curso() {
		String sql="select * from tipo_cursos";
		RowMapper<Tipo_curso> rowMapper= new Tipo_cursoRowMapper();
		return jdbcTemplate.query(sql, rowMapper);
	}

}
