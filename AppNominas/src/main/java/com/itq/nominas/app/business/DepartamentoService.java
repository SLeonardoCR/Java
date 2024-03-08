package com.itq.nominas.app.business;

import java.util.List;
import java.util.Optional;

import com.itq.nominas.app.entity.Departamento;

public interface DepartamentoService {

    Departamento saveDepartamento(Departamento departamento);

    Optional<Departamento> getDepartamento(Long departamentoId);

    List<Departamento> getAllDepartamentos();

    void deleteDepartamento(Long departamentoId);
}
