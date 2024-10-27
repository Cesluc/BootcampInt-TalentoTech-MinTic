
public class SumaRecursiva {
    
    public static void main(String[] args) {
        
        int [] numeros = {10, 20, 30, 40, 50 };

        int resultado = sumar (numeros,numeros.length);

        System.out.println("Suma: " + resultado);

    }

    private static int sumar(int[] numeros, int longitud) {

        System.out.println("Longitud: " + longitud);

        // El caso base es el que rompe la recursividad (funcion base) Se acaba cuando longitud sea = 0 
        if (longitud == 0) {
            System.out.println("Caso Base");
            return 0;
        }

        // Llamado a la recursividad
        int retorno = sumar(numeros, longitud-1);
        System.out.println("Retorno: " + retorno);

        int valor = numeros[longitud - 1];
        System.out.println("Valor: " + valor);

        //funcion
        int resultado = valor + retorno;
        System.out.println("Resultado: " + valor);
        // int resultado = numeros[longitud-1]+ retorno;
        // System.out.println("Resultado: " + resultado);

        return resultado;
    }

}
