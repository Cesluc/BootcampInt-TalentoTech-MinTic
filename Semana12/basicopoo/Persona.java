package basicopoo;

public class Persona {
    String nombre;
    int edad;
    String direccion;

    public Persona (){ // El constructor no devuelve nada por eso es void
        // ENcadenamiento de constructores
        this("", 0, ""); // Cuando llama al constructor asi se inicializa el constructor con valores vacios
    }

    public Persona( String nombre, int edad) { // El constructor con parametros
        this.nombre = nombre; // This hace referemcoa a los atributos de la clase con los que se esta trabajando
        this.edad = edad;
        this.direccion = "No"; // Atributo inicializado con un dato quemado
    }

    // Sobrecarga de constructores.

    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    
}
