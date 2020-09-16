package com.dopcan.SistemaMedico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dopcan.SistemaMedico.modelos.recetas;

public interface IrecetasRepository extends JpaRepository<recetas, Long> {

}
