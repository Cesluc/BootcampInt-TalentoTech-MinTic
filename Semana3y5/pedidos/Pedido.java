package pedidos;

import java.util.List;

public class Pedido {
    
    private int id;
    private List<Producto> listaProductos;
    private double total;

    public Pedido(int id, List<Producto> listaProductos, double total) {
        this.id = id;
        this.listaProductos = listaProductos;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", listaProductos=" + listaProductos + ", total=" + total + "]";
    }
    
    

}
