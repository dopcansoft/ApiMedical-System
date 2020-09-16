package com.dopcan.SistemaMedico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dopcan.SistemaMedico.modelos.radiografia;
import com.dopcan.SistemaMedico.repository.IradiografiaRepository;

@RestController
public class radiografiaController {
	
	@Autowired
	IradiografiaRepository iradiografia;
	
	@PostMapping ("/agregar-radiografias")
	public void agregarRadiografia(radiografia radiografias) {
		iradiografia.save(radiografias);
	}
	
	@GetMapping ("/consultar-radiografias")
	public List<radiografia> consultarRadiografias(){
		return iradiografia.findAll();
	}

}
