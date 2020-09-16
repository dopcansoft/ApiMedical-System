package com.dopcan.SistemaMedico.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dopcan.SistemaMedico.modelos.expedientes;

public interface IexpedientesRepository extends JpaRepository<expedientes, Integer> {

}
