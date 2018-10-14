package com.proyecto.proyecto.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.proyecto.proyecto.dao.ICarreraDAO;
import com.proyecto.proyecto.entity.Carrera;
import com.proyecto.proyecto.rowmapper.CarreraRowMApper;
@Transactional
@Repository
public class CarreraDaoImpl implements ICarreraDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Carrera> getCarreras() {
		String sql="select * from  carreras ";
		RowMapper<Carrera> rowMapper = new CarreraRowMApper();
		return this.jdbcTemplate.query(sql,rowMapper);
		
	}

}
