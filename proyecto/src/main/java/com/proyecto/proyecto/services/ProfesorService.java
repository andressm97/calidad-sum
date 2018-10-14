package com.proyecto.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.IProfesorDAO;
import com.proyecto.proyecto.entity.Profesor;

@Service
public class ProfesorService {
	@Autowired
	private IProfesorDAO profesorDAO;
	
	public List<Profesor> getProfesores(){
		List<Profesor> Profesorlist= profesorDAO.getProfesor();
		return Profesorlist;
	}

}
