package pedidos;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    
    // EL atributo sera una lista
    // Aca se declara
    private List<Producto> listaProductos;
    
    public Carrito (){
        // Aca se hace la instancia
        listaProductos = new ArrayList<>();
    }

    public List<Producto> getListaProductos(){
        return listaProductos;
    }
    
    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }

    public void removerProducto(Producto producto){
        listaProductos.remove(producto);
    }

    public double calcularTotal(){
        return listaProductos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    @Override
    public String toString() {
        return "Carrito [listaProductos=" + listaProductos + "]";
    }


}
