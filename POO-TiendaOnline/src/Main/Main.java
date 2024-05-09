package Main;

import Dominio.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
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
        cliente cliente1 = new cliente("tomeu", "provenzal", "palma", 'M', 1, 0);
        System.out.print("Introduce el saldo del cliente: ");
        cliente1.setSaldo(sc.nextInt());

        System.out.println(cliente1.toString());
        System.out.println();


        System.out.println("***MOSTRAMOS CESTA***");

        cesta cesta1 = new cesta();
        System.out.println("La cesta de: " + cliente1.toString());
        cesta1.agregarProducto(productoElectronico1, 1);
        cesta1.agregarProducto(productoTextil1, 1);
        cesta1.agregarProducto(productoAlimenticio1, 1);
        cesta1.mostrarProducto();
        System.out.println();


        System.out.println("***VEMOS LA DISPONIBILIDAD DE COMPRA ***");
        productoAlimenticio1.disponibilidad(1);
        productoTextil1.disponibilidad(1);
        productoElectronico1.disponibilidad(1);
        System.out.println();


        System.out.println("***Vemos el Stock de los productos Actualizado***");
        System.out.println("Stock de productos alimenticios: " + productoAlimenticio1.getStock());
        System.out.println("Stock de productos textiles: " + productoTextil1.getStock());
        System.out.println("Stock de productos Eectronicos: " + productoElectronico1.getStock());
        System.out.println();


        System.out.println("***AÑADIMOS IMPUESTOS***");
        System.out.println("Que porcentaje de impuestos quieres introducir? ");
        int impuestos = sc.nextInt();
        System.out.println(cesta1.precioTotal() + " €");
        cesta1.impuestos(impuestos);
        System.out.println();


        System.out.println("***PAGAMOS EN CAJA***"); //falta hacer esto bien clase cesta
        cliente1.dinero();

        System.out.println("Ha realizado un compra el cliente: " + cliente1.toString());


        System.out.println(" ");
        System.out.println("***¿ SE APLICA EL BONO DESCUENTO ?***");
        descuentoCantidad discount = new descuentoPrimeraCompra();
        boolean correcto;
        do {
            try {

                System.out.print("Cuanto has gastado?: ");
                discount.setFacturaGasto(sc.nextInt());
                System.out.println("El descuento es de: " + discount.getDescuento() + " euros");
                correcto = true;

            } catch (InputMismatchException e) {
                correcto = false;
                System.out.println("Escribe un numero entero ");
                sc.next(); //sale del bucle infinito

            }


        } while (!correcto);


        System.out.println();
        System.out.println("***GUARDAMOS LA INFORMACION EN UN FICHERO***");
        // Ruta del archivo
        String filePath = "C:\\Users\\tomeu\\OneDrive\\Escritorio\\Java1\\ficheros\\tiendaOnline.txt";

        // Crear el objeto File
        File miArchivo = new File(filePath);

        // Verificar si el archivo existe y crearlo si no existe
        if (!miArchivo.exists()) {
            try {
                miArchivo.createNewFile();
                System.out.println(miArchivo.getName() + " ha sido creado");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        // Escribir información en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // Escribir datos en el archivo

            writer.write(productoElectronico1.toString());
            System.out.println(" ");
            writer.newLine();
            writer.newLine();
            writer.write(productoTextil1.toString());
            System.out.println(" ");
            writer.newLine();
            writer.newLine();
            writer.write(productoAlimenticio1.toString());
            writer.newLine();
            writer.newLine();
            writer.write("El saldo del cliente es de : " + cliente1.getSaldo() + "euros");
            writer.newLine();
            writer.newLine();
            writer.write("El descuento es de: " + discount.getDescuento() + " euros");
            writer.newLine();
            writer.newLine();
            writer.write("Ha realizado un compra el cliente: " + cliente1.toString() + " con el ID " + cliente1.getId());
            writer.newLine();
            writer.newLine();
            System.out.println("Datos escritos en el archivo." + miArchivo.getName());
            }




        String sql = " select nombre from user where id=3";
        String url = "jdbc:mysql://localhost:3306/usuarios";
        String username = "root";
        String password = "144hzacer";

        System.out.println("***Tarjeta cliente***");
        System.out.println("Introduce el nombre para crearla:");
        sc.nextLine();
        String nombre =sc.nextLine();

        System.out.println("Introduce tu edad para crearla :");
        int edad =sc.nextInt();





        try (Connection con = DriverManager.getConnection(url, username, password)) {
            // Consulta SQL de inserción con parámetros
            String sqlInsert = "INSERT INTO user (nombre, edad) VALUES (?, ?)";

            // Creación de un objeto PreparedStatement para ejecutar la consulta SQL de inserción
            try (PreparedStatement pstmt = con.prepareStatement(sqlInsert)) {
                // Asignación de valores a los parámetros de la consulta SQL
                pstmt.setString(1, nombre);
                pstmt.setInt(2, edad);

                // Ejecución de la consulta SQL de inserción
                int filasAfectadas = pstmt.executeUpdate();
                System.out.println(filasAfectadas + " fila(s) insertada(s)/ tarjeta creada con éxtio");
            } catch (SQLException e) {
                System.err.println("Error al crear el PreparedStatement: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
