package com.proyecto.proyecto.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.proyecto.proyecto.dao.IFn_sum_course;
import com.proyecto.proyecto.entity.fn_sum_course;
import com.proyecto.proyecto.rowmapper.Fn_sum_courseRowMapper;

@Transactional
@Repository
public class Fn_sum_courseDaoImpl implements IFn_sum_course{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
		
	@Override
	public List<fn_sum_course> getTabla_cursos() {
		
		String sql="select * from fn_sum_course()";
		RowMapper<fn_sum_course> rowMapper= new  Fn_sum_courseRowMapper();
		
		return this.jdbcTemplate.query(sql, rowMapper);
	}



}
