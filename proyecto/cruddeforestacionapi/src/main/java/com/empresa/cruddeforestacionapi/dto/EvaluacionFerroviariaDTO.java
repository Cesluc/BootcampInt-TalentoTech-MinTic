package com.empresa.cruddeforestacionapi.dto;

import java.time.LocalDateTime;

public class EvaluacionFerroviariaDTO {
    
    private Long id;
    private String nombreRuta;
    private String informeViabilidad;
    private LocalDateTime fechaEvaluacion;
    private Long areaCriticaEntity;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreRuta() {
        return nombreRuta;
    }
    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }
    public String getInformeViabilidad() {
        return informeViabilidad;
    }
    public void setInformeViabilidad(String informeViabilidad) {
        this.informeViabilidad = informeViabilidad;
    }
    public LocalDateTime getFechaEvaluacion() {
        return fechaEvaluacion;
    }
    public void setFechaEvaluacion(LocalDateTime fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }
    public Long getAreaCriticaEntity() {
        return areaCriticaEntity;
    }
    public void setAreaCriticaEntity(Long areaCriticaEntity) {
        this.areaCriticaEntity = areaCriticaEntity;
    }

    
}
