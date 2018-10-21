package com.proyecto.proyecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.IFn_autenticacion;
import com.proyecto.proyecto.entity.Fn_autenticacion;

@Service
public class Fn_autenticacionService {
	@Autowired
	private IFn_autenticacion DAOauntenticacion;
	
	public Fn_autenticacion getautenticacion(String correo,String clave,String tipo) {
		
		Fn_autenticacion autenticar=DAOauntenticacion.autenticacion(correo, clave, tipo);
		return autenticar;
	}

}
