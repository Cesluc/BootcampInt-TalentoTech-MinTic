package com.empresa.cruddeforestacionapi.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

// Una entidad es un objeto que se va a mapear a la fila de una tabla
@Entity 
@Table(name = "areas_criticas" )
public class AreaCriticaEntity {
    
    @Id //Asi le decimos que es nuestra clave primaria
    @GeneratedValue(strategy =  GenerationType.IDENTITY) // Asi le decimos que es nuestra llave primaria que se crea automaticamente
    private Long id; // Se trabaja con Long porque el ORM en el repositorio no acepta primitivos, por eso es un envolvente Long.

    @NotNull // No se acepten valores nulos en el campo
    @Column(nullable = false) // para que no se ingrese nada vacio en elcampo
    @Size(min = 2, max = 100) // Determinamos el minimo y maximo del tamaño
    private String nombre;

    @NotNull
    @Column(nullable = false)
    @Size( min = 10, max = 500)
    private String descripcion;

    @NotNull
    @Column(nullable = false)
    private Double latitud;

    @NotNull
    @Column(nullable = false)
    private Double longitud;

    @Column(name = "indice_deforestacion")
    private Double indiceDeforestacion;

    @OneToMany(mappedBy = "areaCriticaEntity", cascade = CascadeType.ALL) // Para hacer la relacion con evaluaciones ferroviarias
    private List<EvaluacionFerroviariaEntity> evaluacionFerroviariaEntities;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getIndiceDeforestacion() {
        return indiceDeforestacion;
    }

    public void setIndiceDeforestacion(Double indiceDeforestacion) {
        this.indiceDeforestacion = indiceDeforestacion;
    }

    public List<EvaluacionFerroviariaEntity> getEvaluacionFerroviariaEntities() {
        return evaluacionFerroviariaEntities;
    }

    public void setEvaluacionFerroviariaEntities(List<EvaluacionFerroviariaEntity> evaluacionFerroviariaEntities) {
        this.evaluacionFerroviariaEntities = evaluacionFerroviariaEntities;
    }



}
