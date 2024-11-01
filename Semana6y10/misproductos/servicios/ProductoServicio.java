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
            categoriaDao.insertar("Muebles");
            categoriaDao.insertar("Ropa");

            productoDao.insertar(new ProductoModelo("PC", 1200.00, 10, categoriaDao.obtenerConNombre("Electronica")));
            productoDao.insertar(new ProductoModelo("Tablet", 400.00, 15, categoriaDao.obtenerConNombre("Electronica")));
            productoDao.insertar(new ProductoModelo("Sofa", 300.00, 5, categoriaDao.obtenerConNombre("Muebles")));
            productoDao.insertar(new ProductoModelo("Camiseta", 20.00, 50, categoriaDao.obtenerConNombre("Ropa")));
        

            System.out.println("Datos insertados");

        } catch (Exception e) {
            System.out.println("Error al insertar datos: " + e.getMessage());
        }
    }

    public void mostrarProductosConJoin() {

        List<ProductoModelo> productoModelosList = productoDao.obtenerProductosConJoin();
        for (ProductoModelo productoModelo : productoModelosList) {
            System.out.println(productoModelo.getId() + ": " + productoModelo.getNombre() + " - " + productoModelo.getPrecio() + " - " + productoModelo.getCantidad());
        }

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
