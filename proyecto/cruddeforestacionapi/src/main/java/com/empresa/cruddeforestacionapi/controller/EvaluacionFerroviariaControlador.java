package com.empresa.cruddeforestacionapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.cruddeforestacionapi.service.EvaluacionFerroviariaServicio;

@RestController
@RequestMapping("/api/evaluaciones-ferroviarias")
public class EvaluacionFerroviariaControlador {
    
    @Autowired
    private EvaluacionFerroviariaServicio evaluacionFerroviariaServicio;



    
}
