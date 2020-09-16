package com.dopcan.SistemaMedico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dopcan.SistemaMedico.modelos.medicos;

//@RepositoryRestResource(collectionResourceRel = "people", path = "medicos")
public interface ImedicosRepository extends JpaRepository<medicos, Integer> {
	
    @Query("SELECT m FROM medicos m WHERE m.consultorios.idConsultorio = :id_consultorio")
    public List<medicos> find(@Param("id_consultorio") int idConsultorio);

}
