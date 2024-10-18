package encapsulamiento.modelo;

public class Persona {

    //ATRIBUTOS
    private String nombre;
    public String telefono;
    protected int edad;
    String direccion;

    // Buena practica dice que las variables en un objeto deben ser privadas, para eso son los getter y setter

    //CONSTRUCTORES
    public Persona (){
        
    }

    public Persona (String nombre, String telefono, int edad, String direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Debe ser publico el getter para poder obtener
    public String getNombre(){
        return nombre;
    }

    // El settter es void porque es para reescribibr
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void mostrarInfo(){
        System.out.println(nombre);
        System.out.println(telefono);
        System.out.println(edad);
        System.out.println(direccion);
    }

    protected void  aumentarEdad(){
        edad++;
    }

    void cambiarDireccion(String nuevaDireccion){
        direccion = nuevaDireccion; // Aqui deberia ir el this, pero como la palabra es otra
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Informacion de la persona: " + nombre + " " + telefono + " " + edad + " " + direccion;
    }

}
