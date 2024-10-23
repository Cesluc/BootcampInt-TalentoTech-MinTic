package pedidos;

public class Producto {

    // Los atributos deben ser privados
    // Los atributos no se instancian a menos de que sea una constante
    
    private int id; 
    private String nombre;
    private double precio;
    
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
    }



}
