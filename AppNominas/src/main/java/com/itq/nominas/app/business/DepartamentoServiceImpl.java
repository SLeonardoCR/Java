package com.itq.nominas.app.business;

import com.itq.nominas.app.entity.Departamento;
import com.itq.nominas.app.repository.DepartamentoRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartamentoServiceImpl.class);
	
    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Override
    public Departamento saveDepartamento(Departamento departamento) {
    	if(departamento.getNombre()==null) {
    		LOGGER.warn("Valor de nombre de departamento null");
    		System.out.println("El nombre del departamento es requerido");
    		throw new IllegalArgumentException("El nombre del departamento es requerido");
    	}
    	if(departamento.getEncargado()==null) {
    		LOGGER.warn("Valor de encargado de departamento null");
    		System.out.println("El encargado del departamento es requerido");
    		throw new IllegalArgumentException("El encargado del departamento es requerido");
    	}
    	return departamentoRepository.save(departamento);
    }

    @Override
    public Optional<Departamento> getDepartamento(Long departamentoId) {
        return departamentoRepository.findById(departamentoId);
    }

    @Override
    public List<Departamento> getAllDepartamentos() {
        return departamentoRepository.findAll();
    }

    @Override
    public void deleteDepartamento(Long departamentoId) {
        departamentoRepository.deleteById(departamentoId);
    }
}
