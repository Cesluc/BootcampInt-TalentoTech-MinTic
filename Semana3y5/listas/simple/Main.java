package listas.simple;

public class Main {
    
    public static void main(String[] args) {

        // Esto se utiliza para las pilas y las colas. Cuando necesitemos hacer una busqueda mucho mas veloz.

        ListaSimple listaSimple = new ListaSimple(null);
        listaSimple.insertar(3);
        listaSimple.insertar(7);
        listaSimple.insertar(1);
        listaSimple.mostrar();
    }

}
