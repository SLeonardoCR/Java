package com.itq.nominas.app.business;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.itq.nominas.app.entity.Empleado;

public interface EmpleadoService {
	public Iterable<Empleado> findAll();
	
	public Page<Empleado> findAll(Pageable pageable);
	
	public Optional<Empleado> findById(Long idEmpleado);
	
	public Empleado save(Empleado empleado);
	
	public void deleteById(Long idEmpleado);
	
}
