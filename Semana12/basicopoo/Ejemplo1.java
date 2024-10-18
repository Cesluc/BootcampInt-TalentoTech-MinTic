package basicopoo;

public class Ejemplo1 {
    public static void main(String[] args) {
        
        Producto producto1 = new Producto();
        // Doy valores a los atributos de ese objeto
        producto1.nombre = "PC";
        producto1.precio = 100;
        producto1.mostrarInfo();

        Producto producto2 = new Producto();
        producto2.nombre = "Agua";
        producto2.precio = 10;
    }
}
