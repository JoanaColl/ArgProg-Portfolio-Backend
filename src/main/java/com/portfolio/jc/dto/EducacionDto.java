package com.portfolio.jc.dto;

import javax.validation.constraints.NotBlank;

public class EducacionDto {
    @NotBlank
    private String tituloEd;
    @NotBlank
    private String institucion;
    @NotBlank
    private int fechaInicio;
    @NotBlank
    private int fechaFin;
    @NotBlank
    private String descripcionEd;

    //Constructor
    public EducacionDto() {
    }

    public EducacionDto(String tituloEd, String institucion, int fechaInicio, int fechaFin, String descripcionEd) {
        this.tituloEd = tituloEd;
        this.institucion = institucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcionEd = descripcionEd;
    }

    //Getter y Setter
    public String getTituloEd() {
        return tituloEd;
    }

    public void setTituloEd(String tituloEd) {
        this.tituloEd = tituloEd;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
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

    public String getDescripcionEd() {
        return descripcionEd;
    }

    public void setDescripcionEd(String descripcionEd) {
        this.descripcionEd = descripcionEd;
    }
}