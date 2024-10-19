package partidos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        RegistroPartidos registroPartidos = new RegistroPartidos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            registroPartidos.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiamos buffer

            switch (opcion) {
                case 1:
                    registroPartidos.registrarPartido(scanner);
                    break;
                case 2:
                    registroPartidos.verResultados();
                    break;
                case 3:
                    registroPartidos.verTaablaClasificacion();
                    break;
                case 4:
                    System.out.println("Saliendo....");       
                    break;
            
                default:
                    System.out.println("Opcion no válida.....");
                    break;
            }
            
        } while (opcion != 4);

        scanner.close();

    }
}
