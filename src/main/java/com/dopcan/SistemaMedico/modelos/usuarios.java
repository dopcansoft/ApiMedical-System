package com.dopcan.SistemaMedico.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class usuarios {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int idUsuario;
	
	private String cuenta;
	
	private String password;
	
	private String role;
	
	@OneToOne
	@JoinColumn (name = "idMedicos")
	private medicos medico;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public medicos getMedico() {
		return medico;
	}
	public void setMedico(medicos medico) {
		this.medico = medico;
	}
	
	
	

}
