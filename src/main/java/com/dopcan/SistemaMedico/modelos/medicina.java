package com.dopcan.SistemaMedico.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class medicina {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int idMedicina;
	
	private String medicamento;
	private String dosis;
	private String frecuencia;
	
	public int getIdMedicina() {
		return idMedicina;
	}
	public void setIdMedicina(int idMedicina) {
		this.idMedicina = idMedicina;
	}
	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	public String getDosis() {
		return dosis;
	}
	public void setDosis(String dosis) {
		this.dosis = dosis;
	}
	public String getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	
}
