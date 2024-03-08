package com.itq.nominas.app.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitud_permisos")
public class SolicitudPermisos implements Serializable{

	private static final long serialVersionUID = 8847181354987980046L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_permisos")
    private Long idPermisos;

    @Column(nullable = false)
    private int diasPedidos;

    @Column(nullable = false)
    private Date fechaInicio;

    @Column(nullable = false)
    private Date fechaRegreso;

    @OneToOne(mappedBy = "solicitudPermisos")
    @JsonIgnore
    private Empleado empleado;
    
    public void calcularFechaRegreso() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(fechaInicio);
        calendar.add(java.util.Calendar.DAY_OF_YEAR, diasPedidos);
        fechaRegreso = calendar.getTime();
    }

    public Long getIdPermisos() {
        return idPermisos;
    }

    public void setIdPermisos(Long idPermisos) {
        this.idPermisos = idPermisos;
    }

    public int getDiasPedidos() {
        return diasPedidos;
    }

    public void setDiasPedidos(int diasPedidos) {
        this.diasPedidos = diasPedidos;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
