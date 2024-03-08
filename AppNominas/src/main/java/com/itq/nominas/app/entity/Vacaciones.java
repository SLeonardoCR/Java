package com.itq.nominas.app.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vacaciones")
public class Vacaciones implements Serializable{
    
	private static final long serialVersionUID = -6136058672402896049L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVacaciones;
    
    @Column(nullable = false)
    private Integer diasPorLey;
    
    @Column(nullable = false)
    private Integer diasTomados;
    
    @Column(nullable = false)
    private Integer diasTotales;
    
    @OneToOne(mappedBy = "vacaciones")
    @JsonIgnore
    private Empleado empleado;
    
    public void calcularDiasTotales() {
        diasTotales = diasPorLey - diasTomados;
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

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
    
}
