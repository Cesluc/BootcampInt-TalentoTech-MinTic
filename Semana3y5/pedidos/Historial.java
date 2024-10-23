package pedidos;

import java.util.Stack;

public class Historial {
    
    private Stack<Pedido> pilaPedidos;

    public Historial (){
        pilaPedidos = new Stack<>();
    }

    public void agregarPedido(Pedido pedido){
        pilaPedidos.push(pedido);
    }

    public Pedido removerPedido(){
        return pilaPedidos.isEmpty() ? null : pilaPedidos.pop();
    }

    @Override
    public String toString() {
        return "Historial [pilaPedidos=" + pilaPedidos + "]";
    }

    

}
