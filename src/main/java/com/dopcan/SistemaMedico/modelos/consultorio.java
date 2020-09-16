package com.dopcan.SistemaMedico.modelos;

//import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

@Entity
public class consultorio {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int idConsultorio;
	
	private String numConsultorio;
	
	private String area;
	
	@OneToMany //(mappedBy = "consultorios")  //cascade = CascadeType.ALL,
	@JoinColumn (name = "idConsultorio")
	@JsonIgnore //@JsonBackReference
	@OrderBy
	private  List<medicos> medicos = new ArrayList<>();
  
	/*
	@JsonManagedReference
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn (name="idPaciente")
	@OrderBy
	private List<pacientes> lstPacientes = new ArrayList<>(); 
	*/
	
	public int getIdConsultorio() {
		return idConsultorio;
	}

	public void setIdConsultorio(int idConsultorio) {
		this.idConsultorio = idConsultorio;
	}

	public String getNumConsultorio() {
		return numConsultorio;
	}

	public void setNumConsultorio(String numConsultorio) {
		this.numConsultorio = numConsultorio;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	
	//@JsonIgnore
	public List<medicos> getMedicos() {
		return medicos;
	}

	public void setMedicos(List<medicos> medicos) {
		this.medicos = medicos;
	}

/*
	@JsonIgnore
	public List<pacientes> getLstPacientes() {
		return lstPacientes;
	}

	public void setLstPacientes(List<pacientes> lstPacientes) {
		this.lstPacientes = lstPacientes;
	}*/
	
	

}
