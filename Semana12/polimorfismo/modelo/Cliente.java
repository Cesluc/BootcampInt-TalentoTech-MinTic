package polimorfismo.modelo;

public class Cliente extends Usuario{

    private String direccion;

    public Cliente(String nombre, String email, String direccion) {
        super(nombre, email);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void mostrarInfo() { // Misma direccion del padre mas direccion.
        super.mostrarInfo();
        System.out.println("Direccion: " + direccion);
    }

    @Override
    public void definirPermisos() {
        System.out.println("Permiso para el cliente");
    }

}
