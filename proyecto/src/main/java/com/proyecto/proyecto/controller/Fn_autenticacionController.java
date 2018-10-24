package com.proyecto.proyecto.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto.entity.Fn_autenticacion;
import com.proyecto.proyecto.services.Fn_autenticacionService;

@RestController
@RequestMapping("/tabla")
public class Fn_autenticacionController {
	@Autowired
	private Fn_autenticacionService service;
	@RequestMapping(value="/autenticar/{user}/{pass}/{tipo}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Fn_autenticacion> getdatos(@PathVariable("user") String user,@PathVariable("pass") String pass,@PathVariable("tipo") String tipo){
		
		Fn_autenticacion autenticar = null;

		try {
			autenticar = service.getautenticacion(user,pass, tipo);
			
			if (autenticar == null) {
				autenticar = new Fn_autenticacion();
			}
		} catch (Exception e) {
			
			return new ResponseEntity<Fn_autenticacion>(autenticar, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

	
		return new ResponseEntity<Fn_autenticacion>(autenticar, HttpStatus.OK);
		
	}
}
