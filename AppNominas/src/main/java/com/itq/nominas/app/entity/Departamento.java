package com.itq.nominas.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamento implements Serializable{

	private static final long serialVersionUID = -7270562229259896830L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private Long idDepartamento;

    @Column(nullable = false, unique = true)
    private String nombre;
    
    @Column(nullable = false)
    private String encargado;
    
    public Departamento() {

    }

    public String getEncargado() {
		return encargado;
	}

	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}

	public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
