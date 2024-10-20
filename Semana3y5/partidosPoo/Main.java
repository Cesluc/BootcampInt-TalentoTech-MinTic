package partidosPoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        IRegistroDeportivo iRegistroDeportivo = new RegistroPartidos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            mostrarMenu();

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingresar solo numeros.");
                scanner.next();
            }

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiamos buffer

            switch (opcion) {
                case 1:
                    iRegistroDeportivo.registrarPartido(scanner);
                    break;
                case 2:
                    iRegistroDeportivo.verResultados();
                    break;
                case 3:
                    iRegistroDeportivo.verTaablaClasificacion();
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

    public static void mostrarMenu() {
        System.out.println("Menu");
        System.out.println("1. Registrar partido");
        System.out.println("2. Ver resultados");
        System.out.println("3. Tabla de clasificación");
        System.out.println("4. Salir");
        System.out.println("Seleccione la opción: ");
    }
}
