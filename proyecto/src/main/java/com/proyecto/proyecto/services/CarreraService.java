package com.proyecto.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.ICarreraDAO;
import com.proyecto.proyecto.entity.Carrera;

@Service
public class CarreraService {
	@Autowired
	private ICarreraDAO carreraDAO;
	
	public List<Carrera> getCarreras(){
		List<Carrera> carreraList=carreraDAO.getCarreras();
		return carreraList;
	}
}
