package com.itq.nominas.app.dto;

public class EmpleadoDTO {

    private Long idEmpleado;
    private String nombre;
    private String apellidoPate;
    private String apellidoMate;
    private Boolean estatus;
    private String genero;
    private String direccion;
    private int edad;
    private String email;
    private Long telefono;
    private SalarioTotalDTO salarioTotal;
    private PuestoDTO puesto;
    private VacacionesDTO vacaciones;
    private SolicitudPermisosDTO solicitudPermisos;

    public EmpleadoDTO() {
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

    public SalarioTotalDTO getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(SalarioTotalDTO salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public PuestoDTO getPuesto() {
        return puesto;
    }

    public void setPuesto(PuestoDTO puesto) {
        this.puesto = puesto;
    }

    public VacacionesDTO getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(VacacionesDTO vacaciones) {
        this.vacaciones = vacaciones;
    }

    public SolicitudPermisosDTO getSolicitudPermisos() {
        return solicitudPermisos;
    }

    public void setSolicitudPermisos(SolicitudPermisosDTO solicitudPermisos) {
        this.solicitudPermisos = solicitudPermisos;
    }
}
