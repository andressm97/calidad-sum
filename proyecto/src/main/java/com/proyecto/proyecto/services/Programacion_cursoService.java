package com.proyecto.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.IProgramacion_cursoDAO;
import com.proyecto.proyecto.entity.Programacion_curso;

@Service
public class Programacion_cursoService {
	@Autowired
	private IProgramacion_cursoDAO programacionDAO;
	
	public List<Programacion_curso> getProgramacion_cursos(){
		List<Programacion_curso> list= programacionDAO.getProgramacion_curso();
		return list;
		
	}

}
