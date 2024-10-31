package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelos.VentaModelo;
import servicios.ProductoServicio;

public class ProductoControlador {

    private Scanner scanner = new Scanner(System.in);
    private ProductoServicio productoServicio = new ProductoServicio();

    public void iniciar() {
        while (true) {
            System.out.println("\nCrear Tablas e insertar datos");
            System.out.println("2. Mostrar productos con JOIN");
            System.out.println("3. Realizar transacción");
            System.out.println("4. Mostrar productos con GROUP BY y HAVING");
            System.out.println("5. Buscar productos con subconsultas");
            System.out.println("6. Salir" );
            System.out.println("Seleccione una opción.");

            int opción = scanner.nextInt();
            switch (opción) {
                case 1:
                    crearTablasInsertarDatos();
                    break;
                case 2:
                    mostrarProductosConJoin();
                    break;
                case 3:
                    realizarTransaccion();
                    break;
                case 4:
                    mostrarProductosConGroupByHaving();
                    break;
                case 5:
                    buscarProductosConSubconsulta();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;           
                default:
                System.out.println("Opción no válida");
                    break;
            }
        }
    }

    private void crearTablasInsertarDatos() {
        productoServicio.crearTablas();
        productoServicio.insertarDatos();
    }
    
    private void mostrarProductosConJoin() {
        productoServicio.mostrarProductosConJoin();
    }

    private void realizarTransaccion(){

        List<VentaModelo> ventaModelosList = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese el ID del producto a vender o el 0 para terminar: ");
            int productoId = scanner.nextInt();

            if (productoId == 0) {
                break;
            }

            System.out.println("Ingrese la cantidad de productos a vender: ");
            int cantidad = scanner.nextInt();

            VentaModelo ventaModelo = productoServicio.crearVenta(productoId, cantidad);

            if (ventaModelo != null) {
                ventaModelosList.add(ventaModelo);
            }else{
                System.out.println("No se pudo crear la venta.");
            }
        }

        if (!ventaModelosList.isEmpty()){
            productoServicio.realizarTransaccion(ventaModelosList);
        }else{
            System.out.println("No se realizaron ventas");
        }

    }

    private void mostrarProductosConGroupByHaving(){
        productoServicio.mostrarProductosConGroupByHaving();
    }

    private void buscarProductosConSubconsulta(){
        System.out.println("Ingrese el ID del producto: ");
        int productoID = scanner.nextInt();
        productoServicio.buscarProductosConSubconsulta(productoID);
    }
}
