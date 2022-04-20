package ar.org.centro8.curso.java.clase05.test;

import ar.org.centro8.curso.java.clase05.entities.Auto;
import ar.org.centro8.curso.java.clase05.entities.AutoClasico;
import ar.org.centro8.curso.java.clase05.entities.Autonuevo;


public class TestVehiculo {
    public static void main(String[] args) {
 
        System.out.println("*******AutoClasico Sin Radio**********");
        AutoClasico a1 = new AutoClasico("Chevi", "Corsa", "verde");
        System.out.println(a1);
        System.out.println("*******AutoClasico Con Radio**********");
        a1.ConRadio("Chevrolet", "Classic", "Gris", "Pioneer");
        System.out.println(a1);
        System.out.println("*******AutoNuevo Siempre tiene Radio**********");
        Autonuevo a2 = new Autonuevo("Toyota", "Corolla", "Blanco", "Sony");
        System.out.println(a2);
        System.out.println("*******AutoNuevo con Precio**********");
        a2.ConPrecio("Toyota", "Accord", "bordo", "Sanyo", 100000);
        System.out.println(a2);
       
    }
}
