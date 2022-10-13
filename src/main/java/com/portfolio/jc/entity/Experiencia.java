package com.portfolio.jc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tituloEx;
    private String empleador;
    private int fechaInicio;
    private int fechaFin;
    private String descripcionEx;

    //Constructor
    public Experiencia() {
    }

    public Experiencia(String tituloEx, String empleador, int fechaInicio, int fechaFin, String descripcionEx) {
        this.tituloEx = tituloEx;
        this.empleador = empleador;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcionEx = descripcionEx;
    }

    //Getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
