package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelos.CategoriaModelo;
import utiles.ConexionBD;
import utiles.DatabaseException;

public class CategoriaDao {

    public void crearTabla() {
        String crearTablaSql = "CREATE TABLE IF NOT EXIST categorias(" +
                                "id INT AUTO_INCREMENT PRIMARY KEY," +
                                "nombre VARCHAR(50) NOT NULL," +
                                "UNIQUE INDEX idx_nombre_unico (nombre))";

        try(Connection connection = ConexionBD.getConnection();
                PreparedStatement stmt = connection.prepareStatement(crearTablaSql)) {
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DatabaseException("Error al crear la tabla categorias", e);
        }
    }

    public void insertar(String nombre) {
        String seleccionarCategoriasSql = "SELECT COUNT(*) FROM categorias WHERE nombre= ?"; // Para no estar guardando las mismas categorias
        String insertarProductoSql = "INSERT INTO categorias(nombre) VALUES(?)";

        try (Connection connection = ConexionBD.getConnection();
                PreparedStatement stmtSeleccionar = connection.prepareStatement(seleccionarCategoriasSql);
                PreparedStatement stmtInsertar = connection.prepareStatement(insertarProductoSql)) { 
                    
                stmtSeleccionar.setString(1, nombre);       
                ResultSet rs = stmtSeleccionar.executeQuery();

                if (rs.next() && rs.getInt(1) == 0) {
                    stmtInsertar.setString(1, nombre);
                    stmtInsertar.executeUpdate();
                    
                }

        } catch (SQLException e) {
            throw new DatabaseException("Error al insertar el producto", e);
        }
    }

    public CategoriaModelo obtenerNombre(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerNombre'");
    }
    
}
