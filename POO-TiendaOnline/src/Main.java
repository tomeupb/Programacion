import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creamos objetos de producto
        productoElectronico productoElectronico1 = new productoElectronico("Smartphone", 500, 10, "Samsung", 123456, true, "Android");
        productoTextil productoTextil1 = new productoTextil("Camiseta", 20, 20, "Nike", 'M', "Deportiva", false);
        productoAlimenticio productoAlimenticio1 = new productoAlimenticio("Leche", 2, 30, "Asturiana", false, true, "2024-04-15");


        System.out.println("***MOSTRAMOS PRODUCTOS***"); //METODO TO STRING
        System.out.println(productoElectronico1.toString());
        System.out.println(productoTextil1.toString());
        System.out.println(productoAlimenticio1.toString());
        System.out.println();


        System.out.println("***MOSTRAMOS USUARIOS***");
        //Creamos objetos de clientes
        cliente cliente1 = new cliente("tomeu","provenzal","palma",'M',1, 0);
        System.out.print("Introduce el saldo del cliente: ");
        cliente1.setSaldo(sc.nextInt());

        System.out.println(cliente1.toString());
        System.out.println();


        System.out.println("***MOSTRAMOS CESTA***");

        cesta cesta1 = new cesta(600);
        System.out.println("La cesta de: "+cliente1.nombre);
        cesta1.agregarProducto(productoElectronico1,1);
        cesta1.agregarProducto(productoTextil1,1);
        cesta1.agregarProducto(productoAlimenticio1,1);
        cesta1.mostrarProducto();
        System.out.println();


        System.out.println("***VEMOS LA DISPONIBILIDAD DE COMPRA ***");
        productoAlimenticio1.disponibilidad(1);
        productoTextil1.disponibilidad(1);
        productoElectronico1.disponibilidad(1);
        System.out.println();


        System.out.println("***Vemos el Stock de los productos***");
        System.out.println("Stock de productos alimenticios: "+productoAlimenticio1.stock);
        System.out.println("Stock de productos textiles: "+productoTextil1.stock);
        System.out.println("Stock de productos Eectronicos: "+productoElectronico1.stock);
        System.out.println();




        System.out.println("***AÑADIMOS IMPUESTOS***");
        System.out.println("Que porcentaje de impuestos quieres introducir? ");
        int impuestos = sc.nextInt();
        System.out.println(cesta1.precioTotal()+" €");
        cesta1.impuestos(impuestos);
        System.out.println();


        System.out.println("***PAGAMOS EN CAJA***"); //falta hacer esto bien clase cesta
        cliente1.dinero();








    }
}