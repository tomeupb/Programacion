public class cuenta {

   private String titular;
    private  double cantidad;

    public cuenta() {

    }

    public cuenta(String titular) {
        this.titular = titular;
    }

    public cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }


    public void setTitular(String titular) {
        this.titular = titular;

    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    public double getCantidad() {
        return cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void mostrar() {
        System.out.println("El titular es: " + titular + " y tiene la cantidad de: " + cantidad + " euros");
    }


    public double ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }

        return this.cantidad;


    }

    public double retirar(double cantidad) {
        if (this.cantidad > 0) {
            this.cantidad -= cantidad;

        }
        if (this.cantidad < 0) {
            System.out.println("La cuenta esta en numeros rojos: ");

        }
        return this.cantidad;
    }
}




