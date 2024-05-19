public abstract class Figura {

   private int base;
   private int lado;
   private int radio;

   private double pi;
   private int altura;




    public Figura(int base, int lado, int radio, double pi, int altura) {
        this.base = base;
        this.lado = lado;
        this.radio = radio;
        this.pi = pi;
        this.altura=altura;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public abstract int CalcularArea();



   public int getbase(){
       return base;

   }

   public int getAltura(){
       return lado;
   }


}
