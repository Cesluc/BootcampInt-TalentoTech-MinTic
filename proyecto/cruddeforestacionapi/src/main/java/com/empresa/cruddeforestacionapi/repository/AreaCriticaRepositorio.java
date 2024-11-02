package com.empresa.cruddeforestacionapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.cruddeforestacionapi.entity.AreaCriticaEntity;

//Es el componente que nos da el acceso a datos. y extendemos de JPA para obtener todo el tema del CRUD
@Repository // Los repositorios no son clases son interfaces
public interface AreaCriticaRepositorio extends JpaRepository<AreaCriticaEntity, Long> {
    
}
