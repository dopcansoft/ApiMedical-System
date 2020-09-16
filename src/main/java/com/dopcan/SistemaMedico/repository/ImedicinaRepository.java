package com.dopcan.SistemaMedico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dopcan.SistemaMedico.modelos.medicina;

public interface ImedicinaRepository extends JpaRepository<medicina, Integer> {

}
