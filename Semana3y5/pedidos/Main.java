package pedidos;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "PC", 1000.0);
        Producto producto2 = new Producto(2, "Camisa", 100.0);
        Producto producto3 = new Producto(3, "TV", 500.0);

        Carrito carrito = new Carrito();
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        double total = carrito.calcularTotal();
        System.out.println("TOTAL: " + total);

        Pedido pedido = new Pedido(1, carrito.getListaProductos(), total);

        Envios envios = new Envios();
        envios.agregarPedido(pedido);

        Historial historial = new Historial();
        historial.agregarPedido(envios.removerPedido());

        System.out.println(historial);
        System.out.println();

        Pedido ultimoPedido = historial.removerPedido();
        System.out.println("Ultimo Pedido " + ultimoPedido);



    }
}
