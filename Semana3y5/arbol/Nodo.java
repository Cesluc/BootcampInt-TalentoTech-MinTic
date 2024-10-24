package arbol;

public class Nodo {
    
    String nombre;
    int cantidad;
    Nodo izquierdo, derecho; // Relacion de los vecinos
    public Nodo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.izquierdo = null;
        this.derecho = null;
    }

    

}
