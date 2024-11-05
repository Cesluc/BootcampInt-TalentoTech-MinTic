package com.empresa.cruddeforestacionapi.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.empresa.cruddeforestacionapi.dto.EvaluacionFerroviariaDTO;
import com.empresa.cruddeforestacionapi.entity.EvaluacionFerroviariaEntity;

@Mapper
public interface EvaluacionFerroviariaMapper {
    // Esta clase hara la funcion de convertir en DTO y de entity con la importacion de mapper que hicimos.

    EvaluacionFerroviariaMapper INSTANCE = Mappers.getMapper(EvaluacionFerroviariaMapper.class);

    @Mapping(source = "areaCriticaEntity.id", target =  "areaCriticaEntityId")
    EvaluacionFerroviariaDTO toDto(EvaluacionFerroviariaEntity evaluacionFerroviariaEntity);

    @Mapping(source = "areaCriticaEntityId", target =  "areaCriticaEntity.id")
    EvaluacionFerroviariaEntity toEntity(EvaluacionFerroviariaDTO evaluacionFerroviariaDTO);
}
