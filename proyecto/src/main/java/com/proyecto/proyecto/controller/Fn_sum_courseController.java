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


import com.proyecto.proyecto.entity.fn_sum_course;

import com.proyecto.proyecto.services.Fn_sum_courseService;

@RestController
@RequestMapping("/tabla")
public class Fn_sum_courseController {
	@Autowired
	private Fn_sum_courseService service;
		
	@RequestMapping(value="/listar", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<fn_sum_course>> getTabla(){
		
		
		
		List<fn_sum_course> list = null;

		try {
			
			list = service.getTabla();
			
			if (list == null) {
				list = new ArrayList<fn_sum_course>();
			}
		} catch (Exception e) {

			return new ResponseEntity<List<fn_sum_course>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		


		return new ResponseEntity<List<fn_sum_course>>(list, HttpStatus.OK);
		
	}

}
