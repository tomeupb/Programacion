public class CuentaCorriente extends  CuentaBancaria{

    public CuentaCorriente(String iban, double saldo,  int interesAnualBasico) {
        super(iban, saldo,  interesAnualBasico);
    }


    @Override
    public String toString() {
        return "El iban es "+getIban()+" el saldo es de "+getSaldo()+" el interes es de "+getInteresAnualBasico();
    }



    public void calcularIntereses() {
        double intereses = getSaldo() * getInteresAnualBasico()/100;

        ingresar(intereses);

    }






}



