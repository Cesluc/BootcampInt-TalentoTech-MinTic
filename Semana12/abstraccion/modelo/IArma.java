package abstraccion.modelo;

public interface IArma {
    // No tienen atributos a  diferencias de las clases y tienen metodos abstractos

    //Aca todos los metodos son publicos y abstractos obligados a ser implementados.

    void cargar();
    void disparar (Personaje objetivo);
    void mostrarInfo();

    // Solo estan declarados, se implementan en la clase que implementa la interfaz
    // la interfaz no se extiende se implementa. 

    // Metodos por defecto, no estan obligados a ser implementados son opcionales. La clase que implementa la interfaz puede usarlo y sobreescribirlo si quiere
    default void limpiar (){
        System.out.println("Limpiando el arma");
    }

    // Static: Pueden ser usados sin necesidad de implementar la interfaz 

    static void describirArma (){
        System.out.println("Arma usada para atacar enemigos");
    }
}
