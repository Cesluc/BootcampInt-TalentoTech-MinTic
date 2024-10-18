package polimorfismo.modelo;

public class Admin  extends Usuario{
    
    private String rol;

    public Admin(String nombre, String email, String rol) {
        super(nombre, email);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("rol: " + rol);

    }

    @Override
    public void definirPermisos() {
        System.out.println("Permiso para el administrador");

    }


}
