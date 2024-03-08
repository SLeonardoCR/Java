package com.itq.nominas.app.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itq.nominas.app.entity.Empleado;
import com.itq.nominas.app.entity.Puesto;
import com.itq.nominas.app.entity.SalarioTotal;
import com.itq.nominas.app.entity.SolicitudPermisos;
import com.itq.nominas.app.entity.Vacaciones;
import com.itq.nominas.app.business.EmpleadoService;
import com.itq.nominas.app.business.PuestoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmpleadoController.class);
	
    @Autowired
    private PuestoService puestoService;

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Empleado empleado) {
        try {
            if (empleado.getSalarioTotal() != null) {
                empleado.getSalarioTotal().setSalarioTotal(empleado.getSalarioTotal().calcularSalarioTotal());
            }
            empleadoService.save(empleado);
            LOGGER.debug("Empleado registrado con exito");
            return ResponseEntity.status(HttpStatus.CREATED).body("Empleado registrado con exito");
        } catch (Exception e) {
        	LOGGER.error("Error al crear el empleado");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el empleado");
        }
    }

    @GetMapping("/{idEmpleado}")
    public ResponseEntity<?> read(@PathVariable Long idEmpleado) {
        try {
            Optional<Empleado> oEmpleado = empleadoService.findById(idEmpleado);

            if (!oEmpleado.isPresent())
            {
            	LOGGER.debug("No se encontró el empleado");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el empleado");
            }
            	
            return ResponseEntity.ok(oEmpleado);
        } catch (Exception e) {
        	LOGGER.debug("Error al obtener el empleado");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al obtener el empleado");
        }
    }

    @PutMapping("/{idEmpleado}")
    public ResponseEntity<?> update(@RequestBody Empleado empleadoDetails, @PathVariable Long idEmpleado) {
        try {
            Optional<Empleado> oEmpleado = empleadoService.findById(idEmpleado);
            if (!oEmpleado.isPresent())
            {
            	LOGGER.debug("No se encontró el empleado");
            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el empleado");
            }
                
            BeanUtils.copyProperties(empleadoDetails, oEmpleado.get(), "idEmpleado");
            empleadoService.save(oEmpleado.get());
            LOGGER.debug("Se actualizó el empleado con éxito");
            return ResponseEntity.status(HttpStatus.CREATED).body("Se actualizó el empleado con éxito");
        } catch (Exception e) {
        	LOGGER.error("Error al actualizar el empleado");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar el empleado");
        }
    }

    @DeleteMapping("/{idEmpleado}")
    public ResponseEntity<?> delete(@PathVariable Long idEmpleado) {
        try {
            Optional<Empleado> oEmpleado = empleadoService.findById(idEmpleado);

            if (!oEmpleado.isPresent())
            {
            	LOGGER.debug("No se encontró el empleado");
            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el empleado");
            }
            	

            empleadoService.deleteById(idEmpleado);
            LOGGER.debug("Se borró el empleado con éxito");
            return ResponseEntity.ok().body("Se borró el empleado con éxito");
        } catch (Exception e) {
        	LOGGER.error("Error al borrar el empleado");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al borrar el empleado");
        }
    }

    @GetMapping
    public ResponseEntity<List<Empleado>> readAll() {
        try {
            List<Empleado> empleados = StreamSupport.stream(empleadoService.findAll().spliterator(), false)
                    .collect(Collectors.toList());
            LOGGER.debug("Se obtuvieron los empleados con éxito");
            return ResponseEntity.ok(empleados);
        } catch (Exception e) {
        	LOGGER.error("Error al obtener los empleados");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{idEmpleado}/cambioSalario")
    public ResponseEntity<?> cambiarSalario(@PathVariable Long idEmpleado,
            @RequestBody SalarioTotal salarioTotalDetails) {

        try {
            Optional<Empleado> oEmpleado = empleadoService.findById(idEmpleado);
            if (!oEmpleado.isPresent())
            {
            	LOGGER.debug("No se encontró el empleado");
            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el empleado");
            }
            	

            BeanUtils.copyProperties(salarioTotalDetails, oEmpleado.get().getSalarioTotal(), "idSalarioT");

            oEmpleado.get().getSalarioTotal().setSalarioTotal(oEmpleado.get().getSalarioTotal().calcularSalarioTotal());
            
            empleadoService.save(oEmpleado.get());
            LOGGER.debug("Se actualizó el empleado con éxito");
            return ResponseEntity.status(HttpStatus.CREATED).body("Se actualizó el empleado con éxito");
        } catch (Exception e) {
        	LOGGER.error("Error al actualizar el empleado");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar el empleado");
        }
    }

    @PutMapping("/{idEmpleado}/puesto")
    public ResponseEntity<?> asignarPuesto(@PathVariable Long idEmpleado, @RequestBody Puesto puesto) {
        try {
            Optional<Empleado> oEmpleado = empleadoService.findById(idEmpleado);
            Long idPuesto = puesto.getIdPuesto();
            if (!oEmpleado.isPresent()) {
            	LOGGER.debug("No se encontró el empleado");
            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el empleado");
            }

            Optional<Puesto> oPuesto = puestoService.getPuesto(idPuesto);
            if (!oPuesto.isPresent()) {
            	LOGGER.debug("No se encontró el puesto");
            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el puesto");
            }

            Empleado empleado = oEmpleado.get();
            empleado.setPuesto(oPuesto.get());

            if (empleado.getSalarioTotal() == null) {
                empleado.setSalarioTotal(new SalarioTotal(null, oPuesto.get().getSalarioPuesto(), 0, 0.0f));
            } else {
                empleado.getSalarioTotal().setSalarioBase(oPuesto.get().getSalarioPuesto());
            }

            empleado.getSalarioTotal().setSalarioTotal(empleado.getSalarioTotal().calcularSalarioTotal());
            empleadoService.save(empleado);
            LOGGER.debug("Se actualizó el empleado con éxito");
            return ResponseEntity.status(HttpStatus.CREATED).body("Se actualizó el empleado con éxito");
        } catch (Exception e) {
        	LOGGER.error("Error al actualizar el empleado");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar el empleado");
        }
    }

    @PutMapping("/{idEmpleado}/vacaciones")
    public ResponseEntity<?> actualizarVacaciones(@PathVariable Long idEmpleado, @RequestBody Vacaciones vacaciones) {
        try {
            Optional<Empleado> oEmpleado = empleadoService.findById(idEmpleado);
            if (!oEmpleado.isPresent()) {
            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el empleado");
            }

            Empleado empleado = oEmpleado.get();
            Vacaciones empleadoVacaciones = empleado.getVacaciones();

            if (empleadoVacaciones == null) {
                empleadoVacaciones = new Vacaciones();
                empleado.setVacaciones(empleadoVacaciones);
            }

            empleadoVacaciones.setDiasPorLey(vacaciones.getDiasPorLey());
            empleadoVacaciones.setDiasTomados(vacaciones.getDiasTomados());
            empleadoVacaciones.calcularDiasTotales();

            empleadoService.save(empleado);

            LOGGER.debug("Se actualizó el empleado con éxito");
            return ResponseEntity.status(HttpStatus.CREATED).body("Se actualizó el empleado con éxito");
        } catch (Exception e) {
        	LOGGER.error("Error al actualizar el empleado");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar el empleado");
        }
    }

    @PutMapping("/{idEmpleado}/cambioPermisos")
    public ResponseEntity<?> actualizarPermisos(@PathVariable Long idEmpleado, @RequestBody SolicitudPermisos solicitudPermisos) {
        try {
            Optional<Empleado> oEmpleado = empleadoService.findById(idEmpleado);
            if (!oEmpleado.isPresent()) {
            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el empleado");
            }

            Empleado empleado = oEmpleado.get();
            SolicitudPermisos empleadoPermisos = empleado.getSolicitudPermisos();

            if (empleadoPermisos == null) {
                empleadoPermisos = new SolicitudPermisos();
                empleado.setSolicitudPermisos(empleadoPermisos);
            }

            empleadoPermisos.setDiasPedidos(solicitudPermisos.getDiasPedidos());
            empleadoPermisos.setFechaInicio(solicitudPermisos.getFechaInicio());
            empleadoPermisos.calcularFechaRegreso();

            empleadoService.save(empleado);

            LOGGER.debug("Se actualizó el empleado con éxito");
            return ResponseEntity.status(HttpStatus.CREATED).body("Se actualizó el empleado con éxito");
        } catch (Exception e) {
        	LOGGER.error("Error al actualizar el empleado");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar el empleado");
        }
    }
}
