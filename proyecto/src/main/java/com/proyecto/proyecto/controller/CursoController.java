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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proyecto.proyecto.entity.Curso;
import com.proyecto.proyecto.services.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CursoService service;
		
	@RequestMapping(value="/listar", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Curso>> getCurso(){
		
		logger.info("holaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		List<Curso> list = null;

		try {
			
			list = service.getCursos();
			
			if (list == null) {
				list = new ArrayList<Curso>();
			}
		} catch (Exception e) {

			return new ResponseEntity<List<Curso>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		


		return new ResponseEntity<List<Curso>>(list, HttpStatus.OK);
		
	}
	
}
