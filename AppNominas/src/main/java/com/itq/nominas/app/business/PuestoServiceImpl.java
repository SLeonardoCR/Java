package com.itq.nominas.app.business;

import com.itq.nominas.app.entity.Puesto;
import com.itq.nominas.app.repository.PuestoRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PuestoServiceImpl implements PuestoService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PuestoServiceImpl.class);

    @Autowired
    private PuestoRepository puestoRepository;

    @Override
    public Puesto savePuesto(Puesto puesto) {
    	
    	if(puesto.getNombrePuesto() == null || puesto.getNombrePuesto().length() <= 5) {
    		LOGGER.warn("Valor NombrePuesto es null");
    		System.out.println("El Nombre del Puesto es requerido");
    		throw new IllegalArgumentException("El Nombre del Puesto es requerido");
    	}
    	if(puesto.getSalarioPuesto() == null || puesto.getSalarioPuesto().toString().length() <= 5) {
    		LOGGER.warn("Valor SalarioPuesto es null");
    		System.out.println("El Salario del Puesto es requerido");
    		throw new IllegalArgumentException("El Salario del Puesto es requerido");
    	}
    	if(puesto.getDescripcion() == null || puesto.getDescripcion().length() <= 5) {
    		LOGGER.warn("Valor Descripcion es null o menor a 5 dígitos");
    		System.out.println("La Descripcion (mayor a 5 dígitos) es requerida");
    		throw new IllegalArgumentException("La Descripcion (mayor a 5 dígitos) es requerida");
    	}
        return puestoRepository.save(puesto);
    }

    @Override
    public Optional<Puesto> getPuesto(Long idPuesto) {
        return puestoRepository.findById(idPuesto);
    }

    @Override
    public List<Puesto> getAllPuestos() {
        return puestoRepository.findAll();
    }

    @Override
    public void deletePuesto(Long idPuesto) {
        puestoRepository.deleteById(idPuesto);
    }
}
