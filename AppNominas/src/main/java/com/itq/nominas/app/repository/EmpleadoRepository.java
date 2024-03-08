package com.itq.nominas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itq.nominas.app.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
	
}
