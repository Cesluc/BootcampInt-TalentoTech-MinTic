import java.util.Scanner;

/*
* Recomendaciones Generales:
*
*    -> El método run() funcionará como nuestro método principal
*    -> No declarar objetos de tipo Scanner, utilizar el método read() para solicitar datos al usuario.
*    -> Si requiere utilizar varias clases, estas NO deben ser tipo public.
*/
class RetoP2 {

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
        
            int numeroComprasAnteriores = Integer.parseInt(read());
            double montoCompraActual = Double.parseDouble(read());

            double[] resultado = calcularDescuento(numeroComprasAnteriores,montoCompraActual);

            System.out.printf("%.1f\n%.2f\n%.2f", resultado[0], resultado[1], resultado[2]);
            
        }


            
        public double[] calcularDescuento(int numeroComprasAnteriores, double montoCompraActual) {
            
            double descuentoBase = 5.0;

            double descuentoAdicional = Math.min(numeroComprasAnteriores * 2.0, 15);

            double montoDescuento= montoCompraActual * (descuentoBase + descuentoAdicional)/100;

            return new double[]{descuentoBase, descuentoAdicional, montoDescuento};
        }

            
            public static void main(String[] args) {
        RetoP2 retoP2 = new RetoP2();
        retoP2.run();
    }
}