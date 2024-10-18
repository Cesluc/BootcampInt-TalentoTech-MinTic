package abstraccion.modelo;

public class Enemigo extends Personaje {

    public Enemigo(String nombre, int salud) {
        super(nombre, salud);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println("El enemigo: " + getNombre() + "esta atacando a " + objetivo.getNombre());
        objetivo.recibirDaño(10);

    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Enemigo, sin arma");

    }
    
    public void describirArma (){
        // System.out.println("Sin arma");
        IArma.describirArma();
    }
}
