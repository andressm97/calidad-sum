package com.proyecto.proyecto.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.proyecto.proyecto.dao.IAlumnoDAO;
import com.proyecto.proyecto.entity.Alumno;

import com.proyecto.proyecto.rowmapper.AlumnoRowMapper;


@Transactional
@Repository
public class AlumnoDaoImpl implements IAlumnoDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Alumno> getAlumnos() {
		String sql="select *from alumnos";
		RowMapper<Alumno> rowMapper = new AlumnoRowMapper();
		
		
		return this.jdbcTemplate.query(sql, rowMapper);
		
		
	}
	@Override
	public Alumno getAlumnoById(String idAlumno) {
		String sql="select *from alumnos where codigo_alumno= ?";
		
		RowMapper<Alumno>rowMapper=new BeanPropertyRowMapper<Alumno>(Alumno.class);		
		Alumno alumno= jdbcTemplate.queryForObject(sql,rowMapper,idAlumno);
		return alumno;
	}
	

}
