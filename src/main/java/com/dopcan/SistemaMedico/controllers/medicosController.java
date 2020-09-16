package com.dopcan.SistemaMedico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.repository.query.Param;

import com.dopcan.SistemaMedico.modelos.medicos;
import com.dopcan.SistemaMedico.repository.ImedicosRepository;


import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class medicosController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	ImedicosRepository imedicos;
	
	@GetMapping("/Saludos")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return  String.format(template, name)+" "+counter.incrementAndGet();
	}
	
	@RequestMapping("/")
	public String index() {
		return "<html>\r\n" + 
				"<head>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"  <h1>Corriendo con: Spring Boot 2.3.3!</h1>\r\n" + 
				"<div class=\"col-lg-8 col-lg-offset-2\">\r\n" + 
				"	\r\n" + 
				"	<div class=\"jumbotron\">\r\n" + 
				"		<h1>API Sistema Medico</h1>\r\n" + 
				"		<p>Para controlar el sistema de un hospital</p>\r\n" + 
				"		<p>\r\n" + 
				"			<a href=\"#\" class=\"btn btn-success btn-lg\" role=\"button\">\r\n" + 
				"				Consultorios\r\n" + 
				"			</a>\r\n" + 
				"			<a href=\"#\" class=\"btn btn-primary btn-lg\" role=\"button\">\r\n" + 
				"				Medicos\r\n" + 
				"			</a>\r\n" + 
				"			<a href=\"#\" class=\"btn btn-warning btn-lg\" role=\"button\">\r\n" + 
				"				Pacientes\r\n" + 
				"			</a>\r\n" + 
				"		</p>\r\n" + 
				"	</div>\r\n" + 
				"\r\n" + 
				"</div>\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>";
	}
	
	@GetMapping("/consulta-medicos")
	public List<medicos> consultaMedicos(){
		return imedicos.findAll();
	}
	
	@GetMapping("/consulta-medicos-consultorio")
	public List<medicos> consultaMedicosConsultorio(@RequestParam("id") int id){ //
		return imedicos.find(id);
	}
	
    @PostMapping ("/agregar-medicos")
    public void agregarMedicos(@RequestBody medicos medic) {
    	imedicos.save(medic);
    }
	
}
