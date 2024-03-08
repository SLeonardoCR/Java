package com.itq.nominas.app.business;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itq.nominas.app.entity.Empleado;
import com.itq.nominas.app.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImplement implements EmpleadoService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmpleadoServiceImplement.class);
	
	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Empleado> findAll() {
		return empleadoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Empleado> findAll(Pageable pageable) {
		return empleadoRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Empleado> findById(Long idEmpleado) {
		return empleadoRepository.findById(idEmpleado);
	}

	@Override
	@Transactional
	public Empleado save(Empleado empleado) {
		if(empleado.getNombre()==null || empleado.getApellidoPate()==null) {
    		LOGGER.warn("Valor de nombre y/o de apellidoPaterno es null");
    		System.out.println("El Nombre y Apellido Paterno son requeridos");
    		throw new IllegalArgumentException("El nombre nombre y apellidoPaterno son requeridos");
    	}
		if(empleado.getNombre().length()<2 || empleado.getApellidoPate().length() < 3 ) {
    		LOGGER.warn("Valor de Nombre y/o de apellidoPaterno es menor a 2 y 3 respectivamente");
    		System.out.println("El Nombre y Apellido Paterno deben ser mayor 2 y 3 respectivamente");
    		throw new IllegalArgumentException("El Nombre y Apellido Paterno deben ser mayor 2 y 3 respectivamente");
    	}
		if(empleado.getEstatus() == null) {
    		LOGGER.warn("Valor estatus es null");
    		System.out.println("El estatus es requerido");
    		throw new IllegalArgumentException("El estatus es requerido");
    	}
		if(empleado.getGenero() == null) {
    		LOGGER.warn("Valor Genero es null");
    		System.out.println("El Genero es requerido");
    		throw new IllegalArgumentException("El Genero es requerido");
    	}
		if(empleado.getGenero().toLowerCase() == "maculino" || empleado.getGenero().toLowerCase() == "femenino" ||
				empleado.getGenero().toLowerCase() == "otro" || empleado.getGenero().toLowerCase() == "hombre" ||
				empleado.getGenero().toLowerCase() == "mujer") {
    		LOGGER.warn("Valor Genero es " + empleado.getGenero());
    		System.out.println("El Genero debe ser masculino, femenino u otro");
    		throw new IllegalArgumentException("El Genero debe ser masculino, femenino u otro");
    	}
		if(empleado.getDireccion() == null || empleado.getDireccion().length() <= 5) {
    		LOGGER.warn("Valor Direccion es null o menor a 5");
    		System.out.println("El Direccion es requerido y debe ser mayor a 5 carácteres");
    		throw new IllegalArgumentException("El Direccion es requerido y debe ser mayor a 5 carácteres");
    	}
		if(empleado.getEdad() <= 16 || empleado.getEdad() >= 60) {
    		LOGGER.warn("Edad es menor de 16 o mayor de 60");
    		System.out.println("La edad no puede ser menor de 16 ni mayor de 60");
    		throw new IllegalArgumentException("La edad no puede ser menor de 16 ni mayor de 60");
    	}
		if(empleado.getEmail() == null) {
    		LOGGER.warn("Valor Email es null");
    		System.out.println("El Email es requerido");
    		throw new IllegalArgumentException("El Email es requerido");
    	}
		if(!empleado.getEmail().contains("@")) {
    		LOGGER.warn("No es formato email");
    		System.out.println("Tiene que ser formato Email");
    		throw new IllegalArgumentException("Tiene que ser formato Email");
    	}
		if(empleado.getTelefono() == null) {
    		LOGGER.warn("Valor Telefono es null");
    		System.out.println("El Telefono es requerido");
    		throw new IllegalArgumentException("El Telefono es requerido");
    	}
		if(empleado.getTelefono().toString().length() != 10) {
    		LOGGER.warn("El teléfono es de " + empleado.getTelefono().toString().length() + " dígitos");
    		System.out.println("El teléfono debe de ser de 10 dígitos");
    		throw new IllegalArgumentException("El teléfono debe de ser de 10 dígitos");
    	}
		return empleadoRepository.save(empleado);
	}

	@Override
	@Transactional
	public void deleteById(Long idEmpleado) {
		empleadoRepository.deleteById(idEmpleado);
	}

}
