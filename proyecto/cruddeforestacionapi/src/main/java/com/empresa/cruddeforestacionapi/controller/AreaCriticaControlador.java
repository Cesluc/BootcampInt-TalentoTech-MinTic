package com.empresa.cruddeforestacionapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.cruddeforestacionapi.dto.AreaCriticaDTO;
import com.empresa.cruddeforestacionapi.service.AreaCriticaServicio;

@RestController // Crearemos un servicio web RESTFUL
@RequestMapping("/api/areas-criticas")
public class AreaCriticaControlador {

    @Autowired
    private AreaCriticaServicio areaCriticaServicio;
    
    @GetMapping //Metodo GET que es el que obtiene la informacion
    public List<AreaCriticaDTO> obtenerTodasAreasCriticas(){


        List<AreaCriticaDTO> areaCriticaDTOs = areaCriticaServicio.obtenerTodasAreasCriticas();
        return areaCriticaDTOs;

        // return areaCriticaServicio.obtenerTodasAreasCriticas(); Es lo mismo a lo de arriba
    }

    @GetMapping("/{id}")// -> Esto significa que este metodo va a venir por parametro
    public ResponseEntity<AreaCriticaDTO> obtenerAreaCriticaPorId(@PathVariable Long id){
        AreaCriticaDTO areaCriticaDTO = areaCriticaServicio.obtenerAreaCriticaPorId(id);

        return ResponseEntity.ok(areaCriticaDTO);
    }

}
