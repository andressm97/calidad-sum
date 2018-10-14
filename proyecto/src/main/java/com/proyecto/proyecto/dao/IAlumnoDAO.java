package com.proyecto.proyecto.dao;

import java.util.List;

import com.proyecto.proyecto.entity.Alumno;

public interface IAlumnoDAO {
	List<Alumno>getAlumnos();
	Alumno getAlumnoById(String idAlumno);
	

}
