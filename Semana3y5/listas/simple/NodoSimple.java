package listas.simple;

public class NodoSimple {

    int valor;
    // Cada nodo tiene un vecino ( el simple es uni direccional)
    NodoSimple siguiente;

    public NodoSimple(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    
}
