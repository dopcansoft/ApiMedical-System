package com.dopcan.SistemaMedico.modelos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class pacientes {
    
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int idPaciente;
		
	private String nombre;
	private String apePat;
	private String apeMat;
	private String direccion;
	private String telefonoCel;
	private Date fechaNacimiento;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn (name="idConsultorio")
	private consultorio consultorio;
	
	@JsonManagedReference
	@OneToMany
	@JoinColumn (name ="idExpediente")
	private List<expedientes> expediente= new ArrayList<>();
	
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApePat() {
		return apePat;
	}
	public void setApePat(String apePat) {
		this.apePat = apePat;
	}
	public String getApeMat() {
		return apeMat;
	}
	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefonoCel() {
		return telefonoCel;
	}
	public void setTelefonoCel(String telefonoCel) {
		this.telefonoCel = telefonoCel;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public consultorio getConsultorio() {
		return consultorio;
	}
	public void setConsultorio(consultorio consultorio) {
		this.consultorio = consultorio;
	}
	
	
}
