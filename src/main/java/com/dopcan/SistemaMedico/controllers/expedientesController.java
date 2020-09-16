package com.dopcan.SistemaMedico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dopcan.SistemaMedico.modelos.expedientes;
import com.dopcan.SistemaMedico.repository.IexpedientesRepository;

@RestController
public class expedientesController {
	
	@Autowired
	private IexpedientesRepository iexpediente;
	
	public void agregarExpediente(@RequestBody expedientes expediente) {
		iexpediente.save(expediente);
	}
	
	@GetMapping
	public List<expedientes> consultarExpedientes(){
		return iexpediente.findAll();
	}

}
