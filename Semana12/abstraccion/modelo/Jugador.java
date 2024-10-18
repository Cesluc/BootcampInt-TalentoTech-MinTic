package abstraccion.modelo;

public class Jugador  extends Personaje implements IArma{

    private int energia;
    private int balas;
    private int daño;
    private IArma iArma;

    public Jugador(String nombre, int salud, int energia, int balas, int daño, IArma iArma) {
        super(nombre, salud);
        this.energia = energia;
        this.balas = balas;
        this.daño = daño;
        this.iArma = iArma;
    }

    @Override
    public void cargar() {
        System.out.println("Cargando arma del jugador");
        balas = 15;
    }

    @Override
    public void disparar(Personaje objetivo) {
        if (balas > 0) {
            System.out.println( "El jugador " + getNombre() + " esta disparando a " + objetivo.getNombre());
            objetivo.recibirDaño(daño);
            balas--;
        } else {
            System.out.println("No hay balas: Debe recargar.");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Energia: " + energia);
        System.out.println("Daño: " + daño);
        System.out.println("Balas: " + balas);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println("El jugador " + getNombre() + " esta atacando a " + objetivo.getNombre());
        disparar(objetivo);
        energia-=10;
    }

    // @Override
    // public void limpiar() {
    //     IArma.super.limpiar();
    // }

    public void limpiarArma() {
        iArma.limpiar();

    }
    
    public void cambiarArma (IArma nuevArma){
        System.out.println("El jugador esta cambiando arma");
        this.iArma = nuevArma;
    }
}
