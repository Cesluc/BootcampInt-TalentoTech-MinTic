import java.util.Scanner;

class RetoI2 {

    /**
     * Este debe ser el único objeto de tipo Scanner en el código
     */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Este método es usado para solicitar datos al usuario
     * 
     * @return Lectura de la siguiente linea del teclado
     */
    public String read() {
        return this.scanner.nextLine();
    }

    /**
     * método principal
     */
    public void run() {
        /*
         * solución propuesta
         */
    }

    public static void main(String[] args) {
        RetoI2 retoI2 = new RetoI2();
        retoI2.run();
    }
}