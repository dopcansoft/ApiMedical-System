package com.dopcan.SistemaMedico.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.dopcan.SistemaMedico.modelos.consultorio;
import com.dopcan.SistemaMedico.repository.IconsultoriosRepository;


@CrossOrigin(origins = "http://192.168.0.101:4500")
@RestController
public class consultorioController {

	@Autowired
	IconsultoriosRepository iconsultorio;
	
	
	@GetMapping ("/consulta-consultorios")
	public List<consultorio> consultarConsultorios(){
		return iconsultorio.findAll();
		
	}
	
	@GetMapping ("/consulta-consultorios/{id}")
	public ResponseEntity<consultorio> consultarConsultorioId(@PathVariable(value = "id") int id) {
		consultorio consultorio = iconsultorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
		return ResponseEntity.ok().body(consultorio);
		
	}

	
	@PostMapping ("/agregar-consultorio")
	public consultorio agregarconsultorio(@RequestBody consultorio consult) {
		iconsultorio.save(consult);
		return (iconsultorio.findNumConsultorio(consult.getNumConsultorio()));
	}
	
	@PutMapping("/modificar-consultorio/{id}")
	public ResponseEntity<consultorio> updateConsultorio(@PathVariable(value = "id") int IdConsultorio,
			@Validated @RequestBody consultorio detalleConsultorio) throws ResourceNotFoundException {
		consultorio consu = iconsultorio.findById(IdConsultorio)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + IdConsultorio));

		consu.setNumConsultorio(detalleConsultorio.getNumConsultorio());
		consu.setArea(detalleConsultorio.getArea());
		final consultorio updatedConsultorio = iconsultorio.save(consu);
		return ResponseEntity.ok(updatedConsultorio);
	}
	
	@DeleteMapping("/eliminar-consultorio/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") int idConsultorio)
			throws ResourceNotFoundException {
		consultorio consul = iconsultorio.findById(idConsultorio)
				.orElseThrow(() -> new ResourceNotFoundException("id Consultorio no encontrado: " + idConsultorio));

		iconsultorio.delete(consul);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
}
