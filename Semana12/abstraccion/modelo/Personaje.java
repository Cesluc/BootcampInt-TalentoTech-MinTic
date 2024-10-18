package abstraccion.modelo;

public abstract class Personaje { // Para una clase abstracta No se va a poder instanciar
    
    private String nombre;
    private int salud;

    public Personaje(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void recibirDaño ( int cantidad){
        this.salud -= cantidad;
        if (this.salud < 0) {
            this.salud = 0;
        }
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Salud: " + salud);
    }

    public abstract void atacar( Personaje objetivo); // Solo se puede usar en la clase que hereda (Ahi es donde tendra la implementacion)
    // obligatoriamente se debe hacer en la clase que hereda

    
}
