package com.dopcan.SistemaMedico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dopcan.SistemaMedico.modelos.consultorio;


public interface IconsultoriosRepository extends JpaRepository<consultorio, Integer>{
    @Query("SELECT m FROM consultorio m WHERE m.numConsultorio = :numConsultorio")
    public consultorio findNumConsultorio(@Param("numConsultorio") String numConsult);

}
