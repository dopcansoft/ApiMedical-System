package com.dopcan.SistemaMedico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dopcan.SistemaMedico.modelos.recetas;
import com.dopcan.SistemaMedico.repository.IrecetasRepository;

@RestController
public class recetasController {

	@Autowired
	IrecetasRepository irecetas;
	
	@PostMapping ("/agregar-recetas") 
	public void agregarRecetas(@RequestBody recetas receta) {
		irecetas.save(receta);
	}
	
	@GetMapping ("/consultar-recetas")
	public List<recetas> consultarRecetas(){
		return irecetas.findAll();
	}
}
