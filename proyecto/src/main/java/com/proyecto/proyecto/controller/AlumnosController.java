package com.proyecto.proyecto.controller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto.entity.Alumno;
import com.proyecto.proyecto.services.AlumnoService;


@RestController
@RequestMapping("/alumno")
public class AlumnosController {
	
	@Autowired
	private AlumnoService service;
	
	@RequestMapping(value="/listar", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Alumno>> getAlumnos(){
		
		
		List<Alumno> list = null;

		try {
			
			list = service.getAlumnos();
			
			if (list == null) {
				list = new ArrayList<Alumno>();
			}
		} catch (Exception e) {

			return new ResponseEntity<List<Alumno>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		


		return new ResponseEntity<List<Alumno>>(list, HttpStatus.OK);
		
		
	}
	
	@RequestMapping(value="/buscar/{idAlumno}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Alumno> getAlumnoById(@PathVariable("idAlumno") String idAlum){
		
		Alumno alu = null;
		try {
			alu = service.getAlumnoById(idAlum);

			if (alu == null) {
				alu = new Alumno();
			}
			
		} catch (Exception e) {
			
			return new ResponseEntity<Alumno>(alu, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		
			return new ResponseEntity<Alumno>(alu, HttpStatus.OK);
		
	}
	

}
