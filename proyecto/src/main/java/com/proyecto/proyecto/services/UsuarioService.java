package com.proyecto.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.IUsuario;
import com.proyecto.proyecto.entity.Usuario;

@Service 
public class UsuarioService {
	
	@Autowired
	private IUsuario daoUsuario;
	
	public List<Usuario> listarUsuario(){
		
		return daoUsuario.listaUsuarios();
	}
	
	public Usuario getUsuarioByUsername(String username,String password) {
		
		Usuario usuario=daoUsuario.getUsuarioByUsername(username,password);
		return usuario;
	
	}

}
