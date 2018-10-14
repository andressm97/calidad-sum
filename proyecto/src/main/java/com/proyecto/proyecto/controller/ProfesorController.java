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


import com.proyecto.proyecto.entity.Profesor;
import com.proyecto.proyecto.services.ProfesorService;

@RestController
@RequestMapping("/profesor")

public class ProfesorController {
	
	@Autowired
	private ProfesorService service;
	
	@RequestMapping(value="/listar", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Profesor>>getProfesores(){
		
		List<Profesor> list = null;

		try {
			
			list = service.getProfesores();
			
			if (list == null) {
				list = new ArrayList<Profesor>();
			}
		} catch (Exception e) {

			return new ResponseEntity<List<Profesor>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		


		return new ResponseEntity<List<Profesor>>(list, HttpStatus.OK);
		
	}
}
