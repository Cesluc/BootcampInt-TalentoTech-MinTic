package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelos.ProductoModelo;
import utiles.ConexionBD;
import utiles.DatabaseException;

public class ProductoDao {

    public void crearTabla() {
        String crearTablaSql = "CREATE TABLE IF NOT EXIST productos(" +
                                "id INT AUTO_INCREMENT PRIMARY KEY," +
                                "nombre VARCHAR(100) NOT NULL," +
                                "precio DECIMAL(10, 2) NOT NULL," +                        
                                "cantidad INT DEFAULT 0,"  +                      
                                "categoria_id INT," +                   
                                "FOREIGN KEY (categoria_id) REFERENCES categorias(id),"+
                                "INDEX idx_nombre_precio (nombre, precio))";

        try(Connection connection = ConexionBD.getConnection();
                PreparedStatement stmt = connection.prepareStatement(crearTablaSql)) {
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DatabaseException("Error al crear la tabla productos", e);
        }
    }

    public void insertar(ProductoModelo productoModelo) {
        String insertarProductoSql = "INSERT INTO productos(nombre, precio, cantidad, categoria_id) VALUES(?, ?, ?, ?)";

        try (Connection connection = ConexionBD.getConnection();
                PreparedStatement stmt = connection.prepareStatement(insertarProductoSql)) {
                
            stmt.setString(1, productoModelo.getNombre());
            stmt.setDouble(2, productoModelo.getPrecio());
            stmt.setInt(3, productoModelo.getCantidad());
            stmt.setInt(4, productoModelo.getCategoriaModelo().getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DatabaseException("Error al insertar el producto", e);
        }
    }
    
}
