package servicios;

import java.util.List;

import dao.CategoriaDao;
import dao.ProductoDao;
import dao.VentaDao;
import modelos.ProductoModelo;
import modelos.VentaModelo;
import utiles.DatabaseException;

public class ProductoServicio {

    private CategoriaDao categoriaDao = new CategoriaDao();
    private ProductoDao productoDao = new ProductoDao();
    private VentaDao ventaDao = new VentaDao();

    public void crearTablas() {
        try {
            categoriaDao.crearTabla();
            productoDao.crearTabla();
            ventaDao.crearTabla();

            System.out.println("Tablas creadas");
            
        } catch (DatabaseException e) {
            System.out.println("Error al crear las tablas: " + e.getMessage());
        }
    }

    public void insertarDatos() {
        try {
            categoriaDao.insertar("Electronica");
            categoriaDao.insertar("Mueblas");
            categoriaDao.insertar("Ropa");

            productoDao.insertar(new ProductoModelo("PC", 1000.00, 10, categoriaDao.obtenerNombre("Electronica")));
            productoDao.insertar(new ProductoModelo("Tablet", 500.00, 15, categoriaDao.obtenerNombre("Electronica")));
            productoDao.insertar(new ProductoModelo("Sofa", 300.00, 5, categoriaDao.obtenerNombre("Muebles")));
            productoDao.insertar(new ProductoModelo("Camiseta", 20.00, 50, categoriaDao.obtenerNombre("Ropa")));
        

            System.out.println("Datos insertados");

        } catch (Exception e) {
            System.out.println("Error al insertar datos: " + e.getMessage());
        }
    }

    public void mostrarProductosConJoin() {

    }

    public VentaModelo crearVenta(int productoId, int cantidad) {
        return null;
    }

    public void realizarTransaccion(List<VentaModelo> ventaModelosList) {

    }

    public void mostrarProductosConGroupByHaving() {

    }

    public void buscarProductosConSubconsulta(int productoID) {

    }

}
