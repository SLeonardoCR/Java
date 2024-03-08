package com.itq.nominas.app.dto;

public class VacacionesDTO {

    private Long idVacaciones;
    private Integer diasPorLey;
    private Integer diasTomados;
    private Integer diasTotales;

    public VacacionesDTO() {
    }

    public Long getIdVacaciones() {
        return idVacaciones;
    }

    public void setIdVacaciones(Long idVacaciones) {
        this.idVacaciones = idVacaciones;
    }

    public Integer getDiasPorLey() {
        return diasPorLey;
    }

    public void setDiasPorLey(Integer diasPorLey) {
        this.diasPorLey = diasPorLey;
    }

    public Integer getDiasTomados() {
        return diasTomados;
    }

    public void setDiasTomados(Integer diasTomados) {
        this.diasTomados = diasTomados;
    }

    public Integer getDiasTotales() {
        return diasTotales;
    }

    public void setDiasTotales(Integer diasTotales) {
        this.diasTotales = diasTotales;
    }
}
