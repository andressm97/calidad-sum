package com.proyecto.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.ITipo_curso;
import com.proyecto.proyecto.entity.Tipo_curso;

@Service
public class Tipo_cursoService {

	@Autowired
	private ITipo_curso Tipo_cursoDAO;
	
	public List<Tipo_curso> getTipo_Cursos(){
		
		List<Tipo_curso> list=Tipo_cursoDAO.getTipo_curso();
		return list;
	}
	
}
