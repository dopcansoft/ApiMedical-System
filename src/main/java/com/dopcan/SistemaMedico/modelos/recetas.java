package com.dopcan.SistemaMedico.modelos;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;


/**
 * @author dopcan
 * @version 1.0
 */

@Entity
public class recetas {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Long idReceta;
	private Date fecha;
	private String tratamiento;
	
	
	@OneToMany
	@JoinColumn (name= "idRecetas")
	@OrderBy
	private List<medicina> lstMedicina;
	
	public Long getIdReceta() {
		return idReceta;
	}
	public void setIdReceta(Long idReceta) {
		this.idReceta = idReceta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	public List<medicina> getLstMedicina() {
		return lstMedicina;
	}
	public void setLstMedicina(List<medicina> lstMedicina) {
		this.lstMedicina = lstMedicina;
	}

	
	
}
