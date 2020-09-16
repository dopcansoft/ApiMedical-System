package com.dopcan.SistemaMedico.modelos;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class radiografia {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Long idRadiografia;
	private String descripcion;
	private Date fecha;
	public Long getIdRadiografia() {
		return idRadiografia;
	}
	public void setIdRadiografia(Long idRadiografia) {
		this.idRadiografia = idRadiografia;
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
