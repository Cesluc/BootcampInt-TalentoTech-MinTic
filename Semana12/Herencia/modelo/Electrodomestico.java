package Herencia.modelo;

public class Electrodomestico  extends Producto {

    private String marca;

    public Electrodomestico(String nombre, double precio, int cantidad, String marca) {
        super(nombre, precio, cantidad);
        // La palabra super hace referencia al constructor del padre. Y hace referencia a los atributos del padre.
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void mostrarInfoElectrodomestico(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Marca: " + marca ); // como estamos en la clase para hacer el ejemplo.
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "marca: " + marca + ", Nombre: " + getNombre() + ", Precio: " + getPrecio() + ", Cantidad: " + getCantidad();
    }

    // Ya tiene los atributos getter y setter de la clase padre
    
}
