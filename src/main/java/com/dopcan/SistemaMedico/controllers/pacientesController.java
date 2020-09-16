package com.dopcan.SistemaMedico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dopcan.SistemaMedico.modelos.pacientes;
import com.dopcan.SistemaMedico.repository.IpacientesRepository;

@RestController
public class pacientesController {

	@Autowired
	private IpacientesRepository ipaciente;
	
	@GetMapping ("/consultar-pacientes")
	public List<pacientes> consultaPacientes(){
		return ipaciente.findAll();
	}
	
	@PostMapping("/agregar-pacientes")
	public void agregarPacientes(@RequestBody pacientes paciente) {
		ipaciente.save(paciente);
		
	}
}
