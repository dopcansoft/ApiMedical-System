package com.dopcan.SistemaMedico.modelos;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.OrderBy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.sql.Date;


@Entity
public class medicos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idMedicos;
	
    private String ApePat;
    
    private String ApeMat;
	
    private String Nombre;
    
    private String Direccion;
    
    private String TelefonoCel;
    
    private String TelefonoCasa;
    
    private Date FechaNacimiento;
    
    private String Cedula;
    
    private String Universidad;
    
    private int yearOld;
    
    private int yearSkill;
    
    private String horario;
    
    //@JsonManagedReference
    @ManyToOne 
    @JoinColumn (name = "idConsultorio", nullable = true, updatable = false) //(name="idConsultorio")
    @OrderBy
    private consultorio consultorios;

	public int getIdMedicos() {
		return idMedicos;
	}

	public void setIdMedicos(int idMedicos) {
		this.idMedicos = idMedicos;
	}

	public String getApePat() {
		return ApePat;
	}

	public void setApePat(String apePat) {
		ApePat = apePat;
	}

	public String getApeMat() {
		return ApeMat;
	}

	public void setApeMat(String apeMat) {
		ApeMat = apeMat;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefonoCel() {
		return TelefonoCel;
	}

	public void setTelefonoCel(String telefonoCel) {
		TelefonoCel = telefonoCel;
	}

	public String getTelefonoCasa() {
		return TelefonoCasa;
	}

	public void setTelefonoCasa(String telefonoCasa) {
		TelefonoCasa = telefonoCasa;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public String getUniversidad() {
		return Universidad;
	}

	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}

	public int getYearOld() {
		return yearOld;
	}

	public void setYearOld(int yearOld) {
		this.yearOld = yearOld;
	}

	public int getYearSkill() {
		return yearSkill;
	}

	public void setYearSkill(int yearSkill) {
		this.yearSkill = yearSkill;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	//@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public consultorio getConsultorios() {
		return consultorios;
	}

	public void setConsultorios(consultorio consultorios) {
		this.consultorios = consultorios;
	}
    
}
