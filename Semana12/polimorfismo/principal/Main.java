package polimorfismo.principal;

import polimorfismo.modelo.Admin;
import polimorfismo.modelo.Cliente;
import polimorfismo.modelo.Invitado;
import polimorfismo.modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        
        Usuario[] usuarios = new Usuario[4];

        usuarios[0] = new Usuario("Maria", "Maria@gmail.com");
        usuarios[1] = new Invitado("Jose", "Jose@gmail.com");
        usuarios[2] = new Cliente("Gladys", "gladys@gmail.com", "Av 0"); // Al cliente heredar de usuario, tambien pertenece al array de usario
        usuarios[3] = new Admin("Pepe", "pepe@gmail.com", "Administrador");

        // for (int i = 0; i < usuarios.length; i++) {
        //     usuarios[i].mostrarInfo();
        //     usuarios[i].definirPermisos();
        //     System.out.println();
            
        // }

        for (Usuario usuario : usuarios) { // para recorrer un array de principio a fin
            usuario.mostrarInfo();
            usuario.definirPermisos();
            System.out.println();
        }

        Usuario usuario1 = new Usuario("Sara", "sara@gmail.com");

        usuario1.definirPermisos();
        usuario1.definirPermisos("Supervisor");

    }
}
