package com.empresa.cruddeforestacionapi.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private EntityManager entityManager;

    @Transactional // Transacciones
    @Override
    public void run(String... args) throws Exception {

        entityManager.createNativeQuery(
            "CREATE OR REPLACE VIEW vista_areas_criticas_con_evaluaciones AS " +
            "SELECT ac.id, ac.nombre, ac.descripcion, COUNT(ef.id) AS numero_evaluaciones " +
            "FROM areas_criticas ac " +
            "LEFT JOIN evaluaciones_ferroviarias ef " +
            "ON ac.id = ef.area_critica_id " + 
            "GROUP BY ac.id, ac.nombre, ac.descripcion " +
            "HAVING numero_evaluaciones > 0"
        ).executeUpdate();

    }
    

}
