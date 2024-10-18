package Herencia.principal;

import java.time.LocalDate;

import Herencia.modelo.Alimento;
import Herencia.modelo.Electrodomestico;
import Herencia.modelo.Producto;

public class Main {
    
    public static void main(String[] args) {
        Producto producto1 = new Producto("agua", 10, 1);
        

        Electrodomestico electrodomestico1 = new Electrodomestico("Lavadora", 10000, 20, "LG");
        electrodomestico1.mostrarInfoElectrodomestico();


        Alimento alimento1 = new Alimento("Leche", 10, 1, LocalDate.of(2024,1,1));
        alimento1.mostrarInfoAlimento();
    }
}
