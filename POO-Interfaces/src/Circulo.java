public class Circulo extends Figura implements Lados{


    public Circulo(int base, int lado, int radio, double pi , int altura) {
        super(base, lado, radio, pi, altura);
    }

    public void lados() {
        System.out.println(" El circulo Tiene 0 lados");

    }

    @Override
    public int CalcularArea() {
       return (int) ((getPi()*getPi())*getRadio());
    }


}
