package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utiles.ConexionBD;
import utiles.DatabaseException;

public class VentaDao {

    public void crearTabla() {
        String crearTablaSql = "CREATE TABLE IF NOT EXIST ventas(" +
                                "id INT AUTO_INCREMENT PRIMARY KEY," +
                                "cantidad INT,"  +
                                "fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP," +                         
                                "producto_id INT," +                   
                                "FOREIGN KEY (producto_id) REFERENCES productos(id))";

        try(Connection connection = ConexionBD.getConnection();
                PreparedStatement stmt = connection.prepareStatement(crearTablaSql)) {
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DatabaseException("Error al crear la tabla ventas", e);
        }
    }
    
}
