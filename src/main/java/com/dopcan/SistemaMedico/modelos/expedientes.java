package com.dopcan.SistemaMedico.modelos;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;

/**
 * @author dopcan
 * @version 1.0
 * @category DTO
 * @implNote DTO para el mapeado de la tabla expedientes
 */
@Entity
public class expedientes {

	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
	private int IdExpediente;
	private String diagnostico;
	private String sintomas;
	private Date fecha;
	
	@OneToOne
	@JoinColumn (name="idAnalisisClinico")
	private analisisClinico analisisClinico;
	
	@OneToOne
	@JoinColumn (name="idRadiografia")
	private radiografia radiografia;
	
	@OneToOne
	@JoinColumn (name= "idReceta")
	private recetas receta;
	
	@ManyToOne
	@JoinColumn (name="idPaciente")
	@OrderBy
	private pacientes paciente;
	
	public int getIdExpediente() {
		return IdExpediente;
	}
	public void setIdExpediente(int idExpediente) {
		IdExpediente = idExpediente;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public analisisClinico getAnalisisClinico() {
		return analisisClinico;
	}
	public void setAnalisisClinico(analisisClinico analisisClinico) {
		this.analisisClinico = analisisClinico;
	}
	public radiografia getRadiografia() {
		return radiografia;
	}
	public void setRadiografia(radiografia radiografia) {
		this.radiografia = radiografia;
	}
	public recetas getReceta() {
		return receta;
	}
	public void setReceta(recetas receta) {
		this.receta = receta;
	}
	
	
}
