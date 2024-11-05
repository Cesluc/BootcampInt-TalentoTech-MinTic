import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class RetoP1 {

    private final Scanner scanner = new Scanner(System.in);

    public String read() {
        return this.scanner.nextLine();
    }

    public void run() {
        // La vida es bella disfruta
        String texto = read();

        // ["La", "vida", "es", "bella", "disfruta" ]
        String[] palabras = texto.split("\\s+");

        int cantidadPalabras = palabras.length;

        Set<String> palabrasUnicas = new HashSet<>();
        
        int totalCantidadLetras = 0;

        for (String palabra : palabras) {
            palabrasUnicas.add(palabra);
            totalCantidadLetras += palabra.length();
        }

        int cantidadPalabrasUnicas = palabrasUnicas.size();

        double promedioCantidadPalabras = (double) totalCantidadLetras/cantidadPalabras ;
        
        System.out.println(cantidadPalabras);
        System.out.println(cantidadPalabrasUnicas);
        System.out.printf("%.2f",promedioCantidadPalabras);

    }

    public static void main(String[] args) {
        RetoP1 retoP1 = new RetoP1();
        retoP1.run();
    }

    // texto = "La vida es bella disfruta"

    // texto.split(" ")

    // palabras= ["La", "vida", "es", "bella", "disfruta"]
    
    // set(palabras).size

}