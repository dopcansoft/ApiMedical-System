package com.dopcan.SistemaMedico.controllers;

import java.util.List;

import com.dopcan.SistemaMedico.modelos.medicina;
import com.dopcan.SistemaMedico.repository.ImedicinaRepository;

public class medicinaController {

	ImedicinaRepository imedicina;
	
	public void agregarMedicina(medicina medicamento) {
		imedicina.save(medicamento);
	}
	
	public List<medicina> consultarMedicinas(){
		return imedicina.findAll();
	}
}
