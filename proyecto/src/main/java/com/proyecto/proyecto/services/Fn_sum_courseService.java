package com.proyecto.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.IFn_sum_course;
import com.proyecto.proyecto.entity.fn_sum_course;

@Service
public class Fn_sum_courseService {
	@Autowired
	private IFn_sum_course TablaDAO;
	
	public List<fn_sum_course> getTabla(){
		List<fn_sum_course> list= TablaDAO.getTabla_cursos();
		return list;
	}

}
