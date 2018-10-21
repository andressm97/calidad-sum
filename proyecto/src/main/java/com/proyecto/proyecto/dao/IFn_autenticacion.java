package com.proyecto.proyecto.dao;

import com.proyecto.proyecto.entity.Fn_autenticacion;

public interface IFn_autenticacion {
	
	Fn_autenticacion autenticacion(String correo,String clave,String tipo);

}
