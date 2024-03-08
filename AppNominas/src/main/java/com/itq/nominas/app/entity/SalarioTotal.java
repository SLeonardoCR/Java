package com.itq.nominas.app.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salario_total")
public class SalarioTotal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_salario_t")
    private Long idSalarioT;

    @OneToOne
    @JsonIgnore
    private Empleado empleado;

    @Column(name = "salario_base")
    private Float salarioBase;

    @Column(name = "horas_extra")
    private int horasExtra;

    @Column(name = "pago_por_horas_extra")
    private Float pagoPorHorasExtra;

    @Column(name = "salario_total")
    private Float salarioTotal;

    public SalarioTotal() {
    	
    }

    public SalarioTotal(Empleado empleado, Float salarioBase, int horasExtra, Float pagoPorHorasExtra) {
        this.empleado = empleado;
        this.salarioBase = salarioBase;
        this.horasExtra = horasExtra;
        this.pagoPorHorasExtra = pagoPorHorasExtra;
        this.salarioTotal = calcularSalarioTotal();
    }

    public Float calcularSalarioTotal() {
        return salarioBase + (horasExtra * pagoPorHorasExtra);
    }

	public Long getIdSalarioT() {
		return idSalarioT;
	}

	public void setIdSalarioT(Long idSalarioT) {
		this.idSalarioT = idSalarioT;
	}

	public Float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public Float getPagoPorHorasExtra() {
		return pagoPorHorasExtra;
	}

	public void setPagoPorHorasExtra(Float pagoPorHorasExtra) {
		this.pagoPorHorasExtra = pagoPorHorasExtra;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Float getSalarioTotal() {
		return salarioTotal;
	}

	public void setSalarioTotal(Float salarioTotal) {
		this.salarioTotal = salarioTotal;
	}

    
}