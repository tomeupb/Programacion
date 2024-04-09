import java.util.Scanner;
import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) {





       persona persona1 = new persona("tomeu",20,'M',100,1.7);
       persona persona2 = new persona("laura",15,'F',60,1.6);
       persona persona3 = new persona("paula",60,'F',30,1.5);

        System.out.println("***COMPROBAMOS PESO***");
        System.out.println(persona1.calcularIMC());
        System.out.println(persona2.calcularIMC());
        System.out.println(persona3.calcularIMC());


        System.out.println("***COMPROBAMOS EDAD***");
        persona1.esMayorDeEdad();
        persona2.esMayorDeEdad();
        persona3.esMayorDeEdad();


        System.out.println("***COMPROBAMOS SEXO ***");
        persona1.ComprobarSexo('M');
        persona2.ComprobarSexo('f');
        persona3.ComprobarSexo('f');



        System.out.println("***MOSTRAMOS TODA LA INFORMACION***"); //metodo toString
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);


    }

}