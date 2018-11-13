package com.proyecto.proyecto.dao;

import java.util.List;

import com.proyecto.proyecto.entity.Usuario;

public interface IUsuario {
	
	List<Usuario> listaUsuarios();
	
	Usuario getUsuarioByUsername(String username);
	

}
