import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valido = true;
        cuentaBancaria cuenta1 = new cuentaBancaria("ES6621000418401234567891", "Tomeu",0);


        while (cuenta1.valido() && valido ) {

            System.out.println("A que apartado quieres ir?: ");

            System.out.println();
            System.out.println("1. IBAN, el titular y el saldo.");
            System.out.println("2. IBAN.");
            System.out.println("3. Titular.");
            System.out.println("4. Saldo .");
            System.out.println("5. Ingreso.");
            System.out.println("6. Retirada. ");
            System.out.println("7. Movimientos. ");
            System.out.println("8. Salir.");

            int apartado = sc.nextInt();
            switch (apartado) {

                case 1:
                    System.out.println(cuenta1);
                    break;
                case 2:
                    System.out.print(cuenta1.getIban());
                    break;
                case 3:
                    System.out.print(cuenta1.getNombre());
                    break;
                case 4:
                    System.out.print(cuenta1.getSaldo());
                    break;
                case 5:
                    System.out.print(cuenta1.ingresar());
                    break;
                case 6:
                    System.out.print(cuenta1.retirar());
                    break;
                case 7:
                    cuenta1.mostrarMovimientos();
                    break;
                case 8:
                    System.out.print("saliendo...");
                    valido = false;
                        break;

                    }

            }



    }
}