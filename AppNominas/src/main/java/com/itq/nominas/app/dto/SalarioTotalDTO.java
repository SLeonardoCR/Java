package com.itq.nominas.app.dto;

public class SalarioTotalDTO {

    private Long idSalarioT;
    private Float salarioBase;
    private int horasExtra;
    private Float pagoPorHorasExtra;
    private Float salarioTotal;

    public SalarioTotalDTO() {
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

    public Float getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(Float salarioTotal) {
        this.salarioTotal = salarioTotal;
    }
}
