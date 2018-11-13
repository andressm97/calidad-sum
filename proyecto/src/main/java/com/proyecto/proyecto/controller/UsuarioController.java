package com.proyecto.proyecto.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto.entity.Alumno;
import com.proyecto.proyecto.entity.Usuario;
import com.proyecto.proyecto.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UsuarioService service;
	
	@RequestMapping(value="/listar", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Usuario>> listarUsuario(){
		
		
		
		List<Usuario> list = null;

		try {
			
			list = service.listarUsuario();
			
			if (list == null) {
				list = new ArrayList<Usuario>();
			}
		} catch (Exception e) {

			return new ResponseEntity<List<Usuario>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		logger.info("usuario xd: " +list.get(0).toString());

		return new ResponseEntity<List<Usuario>>(list, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/{usuario}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> getAlumnoByUsername(@PathVariable("usuario") String usuario){
		System.out.println("usuario :" +usuario);
		Usuario user = null;
		
		try {
			user = service.getUsuarioByUsername(usuario);
			
			//logger.info("usuario : " +user.toString());
			if (user == null) {
				user = new Usuario();
				
				
			}
			
		} catch (Exception e) {
			
			System.out.println("error de usuario: "+ e.getMessage());
			return new ResponseEntity<Usuario>(user, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		
			return new ResponseEntity<Usuario>(user, HttpStatus.OK);
		
		
		
		
		
		
		
	}

		
		
		
		
	
	

}
