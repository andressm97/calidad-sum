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

import com.proyecto.proyecto.entity.Carrera;
import com.proyecto.proyecto.services.CarreraService;

@RestController
@RequestMapping("/carrera")
public class CarreraController {
	
	@Autowired
	private CarreraService service;
	
	@RequestMapping(value="/listar", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Carrera>> getCarreras(){
		List<Carrera> list = null;

		try {
			
			list = service.getCarreras();
			
			if (list == null) {
				list = new ArrayList<Carrera>();
			}
		} catch (Exception e) {

			return new ResponseEntity<List<Carrera>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		


		return new ResponseEntity<List<Carrera>>(list, HttpStatus.OK);
		
		
	}
	

}
