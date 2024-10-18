package abstraccion.modelo;

public class Pistola implements IArma{
    
    private int daño;
    private int balas;

    public Pistola(int daño, int balas) {
        this.daño = daño;
        this.balas = balas;
    }

    @Override
    public void cargar() {
        System.out.println("Cargando la pistola");
        balas = 15;
    }

    @Override
    public void disparar(Personaje objetivo) {
        if (balas > 0) {
            System.out.println("Disparando pistola a " + objetivo.getNombre());
            objetivo.recibirDaño(daño);
            balas--;
        } else {
            System.out.println("No hay balas: Debe recargar.");
        }
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Arma: pistola");
        System.out.println("Daño: " + daño);
        System.out.println("Balas: " + balas);

    }

  

}
