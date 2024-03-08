package com.itq.nominas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itq.nominas.app.entity.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
