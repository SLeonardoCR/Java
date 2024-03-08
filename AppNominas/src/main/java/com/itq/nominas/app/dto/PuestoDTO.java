package com.itq.nominas.app.dto;

public class PuestoDTO {

    private Long idPuesto;
    private String nombrePuesto;
    private Float salarioPuesto;
    private String descripcion;

    public PuestoDTO() {
    }
    
    public Long getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Long idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public Float getSalarioPuesto() {
        return salarioPuesto;
    }

    public void setSalarioPuesto(Float salarioPuesto) {
        this.salarioPuesto = salarioPuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
