package pedidos;

import java.util.LinkedList;
import java.util.Queue;

public class Envios {
    
    private Queue<Pedido> colaPedidos;

    public Envios() {
        colaPedidos = new LinkedList<>();
    }

    public void agregarPedido(Pedido pedido){
        colaPedidos.add(pedido);
    }

    public Pedido removerPedido(){
        return colaPedidos.poll();
    }

    @Override
    public String toString() {
        return "Envios [colaPedidos=" + colaPedidos + "]";
    }

}
