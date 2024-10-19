package partidos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RegistroPartidos {
    
    private Partido [] partidos;
    private int contadorPartidos;

    //El constructor es el que inicializa atributos.
    public RegistroPartidos() {
        this.partidos = new Partido[10];
        this.contadorPartidos = 0;
    }

    public void mostrarMenu(){
        System.out.println("Menu");
        System.out.println("1. Registrar partido");
        System.out.println("2. Ver resultados");
        System.out.println("3. Tabla de clasificación");
        System.out.println("4. Salir");
        System.out.println("Seleccione la opción: ");
    }


    // Clase Scanner para ingresar datos por la consola
    public void registrarPartido(Scanner scanner){
        System.out.println("Fecha (dd-MM-yyyy): ");
        String fecha = scanner.nextLine();
        System.out.println("Nombre del equipo rival: ");
        String nombreRival = scanner.nextLine();
        System.out.println("Goles del rival: ");
        int golesRival = scanner.nextInt();
        System.out.println("Goles de la universidad: ");
        int golesUni = scanner.nextInt();
        scanner.nextLine(); // Limpieza de buffer para que no se pegue.

        Partido partido = new Partido(fecha, nombreRival, golesRival, golesUni);
        partidos[contadorPartidos] = partido; 
        contadorPartidos++;

        System.out.println("Partido registrado.");

        System.out.println("Desea registrar otro partido? (s/n): ");
        String respuesta = scanner.nextLine();
        if(respuesta.equalsIgnoreCase("s")){
            registrarPartido(scanner);
        }

    }
    
    public void verResultados (){
        ordenarPartidosFecha();
        for (int i = 0; i < contadorPartidos; i++) {
            System.out.println(partidos[i]);

        }
    }

    private void ordenarPartidosFecha(){
        //Ordenar Objetos
        Arrays.sort(partidos,0,contadorPartidos, new Comparator<Partido>() {

            @Override
            public int compare(Partido p1, Partido p2) { // esta funcion retorna 1 -1 o 0 
                return p2.getFecha().compareTo(p1.getFecha());
            }
            
        });
    }

    public void verTaablaClasificacion(){
        int jugados = contadorPartidos;
        int ganados = 0;
        int empatados = 0;
        int perdidos = 0;
        int puntos = 0;

        for (int i = 0; i < contadorPartidos; i++) {
            Partido partido = partidos[i];

            if (partido.getGolesUni() > partido.getGolesRival()) {
                ganados ++;
                puntos +=3;
            } else if (partido.getGolesUni() == partido.getGolesRival()) {
                empatados++;
                puntos += 1;
            } else {
                perdidos ++;
            }

        }

        System.out.println("Tabla clasificación ");
        System.out.println("Jugados: " + jugados);
        System.out.println("Ganados: " + ganados);
        System.out.println("Empatados: " + empatados);
        System.out.println("Perdidos: " + perdidos);
        System.out.println("Puntos totales: " + puntos);

    }

}
