import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EjemploArraylist {
    public static void main(String[] args) {
        
        List<String> arrayList = new ArrayList<>(); // Para acceso rapido con el indice.
        arrayList.add("Manzana");
        arrayList.add("Banana");
        arrayList.add("Naranja");
        System.out.println(arrayList.get(1));
        // int x =  numeros[0]; ejemplo en arreglos

        arrayList.set(0, "Pera");
        arrayList.remove(0);
        System.out.println(arrayList.size());

        arrayList.clear();

        System.out.println(arrayList);

        // ArrayList<String> arrayList2 = new ArrayList<>(); esto tambien se pudo haber hecho
        LinkedList<String> linkedList = new LinkedList<>(); //Ventaja es que se puede insertar y eliminar frecuentamente al principio o al final de la lista
        linkedList.add("Manzana");
        linkedList.add("Banana");
        linkedList.add("Naranja");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.addFirst("Pera");
        linkedList.addLast("Coco");
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        // Los otros metodos son iguales.

        //Para multiples procesos (concurrencia) se usa el CopyOnWriteArrayList. donde las lecturas son mas frecuentes que las escrituras. Copia una lista cada vez que se hace una modificacion (si son varios procesos es una ventaja). Mismos metodos de arrayList y linked list

        List<String> copyOn = new CopyOnWriteArrayList<>();
        copyOn.add("Manzana");
        copyOn.add("Banana");
        copyOn.add("Naranja");
        System.out.println(copyOn.get(1));

        // Listas inmutables: Lista constante que no va a ser cambiada. (evita que se pueda cambiar despues en el codigo)
        // Mismo codigo.

        // Listas sincronicas: Segura para el uso concurrente (multiples hilos). cada vez que alguien quiera hacer una modificacion a la lista, se puede hacer solo una vez (En caso de que hayan varios usuarios)

    List<String> frutas = Collections.synchronizedList(new ArrayList<>());
    frutas.add("Manzana");
    frutas.add("Banana");
    System.out.println(frutas.get(1)); // Output: Banana
    synchronized(frutas){
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    }
}
