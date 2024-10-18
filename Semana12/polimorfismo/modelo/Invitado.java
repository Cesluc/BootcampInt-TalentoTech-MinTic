package polimorfismo.modelo;

public class Invitado extends Usuario {

    public Invitado(String nombre, String email) {
        super(nombre, email);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); //Aqui si va a usar el mismo metodo del padre
    }
    
    @Override // Sobre escritura del metodo
    public void definirPermisos() {
        // super.definirPermisos(); // Metodo de definir permiso del padre
        System.out.println("Permiso para el invitado"); // Como queremos sobre escribirlo
    }


}
