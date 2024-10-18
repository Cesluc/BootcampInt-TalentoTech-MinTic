package abstraccion.principal;

import abstraccion.modelo.Enemigo;
import abstraccion.modelo.Escopeta;
import abstraccion.modelo.IArma;
import abstraccion.modelo.Jugador;
import abstraccion.modelo.Pistola;

public class Main {
    public static void main(String[] args) {
        
        IArma pistola = new Pistola(20, 15);
        IArma escopeta = new Escopeta(50, 5);

        Enemigo enemigo1 = new Enemigo("Enemigo 1", 100);
        Jugador jugador1 = new Jugador("Jugador 1", 100, 100, 15, 30, pistola);

        enemigo1.mostrarInfo();
        jugador1.mostrarInfo();

        enemigo1.atacar(jugador1);
        jugador1.atacar(enemigo1);

        enemigo1.mostrarInfo();
        jugador1.mostrarInfo();

        jugador1.cambiarArma(escopeta);
        jugador1.atacar(enemigo1);
        
        jugador1.mostrarInfo();
        enemigo1.mostrarInfo();

        jugador1.limpiarArma();

        enemigo1.describirArma();


    }
}
