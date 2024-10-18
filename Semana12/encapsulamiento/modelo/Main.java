package encapsulamiento.modelo;


public class Main {
    public static void main(String[] args) {

        Persona persona0 = new Persona();

        persona0.setNombre("Juan");
        persona0.setEdad(0);    
        persona0.setTelefono("23123");
        persona0.setDireccion("Calle13");

        System.out.println(persona0.getNombre());
        System.out.println(persona0.getEdad());
        System.out.println(persona0.getTelefono());
        System.out.println(persona0.getDireccion());
        
        // Persona persona1 = new Persona("Rodolfo", "321323", 38, "Av 0");

        // System.out.println(persona1.telefono);
        // System.out.println(persona1.edad);
        // System.out.println(persona1.direccion);
        
        // persona1.mostrarInfo();
        // persona1.aumentarEdad();
        // persona1.cambiarDireccion("Calle 12");
        // System.out.println(persona1);

    }
}
