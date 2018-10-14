package com.proyecto.proyecto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto.entity.Programacion_curso;
import com.proyecto.proyecto.entity.Tipo_curso;
import com.proyecto.proyecto.services.Programacion_cursoService;
import com.proyecto.proyecto.services.Tipo_cursoService;

@RestController
@RequestMapping("/tipocurso")
public class TipoCursoController {
	
	@Autowired
	private Tipo_cursoService service;
	
	@RequestMapping(value="/listar", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Tipo_curso>>getProfesores(){
		
		List<Tipo_curso> list = null;

		try {
			
			list = service.getTipo_Cursos();
			
			if (list == null) {
				list = new ArrayList<Tipo_curso>();
			}
		} catch (Exception e) {

			return new ResponseEntity<List<Tipo_curso>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		


		return new ResponseEntity<List<Tipo_curso>>(list, HttpStatus.OK);
		
	}

}
