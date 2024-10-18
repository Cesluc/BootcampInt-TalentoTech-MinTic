package basicopoo;

public class Principal {

    public static void main(String[] args) {

        //Estructura -> Variables proceso y salida de resultados

        int edad = 25;
        float peso = 65.5f;
        double altura = 1.7;
        char letra = 'r';
        boolean isEstado = true;
        String nombre = "Rodolfo";
        String[] letras = {"a","b","c"};

        System.out.println("Hola");
        System.out.println(nombre);

        int resultao1 = 5+3;
        int resultao2 = 5-3;
        int resultao3 = 5*3;
        int resultao4 = 5/3;
        int resultao5 = 5%3;

        boolean resultado6 = (5==5);
        boolean resultado7 = (5!=5);
        boolean resultado8 = (5<5);
        boolean resultado9 = (5>5);
        boolean resultado10 = (5<=5);
        boolean resultado11 = (5>=5);

        boolean resultado12 = (5 > 3) && (8 < 5);
        boolean resultado13 = (5>3) || (8<5);
        boolean resultado14 = !(5 > 3);

        int a = 5;
        // a++;
        a+=3;
        // a=a+3;

        // if (edad > 18) {
        //     System.out.println("Es mayor de edad");
        // }

        // if (edad > 18) {
        //     System.out.println("Es mayor de edad");
        // }else{
        //     System.out.println("No es mayor de edad");
        // }

        // if (edad < 13) {
        //     System.out.println("Es un niño");
        // }else if(edad < 18){
        //     System.out.println("Es un adolescente");
        // }else{
        //     System.out.println("Es un adulto");
        // }

        int dia = 3;

        // switch (dia) {
        //     case 1:
        //         System.out.println("Lunes");
        //         break; // Es para que rompa el caso y no entre a las demas
        //     case 2:
        //         System.out.println("Martes");
        //         break;
        //     case 3:
        //         System.out.println("Miercoles");
        //         break;
        
        //     default:
        //         System.out.println("Opcion no valida");
        //         break;
        // }

        // for (int i = 0; i <5 ; i++) {
        //     System.out.println("i es: " + i);
        // }

        int i =0;
        // while (i<5) {
        //     System.out.println("i es: " + i);
        //     i++;
        // }

        do {
            System.out.println("i es: " + i);
            i++;
        } while (i<5);

        System.out.println("uno");
        System.out.print("uno");
        System.out.printf("uno");
        System.err.println("uno");




    }
}