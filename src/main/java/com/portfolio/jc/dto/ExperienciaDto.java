package com.portfolio.jc.dto;

import javax.validation.constraints.NotBlank;

public class ExperienciaDto {
    @NotBlank
    private String tituloEx;
    @NotBlank
    private String empleador;
    @NotBlank
    private int fechaInicio;
    @NotBlank
    private int fechaFin;
    @NotBlank
    private String descripcionEx;

    //Constructor
    public ExperienciaDto() {
    }

    public ExperienciaDto(String tituloEx, String empleador, int fechaInicio, int fechaFin, String descripcionEx) {
        this.tituloEx = tituloEx;
        this.empleador = empleador;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcionEx = descripcionEx;
    }

    //Getter y Setter
    public String getTituloEx() {
        return tituloEx;
    }

    public void setTituloEx(String tituloEx) {
        this.tituloEx = tituloEx;
    }

    public String getEmpleador() {
        return empleador;
    }

    public void setEmpleador(String empleador) {
        this.empleador = empleador;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(int fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcionEx() {
        return descripcionEx;
    }

    public void setDescripcionEx(String descripcionEx) {
        this.descripcionEx = descripcionEx;
    }
    
    
}
