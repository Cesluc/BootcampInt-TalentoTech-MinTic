package arbol;

public class ArbolBinario {
    // Arbol de busqueda binaria.

    Nodo raiz;

    public void agregar(String nombre, int cantidad){
        // Primero funciona luego refactorizamos.
        raiz = agregarRecursivo(raiz,nombre,cantidad);
    }

    private Nodo agregarRecursivo(Nodo actual, String nombre, int cantidad) {

        if (actual == null) {
            return new Nodo(nombre, cantidad);
        } 

        if (nombre.compareToIgnoreCase(actual.nombre) < 0) {
            actual.izquierdo = agregarRecursivo(actual.izquierdo, nombre, cantidad);
        } else if (nombre.compareToIgnoreCase(actual.nombre) > 0) {
            actual.derecho =agregarRecursivo(actual.derecho, nombre, cantidad);
        } else {
            actual.cantidad += cantidad;
        } 

        return actual;
    }

    public Nodo buscar(String nombre){
        return buscarRecursivo(raiz,nombre);
    }

    private Nodo buscarRecursivo(Nodo actual, String nombre) {
    //  unifificar la condicion de base
        if (actual == null || nombre.equalsIgnoreCase(actual.nombre)) {
            return actual;
        }

        if (nombre.compareToIgnoreCase(actual.nombre)<0) {
            return buscarRecursivo(actual.izquierdo, nombre);
        } else {
            return buscarRecursivo(actual.derecho, nombre);
        }
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

        if(nombre.equalsIgnoreCase(actual.nombre)){
            if (actual.izquierdo == null && actual.derecho == null) {
                return null;
            }

            if (actual.derecho == null) {
                return actual.izquierdo;
            }

            if(actual.izquierdo == null){
                return actual.derecho;
            }

            Nodo sucesor = buscarMenor(actual.derecho);
            actual.nombre = sucesor.nombre;
            actual.cantidad = sucesor.cantidad;
            actual.derecho = eliminarRecursivo(actual.derecho, sucesor.nombre);

            return actual;
            
        }

        if (nombre.compareToIgnoreCase(actual.nombre) < 0) {
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, nombre);
        } else {
            actual.derecho = eliminarRecursivo(actual.derecho, nombre);
        }

        return actual;
    }

    private Nodo buscarMenor(Nodo nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }

        return nodo;
    }
    

}
