package polimorfismo.modelo;

public class Usuario {
    
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
    }

    public void definirPermisos(){
        System.out.println("Permiso para el usuario");
    }
    
    public void definirPermisos(String rol) {
        System.out.println("Permiso para el rol: " + rol);
    }// Sobrecarga de metodos.

}
