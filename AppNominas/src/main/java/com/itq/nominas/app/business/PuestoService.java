package com.itq.nominas.app.business;

import java.util.List;
import java.util.Optional;

import com.itq.nominas.app.entity.Puesto;


public interface PuestoService {
    Puesto savePuesto(Puesto puesto);
    Optional<Puesto> getPuesto(Long idPuesto);
    List<Puesto> getAllPuestos();
    void deletePuesto(Long idPuesto);
}
