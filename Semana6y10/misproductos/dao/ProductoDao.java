package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelos.CategoriaModelo;
import modelos.ProductoModelo;
import modelos.VentaModelo;
import utiles.ConexionBD;
import utiles.DatabaseException;

public class ProductoDao {

    public void crearTabla() {
        String crearTablaSql = "CREATE TABLE IF NOT EXISTS productos(" +
                                "id INT AUTO_INCREMENT PRIMARY KEY," +
                                "nombre VARCHAR(100) NOT NULL," +
                                "precio DECIMAL(10, 2) NOT NULL," +
                                "cantidad INT DEFAULT 0," +
                                "categoria_id INT," +
                                "FOREIGN KEY (categoria_id) REFERENCES categorias(id)," +
                                "INDEX idx_nombre_precio (nombre, precio) )";

        try (Connection connection = ConexionBD.getConnection();
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

    public List<ProductoModelo> obtenerProductosConJoin() {

        String seleccionarProductoSql = "SELECT p.id, p.nombre, p.precio, p.cantidad, p.categoria_id, c.nombre AS categoria " +
                                        "FROM productos p " +
                                        "INNER JOIN categorias c " + 
                                        "ON p.categoria_id = c.id " +
                                        "ORDER BY p.nombre";

        List<ProductoModelo> productoModelosList = new ArrayList<>();

        try (Connection connection = ConexionBD.getConnection();
                PreparedStatement stmt = connection.prepareStatement(seleccionarProductoSql);
                ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                ProductoModelo productoModelo = new ProductoModelo(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getDouble("precio"),
                    rs.getInt("cantidad"),
                    new CategoriaModelo(rs.getInt("categoria_id"), rs.getString("categoria"))
                );

                productoModelosList.add(productoModelo );
            }

                } catch (SQLException e) {
            throw new DatabaseException("Error al obtener el producto", e);
        }

        return productoModelosList;

    }

    public ProductoModelo obtenerConID(int productoId) {
        String seleccionarProductoSql = "SELECT * FROM productos WHERE id = ?";

        ProductoModelo productoModelo = null;

        try (Connection connection = ConexionBD.getConnection();
                PreparedStatement stmt = connection.prepareStatement(seleccionarProductoSql)) {

            stmt.setInt(1, productoId);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                productoModelo = new ProductoModelo(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getDouble("precio"),
                        rs.getInt("cantidad"),
                        null
                );
            }

        } catch (SQLException e) {
            throw new DatabaseException("Error al obtener el id del producto", e);
        }

        return productoModelo;
    }

    public void realizarTransaccion(List<VentaModelo> ventaModelosList) {

        try (Connection connection= ConexionBD.getConnection()) {
            // En la base de datos el commit esta automatico, por eso lo hacemos aca 
            connection.setAutoCommit(false); 

            try {
                for (VentaModelo ventaModelo : ventaModelosList) {
                    actualizarCantidad(ventaModelo.getProductoModelo().getId(), ventaModelo.getCantidad(), connection);
                    VentaDao.registrarVenta(ventaModelo, connection);
                }

                connection.commit();
            } catch (SQLException e) {
                connection.rollback();
            }

        } catch (SQLException e) {
            throw new DatabaseException("Error durante la transaccion", e);
        }
    }
    
    private void actualizarCantidad(int id, int cantidad, Connection connection) {
        String actualizarCantidad="UPDATE productos SET cantidad= cantidad - ? WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(actualizarCantidad)) {

            stmt.setInt(1, cantidad);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DatabaseException("Error al actualizar la cantidad", e);
        }

    }
}
