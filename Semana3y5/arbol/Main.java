package arbol;

public class Main {
    // Explicacion a las 8:48 23/10
    public static void main(String[] args) {
        
        ArbolBinario arbolBinario = new ArbolBinario();

        arbolBinario.agregar("Manzana", 10);
        arbolBinario.agregar("Banano", 20);
        arbolBinario.agregar("Pera", 30);
        arbolBinario.agregar("Uva", 40);
        arbolBinario.agregar("Naranja", 50);
        arbolBinario.agregar("Coco", 60);
        arbolBinario.agregar("Mango", 70);

        arbolBinario.listar();
        Nodo nodo = arbolBinario.buscar("Mango");
        if (nodo != null) {
            System.out.println("Nodo encontrado, nombre: " + nodo.nombre + ", cantidad: " + nodo.cantidad);
        } else {
            System.out.println("Nodo no encontrado");
        }

        boolean respuesta = arbolBinario.eliminar("pera", 30);
        if (respuesta) {
            System.out.println("Nodo eliminado o cantidad restada.");
            arbolBinario.listar();
        } else {
            System.out.println("Nodo no encontrado o cantidad a eliminar es mayor a existente.");
        }


    }

}
