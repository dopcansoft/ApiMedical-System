package com.dopcan.SistemaMedico.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dopcan.SistemaMedico.modelos.pacientes;

public interface IpacientesRepository extends JpaRepository<pacientes, Integer>{

}
