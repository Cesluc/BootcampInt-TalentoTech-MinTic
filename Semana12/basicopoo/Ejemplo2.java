package basicopoo;

public class Ejemplo2 {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); 
        persona1.edad = 20;
        persona1.direccion= "Av 0";

        Persona persona2 = new Persona("Gladys",15);
        Persona persona3 = new Persona("Juan", 10, "Calle 4");

        System.out.println(persona1);
    }
}
