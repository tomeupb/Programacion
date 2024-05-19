package Dominio;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Cesta {

    // Aquí, declaramos una variable de instancia llamada productos,
    // que es una lista (ArrayList) que contendrá objetos de tipo producto
    private static ArrayList<Producto> listaDeProductos;

/*
Este es el constructor de la clase cesta. Cuando se crea un objeto de tipo cesta,
este constructor se ejecuta automáticamente.
Dentro del constructor, inicializamos la lista de productos creando un nuevo ArrayList.
 */


    public Cesta() {
        this.listaDeProductos = new ArrayList<>();

    }


    public void agregarProducto(Producto producto , int catidadComprada ) {
        listaDeProductos.add(producto);
        producto.restarStock(catidadComprada);


    }

    public void mostrarProducto() {
        for (Producto producto : listaDeProductos) {
            System.out.println(producto.getNombre());
        }
    }


    public static int precioTotal() {
        int total = 0;

        for (Producto producto : listaDeProductos) {
            total += producto.getPrecio();
        }
        return total;
    }



    public void impuestos(int impuestos) {

        try {

            int precioConImpuestos = impuestos * precioTotal() / 100;

            int total = precioConImpuestos+precioTotal();

            System.out.println("Los impuestos son del " + impuestos + " % el precio es " + precioTotal() +
                    " y el porcentaje de impuestos sobre el precio es de " + (precioConImpuestos)
                    + " y el precio final con los impuestos incluidos es de " + total);

        } catch (InputMismatchException e) { //solo podemos introducir valores numericos
            System.out.println("El porcentaje es un valor numerico entero" );
        } catch (Exception er) {
            System.out.println("Error" + er.getMessage());

        }
    }




}