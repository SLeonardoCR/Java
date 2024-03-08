package com.itq.nominas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itq.nominas.app.entity.Puesto;

public interface PuestoRepository extends JpaRepository<Puesto, Long> {
}
