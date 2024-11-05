package com.empresa.cruddeforestacionapi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.cruddeforestacionapi.dto.AreaCriticaDTO;
import com.empresa.cruddeforestacionapi.entity.AreaCriticaEntity;
import com.empresa.cruddeforestacionapi.excepcion.RecursoNoEncontradoExcepcion;
import com.empresa.cruddeforestacionapi.repository.AreaCriticaRepositorio;

@Service
public class AreaCriticaServicio {

    // El servicio esta conectado al repositorio
    
    @Autowired
    private AreaCriticaRepositorio areaCriticaRepositorio;

    public List<AreaCriticaDTO> obtenerTodasAreasCriticas() {

        // El servicio hace solicitudes al repositorio 

        List<AreaCriticaEntity>areaCriticaEntities =  areaCriticaRepositorio.findAll(); // Es como hacer un SELECT FROM areas-criticas. Ewsto trae una lista de entidades
        // Yo no puedo retornar una lista de entidades al controlador, por lo cual debo mapear las areas
        
        List<AreaCriticaDTO> areaCriticaDTOs = areaCriticaEntities.stream().map(this::convertirDTO).collect(Collectors.toList());
        return areaCriticaDTOs;
        //haremos manual el metodo que crea la lista de areas a retornar a DTO
        // return areaCriticaEntities.stream().map(this::convertirDTO).collect(Collectors.toList()); -> Forma simple sin las 2 lineas de arriba
        // lo convierto en un flujo de datos con stream y luego lo mappeo de manera automatica
    }

    public AreaCriticaDTO obtenerAreaCriticaPorId(Long id) {

        AreaCriticaEntity areaCriticaEntity = areaCriticaRepositorio.findById(id).orElseThrow(() -> new RecursoNoEncontradoExcepcion("Area critica no encontrada") );
        return convertirDTO(areaCriticaEntity);
    }

    public AreaCriticaDTO crearAreaCritica(AreaCriticaDTO areaCriticaDTO) {
        AreaCriticaEntity areaCriticaEntity = convertirEntity(areaCriticaDTO);
        AreaCriticaEntity areaCriticaEntityCreada = areaCriticaRepositorio.save(areaCriticaEntity); 
        return convertirDTO(areaCriticaEntityCreada);
    }

    public AreaCriticaDTO actualizarAreaCriticaPorId(Long id, AreaCriticaDTO areaCriticaDTO) {
        AreaCriticaEntity areaCriticaEntity = areaCriticaRepositorio.findById(id).orElseThrow(() -> new RecursoNoEncontradoExcepcion("Area critica no encontrada") );
        // Se mapea solamente lo que se necesita,
        areaCriticaEntity.setNombre(areaCriticaDTO.getNombre());
        areaCriticaEntity.setDescripcion(areaCriticaDTO.getDescripcion());
        areaCriticaEntity.setLatitud(areaCriticaDTO.getLatitud());
        areaCriticaEntity.setLongitud(areaCriticaDTO.getLongitud());
        areaCriticaEntity.setIndiceDeforestacion(areaCriticaDTO.getIndiceDeforestacion());

        AreaCriticaEntity areacriticaEntityActualizada = areaCriticaRepositorio.save(areaCriticaEntity);
        return convertirDTO(areacriticaEntityActualizada);
    }

    //Aqui lo haremos manualmente, despues lo haremos con las librerias

    private AreaCriticaDTO convertirDTO(AreaCriticaEntity areaCriticaEntity){

        AreaCriticaDTO areaCriticaDTO = new AreaCriticaDTO();
        areaCriticaDTO.setId(areaCriticaEntity.getId());
        areaCriticaDTO.setNombre(areaCriticaEntity.getNombre());
        areaCriticaDTO.setDescripcion(areaCriticaEntity.getDescripcion());
        areaCriticaDTO.setLatitud(areaCriticaEntity.getLatitud());
        areaCriticaDTO.setLongitud(areaCriticaEntity.getLongitud());
        areaCriticaDTO.setIndiceDeforestacion(areaCriticaEntity.getIndiceDeforestacion());

        return areaCriticaDTO;

    }

    // Cuando vayamos a crear necesitaremos convertir de DTO en entity
    private AreaCriticaEntity convertirEntity(AreaCriticaDTO areaCriticaDTO) {

        AreaCriticaEntity areaCriticaEntity = new AreaCriticaEntity();
        areaCriticaEntity.setNombre(areaCriticaDTO.getNombre());
        areaCriticaEntity.setDescripcion(areaCriticaDTO.getDescripcion());
        areaCriticaEntity.setLatitud(areaCriticaDTO.getLatitud());
        areaCriticaEntity.setLongitud(areaCriticaDTO.getLongitud());
        areaCriticaEntity.setIndiceDeforestacion(areaCriticaDTO.getIndiceDeforestacion());

        return areaCriticaEntity;

    }

    


}
