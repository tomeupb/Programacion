import java.util.Scanner;

abstract class CuentaBancaria {

    private String iban;
    private double saldo;

    private int interesAnualBasico;


    public CuentaBancaria(String iban, double saldo,  int interesAnualBasico) {
        this.iban = iban;
        this.saldo = saldo;
        this.interesAnualBasico = interesAnualBasico;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }





    public int getInteresAnualBasico() {
        return interesAnualBasico;
    }

    public void setInteresAnualBasico(int interesAnualBasico) {
        this.interesAnualBasico = interesAnualBasico;
    }

    public double ingresar(double cantidad) {

        saldo += cantidad;
        return cantidad;
    }


    public int retirar(int cantidad) {

        saldo -= cantidad;
        return cantidad;
    }

    public void traspasar(double cantidad, CuentaBancaria cuentaDestino) {

        if(cantidad<= saldo){
            saldo-=cantidad;
            cuentaDestino.ingresar(cantidad);
            System.out.println("Ingreso correcto");
        }else{
            System.out.println("Cantidad insuficinete: ingreso incorrecto");
        }

    }


    public abstract void calcularIntereses();

}







