//https://plataforma.josedomingo.org/pledin/cursos/programacion_python3/curso/u42/
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Ejercicio1
        System.out.println("***Persona***");
persona persona1 = new persona("Tomeu",23,354313123);

        System.out.println(persona1);
        persona1.esMayorDeEdad();

        //Ejercicio2
        System.out.println("***Cuenta***");
cuenta cuenta1 = new cuenta("Tomeu",100);

        cuenta1.ingresar(100);
       // cuenta1.retirar(201);
        cuenta1.mostrar();

    //Ejercicio 3
        System.out.println("***Cuenta Joven***");

        cuentaJoven cuentaJoven1 = new cuentaJoven("Tomeu",300, 40,22);
      cuenta1.retirar(100);
      cuenta1.mostrar();
      cuentaJoven1.esTitularValido();
      cuentaJoven1.mostrar();
        }



}