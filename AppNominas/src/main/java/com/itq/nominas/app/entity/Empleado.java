package com.itq.nominas.app.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "empleados")
public class Empleado implements Serializable{
	
	private static final long serialVersionUID = -9029241550413525109L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmpleado;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private String apellidoPate;
	
	@Column
	private String apellidoMate;
	
	@Column(nullable=false)
	private Boolean estatus;
	
	@Column(nullable=false)
	private String genero;
	
	@Column(nullable=false)
	private String direccion;
	
	@Column(nullable=false, length=2)
	private int edad;
	
	@Column(name="mail", nullable=false, unique=true)
	private String email;
	
	@Column(nullable=false, length=10)
	private Long telefono;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "id_salario_t")
    private SalarioTotal salarioTotal;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_puesto")
    private Puesto puesto;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_vacaciones")
    private Vacaciones vacaciones;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "id_permisos")
	private SolicitudPermisos solicitudPermisos;

	public SolicitudPermisos getSolicitudPermisos() {
		return solicitudPermisos;
	}

	public void setSolicitudPermisos(SolicitudPermisos solicitudPermisos) {
		this.solicitudPermisos = solicitudPermisos;
	}

	public Vacaciones getVacaciones() {
		return vacaciones;
	}

	public void setVacaciones(Vacaciones vacaciones) {
		this.vacaciones = vacaciones;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public SalarioTotal getSalarioTotal() {
		return salarioTotal;
	}

	public void setSalarioTotal(SalarioTotal salarioTotal) {
		this.salarioTotal = salarioTotal;
	}

	public Long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPate() {
		return apellidoPate;
	}

	public void setApellidoPate(String apellidoPate) {
		this.apellidoPate = apellidoPate;
	}

	public String getApellidoMate() {
		return apellidoMate;
	}

	public void setApellidoMate(String apellidoMate) {
		this.apellidoMate = apellidoMate;
	}

	public Boolean getEstatus() {
		return estatus;
	}

	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
}
