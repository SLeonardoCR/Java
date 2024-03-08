package com.itq.nominas.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "puestos")
public class Puesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_puesto")
    private Long idPuesto;

    @Column(nullable = false)
    private String nombrePuesto;

    @Column(nullable = false)
    private Float salarioPuesto;

    @Column (nullable = false)
    private String descripcion;
    
	@Column(name = "id_departamento", nullable=false)
    private Long idDepartamento;

    public Puesto() {
    }

    public Puesto(String nombrePuesto, Float salarioPuesto, String descripcion) {
        this.nombrePuesto = nombrePuesto;
        this.salarioPuesto = salarioPuesto;
        this.descripcion = descripcion;
    }
    
    public Long getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Long idDepartamento) {
		this.idDepartamento = idDepartamento;
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
