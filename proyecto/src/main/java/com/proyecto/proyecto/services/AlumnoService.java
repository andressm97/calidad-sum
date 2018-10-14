package com.proyecto.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.IAlumnoDAO;
import com.proyecto.proyecto.entity.Alumno;

@Service
public class AlumnoService {
	@Autowired
	private IAlumnoDAO alumnosDAO;
	
	public List<Alumno> getAlumnos(){
		List<Alumno> alumnoList= alumnosDAO.getAlumnos();
		return alumnoList;
	}
	
	public Alumno getAlumnoById(String idAlumno) {
		Alumno alumno=alumnosDAO.getAlumnoById(idAlumno);
		return alumno;
	}
	

}
