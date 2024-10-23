import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class EjemploColas {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Manzana");
        queue.offer("Banana");
        queue.offer("Naranja");

        System.out.println(queue.peek()); // devuelve primer elemento sin eleiminar
        System.out.println(queue.poll()); // devuelve primer elemento de la cola elimina
        System.out.println(queue.peek());


        Queue<Integer> priorityQueue = new PriorityQueue<>(); // como solo permite objetos se usan los envolventes (int -> Integer)
        priorityQueue.offer(50);
        priorityQueue.offer(20);
        priorityQueue.offer(40);
        System.out.println(priorityQueue.peek()); // Devuelve el elemento de mayor prioridad (menor valor en este caso)
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());

        Queue<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("Manzana");
        arrayDeque.offer("Banana");
        arrayDeque.offer("Naranja");

        System.out.println(arrayDeque.peek()); // devuelve primer elemento sin eleiminar
        System.out.println(arrayDeque.poll()); // devuelve primer elemento de la cola elimina
        System.out.println(arrayDeque.peek());

    }
}
