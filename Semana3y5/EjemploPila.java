import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        
        // Stack esta obsoleto
        Stack<String> stack = new Stack<>();
        stack.push("Manzana");
        stack.push("Banana");
        stack.push("Naranja");

        System.out.println(stack.peek()); // Elemento parte superior en la pila sin eliminarlo
        System.out.println(stack.pop()); // Elemento parte superior en la pila eliminando naranja
        System.out.println(stack.peek()); // Sale banana porque se elimino naranja.
        System.out.println(stack.isEmpty());
        System.out.println(stack.search("Banana")); // Trae la posicion (index) en donde se encuentra 


        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.push("Manzana");
        arrayDeque.push("Banana");
        arrayDeque.push("Naranja");

        System.out.println(arrayDeque.peek()); // Elemento parte superior en la pila sin eliminarlo
        System.out.println(arrayDeque.pop()); // Elemento parte superior en la pila eliminando naranja
        System.out.println(arrayDeque.peek()); // Sale banana porque se elimino naranja.
        System.out.println(arrayDeque.isEmpty());



    }
}
