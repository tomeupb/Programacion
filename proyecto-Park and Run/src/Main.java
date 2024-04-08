import dominio.estacionamiento;
import dominio.plazaCoche;
import dominio.plazaMoto;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("***Estacionamientos de moto***");

        estacionamiento moto = new estacionamiento(30);

        plazaMoto moto1 = new plazaMoto();
        plazaMoto moto2 = new plazaMoto();
        plazaMoto moto3 = new plazaMoto();

        moto.addPlaza(moto1);
        moto.addPlaza(moto2);
        moto.addPlaza(moto3);




        System.out.println("Plazas totales: "+moto.plazasTotales());  //total
        System.out.println("Plazas disponibles: "+moto.plazasDisponibles()); // disponibles
        System.out.println("Plazas usadas: "+moto.sizeParking()); // usadas
        int precioMoto = moto.sizeParking()*2;
        System.out.println("El precio total por los motos es de : " +precioMoto + " euros");
        System.out.println("   ");
        System.out.println("***Estacionamientos de  de coche***");

        estacionamiento coche = new estacionamiento(3);
        plazaCoche coche1 = new plazaCoche ();
        plazaCoche coche2 = new plazaCoche ();


        coche.addPlaza(coche1);
        coche.addPlaza(coche2);
        coche2.ocupar();
        coche1.ocupar();



        System.out.println( "Plazas totales: "+coche.plazasTotales());  //total
        System.out.println( "Plazas disponibles: "+coche.plazasDisponibles()); // disponibles
        System.out.println( "Plazas usadas: "+coche.sizeParking()); // usadas

        int precioCoche = coche.sizeParking()*4;
        System.out.println("El precio total por los coches es de : " +precioCoche + " euros");

        int total = precioCoche + precioMoto;

        System.out.println("Dinero total acumulado de coches y motos : " +total);

        coche.espacioDisponible();

        coche.puedoAparcar();
        }

}