package listas.simple;

public class ListaSimple {

    NodoSimple cabeza;

    public ListaSimple(NodoSimple cabeza) {
        this.cabeza = null;
    }

    public void insertar ( int valor){
        NodoSimple nuevoNodo = new NodoSimple(valor);

        if (cabeza == null) {
            cabeza = nuevoNodo;

        }else{
            NodoSimple nodoTemp = cabeza;
            while (nodoTemp.siguiente != null) {
                nodoTemp = nodoTemp.siguiente;
            }

            nodoTemp.siguiente = nuevoNodo;
        }

        // nuevoNodo.siguiente = cabeza;
        // cabeza = nuevoNodo;
    }

    public void mostrar (){
        NodoSimple actual = cabeza;

        while (actual != null) {
            System.out.println(actual.valor + " ");
            actual = actual.siguiente;
        }

        System.out.println();

    }
    
}
