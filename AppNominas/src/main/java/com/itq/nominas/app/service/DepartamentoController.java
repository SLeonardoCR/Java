package com.itq.nominas.app.service;

import com.itq.nominas.app.entity.Departamento;
import com.itq.nominas.app.business.DepartamentoService;
import com.itq.nominas.app.business.DepartamentoServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmpleadoController.class);
	
    @Autowired
    private DepartamentoService departamentoService;

    @PostMapping
    public ResponseEntity<?> createDepartamento(@RequestBody Departamento departamento) {
        try {
            departamentoService.saveDepartamento(departamento);
            return ResponseEntity.status(HttpStatus.CREATED).body("Se creó el departamento con éxito");
        } catch (Exception e) {
        	LOGGER.error("Error al crear departamento");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/{departamentoId}")
    public ResponseEntity<?> getDepartamento(@PathVariable Long departamentoId) {
        try {
            Optional<Departamento> departamento = departamentoService.getDepartamento(departamentoId);
            return departamento.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
        	LOGGER.error("Error al obtener el departamento");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al obtener el departamento");
        }
    }

    @GetMapping
    public ResponseEntity<List<Departamento>> getAllDepartamentos() {
        try {
            List<Departamento> departamentos = departamentoService.getAllDepartamentos();
            return ResponseEntity.ok(departamentos);
        } catch (Exception e) {
        	LOGGER.error("Error al obtener todos los departamento");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{departamentoId}")
    public ResponseEntity<?> updateDepartamento(@PathVariable Long departamentoId, @RequestBody Departamento departamentoDetails) {
        try {
            Optional<Departamento> optionalDepartamento = departamentoService.getDepartamento(departamentoId);
            if (optionalDepartamento.isPresent()) {
                Departamento departamento = optionalDepartamento.get();
                departamento.setNombre(departamentoDetails.getNombre());
                departamento.setEncargado(departamentoDetails.getEncargado());
                departamentoService.saveDepartamento(departamento);
                return ResponseEntity.ok().body("Se actualizó el departamento con éxito");
            } else {
            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el departamento");
            }
        } catch (Exception e) {
        	LOGGER.error("Error al actualizar departamento");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar el departamento");
        }
    }

    @DeleteMapping("/{departamentoId}")
    public ResponseEntity<?> deleteDepartamento(@PathVariable Long departamentoId) {
        try {
            if (departamentoService.getDepartamento(departamentoId).isPresent()) {
                departamentoService.deleteDepartamento(departamentoId);
                return ResponseEntity.ok().body("Se borró el departamento con éxito");
            } else {
            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el departamento");
            }
        } catch (Exception e) {
        	LOGGER.error("Error al borrar departamento");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al borrar el departamento");
        }
    }
}
