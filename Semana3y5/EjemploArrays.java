import java.util.Arrays;

public class EjemploArrays {
    public static void main(String[] args) {

        //Arrays inicializados.
        int[] numeros1 = {1,2,3,4,5};
        String[] letras1 = {"Jose","Maria","Pepe"};
        
        String [] letras = new String[5];
        int[] numeros = new int [10];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        int numero1 = numeros[0];
        int numero2 = numeros[numeros.length - 1];

        // System.out.println(numero1);
        System.out.println(numeros[4]);

        // for (int i = 0; i < numeros.length; i++) {
        //     System.out.println("Index: " + i);
        //     System.out.println("Valor: " + numeros[i]);
        // }

        // for (int numero : numeros) {
        //     System.out.println("Valor: " + numero);
        // }

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("Suma: " + suma);

        int [] numeros2 = {5, 3, 8, 1, 9, 2};

        int maximo = numeros2[0];

        for (int i = 1; i < numeros2.length; i++) {
            if (numeros2[i] > maximo) {
                maximo = numeros2[i];
            }
        }

        // System.out.println("Maximo: " + maximo);

        int[] numeros3 = {1, 2, 3, 4, 5};
        int longitud = numeros3.length;

        for (int i = 0; i < longitud/2; i++) {

            int ni = numeros3[i];
            int nf = numeros3[longitud-1-i];

            numeros3[i] = nf;
            numeros3[longitud - 1 - i] = ni;
        }

        // for (int numero : numeros3) {
        //     System.out.println(numero);
        // }

        System.out.println(Arrays.toString(numeros3));

    }
}
