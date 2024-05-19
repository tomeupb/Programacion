public class Triangulo extends Figura implements  Lados {


    public Triangulo(int base, int lado, int radio, double pi, int altura) {
        super(base, lado, radio, pi, altura);
    }


    public void lados() {

        System.out.println(" El triangulo Tiene 3 lados");

    }

    @Override
    public int CalcularArea() {
        return getbase()*getAltura()/2;
    }
}
