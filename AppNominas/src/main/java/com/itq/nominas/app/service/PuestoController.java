package com.itq.nominas.app.service;

import com.itq.nominas.app.entity.Puesto;
import com.itq.nominas.app.business.PuestoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/puestos")
public class PuestoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PuestoController.class);
	
    @Autowired
    private PuestoService puestoService;

    @PostMapping
    public ResponseEntity<?> createPuesto(@RequestBody Puesto puesto) {
        try {
            puestoService.savePuesto(puesto);
            return ResponseEntity.status(HttpStatus.CREATED).body("Se creó el puesto con éxito");
        } catch (Exception e) {
        	LOGGER.error("Error al crear puesto");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el puesto");
        }
    }

    @GetMapping("/{idPuesto}")
    public ResponseEntity<?> getPuesto(@PathVariable Long idPuesto) {
        try {
            Optional<Puesto> puesto = puestoService.getPuesto(idPuesto);
            return puesto.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
        	LOGGER.error("Error al obtener puesto");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al obtener el puesto");
        }
    }

    @GetMapping
    public ResponseEntity<List<Puesto>> getAllPuestos() {
        try {
            List<Puesto> puestos = puestoService.getAllPuestos();
            return ResponseEntity.ok(puestos);
        } catch (Exception e) {
        	LOGGER.error("Error al obtener todos los puestos");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{idPuesto}")
    public ResponseEntity<?> updatePuesto(@PathVariable Long idPuesto, @RequestBody Puesto puestoDetails) {
        try {
            Optional<Puesto> optionalPuesto = puestoService.getPuesto(idPuesto);
            if (optionalPuesto.isPresent()) {
                Puesto puesto = optionalPuesto.get();
                puesto.setNombrePuesto(puestoDetails.getNombrePuesto());
                puesto.setSalarioPuesto(puestoDetails.getSalarioPuesto());
                puesto.setDescripcion(puestoDetails.getDescripcion());
                puestoService.savePuesto(puesto);
                return ResponseEntity.ok().body("Se actualizó el puesto con éxito");
            } else {
            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el puesto");
            }
        } catch (Exception e) {
        	LOGGER.error("Error al actualizar el puesto");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar el puesto");
        }
    }

    @DeleteMapping("/{idPuesto}")
    public ResponseEntity<?> deletePuesto(@PathVariable Long idPuesto) {
        try {
            if (puestoService.getPuesto(idPuesto).isPresent()) {
                puestoService.deletePuesto(idPuesto);
                return ResponseEntity.ok().body("Se borró el puesto con éxito");
            } else {
            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el puesto");
            }
        } catch (Exception e) {
        	LOGGER.error("Error al eliminar el puesto");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar el puesto");
        }
    }
}
