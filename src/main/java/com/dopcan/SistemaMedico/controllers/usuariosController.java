package com.dopcan.SistemaMedico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dopcan.SistemaMedico.modelos.usuarios;
import com.dopcan.SistemaMedico.repository.IusuariosRepository;

@RestController
public class usuariosController {

	@Autowired
	IusuariosRepository iusuario;
	
	@PostMapping ("/agregar-usuarios")
	public void agregarUsuario(usuarios usuario) {
		iusuario.save(usuario);
	}
	
	@GetMapping ("/consultar-usuarios")
	public List<usuarios> consultarUsuarios(){
		return iusuario.findAll();
	}
	
}
