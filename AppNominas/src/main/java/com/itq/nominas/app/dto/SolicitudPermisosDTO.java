package com.itq.nominas.app.dto;

import java.util.Date;

public class SolicitudPermisosDTO {

    private Long idPermisos;
    private int diasPedidos;
    private Date fechaInicio;
    private Date fechaRegreso;

    public SolicitudPermisosDTO() {
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
}
