package com.dopcan.SistemaMedico.modelos;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class analisisClinico {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Long idAnalisisClinico;
	private String descripcion;
	private Date fecha;
	public Long getIdAnalisisClinico() {
		return idAnalisisClinico;
	}
	public void setIdAnalisisClinico(Long idAnalisisClinico) {
		this.idAnalisisClinico = idAnalisisClinico;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
