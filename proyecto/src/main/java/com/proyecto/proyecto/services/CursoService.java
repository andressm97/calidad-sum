package com.proyecto.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.ICursoDAO;
import com.proyecto.proyecto.entity.Curso;

@Service
public class CursoService {
	@Autowired
	private ICursoDAO cursoDAO;
	
	public List<Curso> getCursos(){
		List<Curso> cursoList = cursoDAO.getCursos();
		return cursoList;
	}
	
}
