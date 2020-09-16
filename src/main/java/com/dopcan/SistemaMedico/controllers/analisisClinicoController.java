package com.dopcan.SistemaMedico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dopcan.SistemaMedico.modelos.analisisClinico;
import com.dopcan.SistemaMedico.repository.IanalisisClinicoRepository;

@RestController
public class analisisClinicoController {
	
	@Autowired
	IanalisisClinicoRepository ianalisisClinico;
	
	@PostMapping ("/agregar-analisis-Clinico")
	public void agregarAnalsisClinico(analisisClinico analisis) {
		ianalisisClinico.save(analisis);
	}
	
	@GetMapping  ("/consultar-analisis-clinico")
	public List<analisisClinico> consultarAnalisisClinico(){
		return ianalisisClinico.findAll();
	}
	
}
