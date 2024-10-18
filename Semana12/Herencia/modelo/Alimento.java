package Herencia.modelo;
import java.time.LocalDate;

public class Alimento extends Producto {

    private LocalDate fechaVencimiento;

    public Alimento(String nombre, double precio, int cantidad, LocalDate fechaVencimiento) {
        super(nombre, precio, cantidad);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void mostrarInfoAlimento() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Fecha Vencimiento: " + fechaVencimiento); // como estamos en la clase para hacer el ejemplo.
    }

    
    // EN vez de colocar las clases nuevamente en alimento y electrodomestico creamos una clase producto.
}
