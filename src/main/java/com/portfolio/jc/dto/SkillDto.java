package com.portfolio.jc.dto;

import javax.validation.constraints.NotBlank;

public class SkillDto {
    @NotBlank
    private String nombreSk;
    @NotBlank
    private int porcentaje;

    //Constructor
    public SkillDto() {
    }

    public SkillDto(String nombreSk, int porcentaje) {
        this.nombreSk = nombreSk;
        this.porcentaje = porcentaje;
    }

    //Getter y Setter
    public String getNombreSk() {
        return nombreSk;
    }

    public void setNombreSk(String nombreSk) {
        this.nombreSk = nombreSk;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }    
}
