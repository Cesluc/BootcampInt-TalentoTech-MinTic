package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelos.VentaModelo;
import utiles.ConexionBD;
import utiles.DatabaseException;

public class VentaDao {

    public void crearTabla() {
        String crearTablaSql = "CREATE TABLE IF NOT EXISTS ventas(" +
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

    public static void  registrarVenta(VentaModelo ventaModelo, Connection connection){

        String insertarVentaSql = "INSERT INTO ventas(cantidad, fecha, producto_id) VALUES(?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(insertarVentaSql)) {

            stmt.setInt(1, ventaModelo.getCantidad());
            stmt.setTimestamp(2, new java.sql.Timestamp(ventaModelo.getFecha().getTime())); // Lo convertimos a un objeto para usarlo en la consulta sql
            stmt.setInt(3, ventaModelo.getProductoModelo().getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DatabaseException("Error al insertar la venta", e);
        }
    }
    
}
