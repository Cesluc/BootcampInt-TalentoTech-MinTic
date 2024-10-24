package arbol;

public class ArbolBinario {
    

    Nodo raiz;

    public void agregar(String nombre, int cantidad){
        if (raiz == null) {
            raiz = new Nodo(nombre, cantidad);
        }else{
            agregarRecursivo(raiz,nombre,cantidad);
        }
    }

    private void agregarRecursivo(Nodo actual, String nombre, int cantidad) {
        if (actual.izquierdo == null) {
            actual.izquierdo = new Nodo(nombre, cantidad);
        } else if(actual.derecho == null){
            actual.derecho = new Nodo(nombre, cantidad); 
        } else {
            if (Math.random() < 0.5) {
                agregarRecursivo(actual.izquierdo, nombre, cantidad);
            } else {
                agregarRecursivo(actual.derecho, nombre, cantidad);
            }
        }
    }

    public Nodo buscar(String nombre){
        return buscarRecursivo(raiz,nombre);
    }

    private Nodo buscarRecursivo(Nodo actual, String nombre) {
        if (actual == null) {
            return null;
        }

        if (nombre.equals(actual.nombre)) {
            return actual;
        }

        Nodo izquierdo = buscarRecursivo(actual.izquierdo, nombre);
        if (izquierdo != null) {
            return izquierdo;
        }

        return buscarRecursivo(actual.derecho, nombre);

    }

    public void listar(){
        listarRecursivo(raiz);
    }

    private void listarRecursivo(Nodo actual) {
        if (actual != null) {
            listarRecursivo(actual.izquierdo);
            System.out.println("Producto: " + actual.nombre + ", Cantidad: " + actual.cantidad);
            listarRecursivo(actual.derecho);
        }
    }

    public boolean eliminar(String nombre, int cantidad){
        Nodo nodo = buscar(nombre);
        if (nodo != null) {
            if (nodo.cantidad > cantidad) {
                nodo.cantidad -= cantidad;
                return true;
            } else if(nodo.cantidad == cantidad) {
                raiz = eliminarRecursivo(raiz, nombre);
                return true;
            }
        } 
        return false;
    }

    private Nodo eliminarRecursivo(Nodo actual, String nombre) {
        if (actual == null) {
            return null;
        }

        if(nombre.equals(actual.nombre)){
            if (actual.izquierdo == null && actual.derecho == null) {
                return null;
            }

            if (actual.derecho == null) {
                return actual.izquierdo;
            }

            if(actual.izquierdo == null){
                return actual.derecho;
            }

            String menor = buscarMenor(actual.derecho);
            actual.nombre = menor;
            actual.derecho = eliminarRecursivo(actual.derecho, menor);

            return actual;
            
        }

        if (nombre.compareTo(actual.nombre) < 0) {
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, nombre);
        }

        actual.derecho = eliminarRecursivo(actual.derecho, nombre);
        return actual;
    }

    private String buscarMenor(Nodo nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }

        return nodo.nombre;
    }
    

}
