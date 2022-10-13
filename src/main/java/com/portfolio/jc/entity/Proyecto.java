package com.portfolio.jc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tituloPr;
    private String descripcionPr;
    private String imgPr;
    private String repositorio;

    //Constructor
    public Proyecto() {
    }

    public Proyecto(String tituloPr, String descripcionPr, String imgPr, String repositorio) {
        this.tituloPr = tituloPr;
        this.descripcionPr = descripcionPr;
        this.imgPr = imgPr;
        this.repositorio = repositorio;
    }

    //Getter y Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloPr() {
        return tituloPr;
    }

    public void setTituloPr(String tituloPr) {
        this.tituloPr = tituloPr;
    }

    public String getDescripcionPr() {
        return descripcionPr;
    }

    public void setDescripcionPr(String descripcionPr) {
        this.descripcionPr = descripcionPr;
    }

    public String getImgPr() {
        return imgPr;
    }

    public void setImgPr(String imgPr) {
        this.imgPr = imgPr;
    }

    public String getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(String repositorio) {
        this.repositorio = repositorio;
    }
}