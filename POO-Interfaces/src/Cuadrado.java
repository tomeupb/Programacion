public class Cuadrado extends Figura implements  Lados {


    public Cuadrado(int base, int lado, int radio, double pi, int altura) {
        super(base, lado, radio, pi, altura);
    }




    public void lados() {
        System.out.println(" El cuadrado Tiene 4 lados");

    }

    @Override
    public int CalcularArea() {
        return getLado()*getLado();
    }
}
