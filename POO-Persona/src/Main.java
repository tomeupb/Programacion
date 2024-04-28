import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Persona> ListadoPersonas = new ArrayList<>();
        int cantidad = 3;


        for (int i = 0; i < cantidad; i++) {

            System.out.println("Introduce datos de cada persona" + i);

            System.out.println("Introduce nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Introduce apellido: ");
            String apellido = sc.nextLine();

            System.out.println("Introduce edad: ");
            int edad = sc.nextInt();

            sc.nextLine();

            System.out.println("Introduce genero (M/F): ");
            String genero = sc.nextLine();





            Persona PersonaIntroducida = new Persona(nombre, apellido, edad, genero);
            ListadoPersonas.add(PersonaIntroducida);


        }
        //Retorno
        MediaEdades(ListadoPersonas);
        GeneroM(ListadoPersonas);
        GeneroF(ListadoPersonas);
    }


    public static void MediaEdades(List<Persona> ListadoPersonas) {
        for (Persona persona : ListadoPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido() + ", Edad: " + persona.getEdad() + "Genero" + persona.getGenero());
        }
        int contador = 0;
        int edadT = 0;
        int promedio = 0;

        for (int i = 0; i < ListadoPersonas.size(); i++) {
            contador++;
            edadT += ListadoPersonas.get(i).getEdad();

        }

        promedio = edadT / contador;
        System.out.println("El promedio de las edades es :" + promedio);


    }

    public static void GeneroM(List<Persona> ListadoPersonas) {

        int masculino = 0;
        for (int i = 0; i < ListadoPersonas.size(); i++) {

            if (ListadoPersonas.get(i).getGenero().equals("M")) {
                masculino++;


            }
        }
            System.out.println("La canitdad de personas con genero masculino son " + masculino);


    }

    public static void GeneroF(List<Persona> ListadoPersonas) {

        int femenino = 0;

        for (int i = 0; i < ListadoPersonas.size(); i++) {
            if (ListadoPersonas.get(i).getGenero().equals("F")) {
                femenino++;
            }
        }

            System.out.println("La cantidad de personas con genero femenino es " + femenino);

        }


    }





