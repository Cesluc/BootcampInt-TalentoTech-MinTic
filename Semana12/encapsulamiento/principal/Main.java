package encapsulamiento.principal;

import encapsulamiento.modelo.Persona;

public class Main {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Rodolfo", "321323", 38, "Av 0");

        System.out.println(persona1.telefono);
        
        persona1.mostrarInfo();

        System.out.println(persona1);

    }
}
