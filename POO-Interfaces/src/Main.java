
public class Main {
    public static void main(String[] args) {

//Usamos una clase abstracata para tener herencia de figura sobre circulo cuadrado
// y triangulo y obtenemos una interfaz para implementar los lados que en cada caos serán diferentes

        Circulo circulo1 = new Circulo(0,0,3,4,0);
        Cuadrado cuadrado1 = new Cuadrado(0,5,0,0,0);
        Triangulo triangulo1 = new Triangulo(5,0,3,0,6);

        circulo1.lados();
        cuadrado1.lados();
        triangulo1.lados();

        System.out.println( "El area del circulo es: "+circulo1.CalcularArea());
        System.out.println("El area del cuadrado es: "+cuadrado1.CalcularArea());
        System.out.println("El area de un circulo es : "+circulo1.CalcularArea());

        }

}