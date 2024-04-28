public class CuentaAhorro extends  CuentaBancaria{

    private int saldoMinimo;

    public CuentaAhorro(String iban, double saldo, int interesAnualBasico, int saldoMinimo) {
        super(iban, saldo, interesAnualBasico);
        this.saldoMinimo=saldoMinimo;
    }

    @Override
    public String toString() {
        return "El iban es "+getIban()+" el saldo es de "+getSaldo()+" el interes es de "+getInteresAnualBasico();
    }

    public void calcularIntereses() {

        if (getSaldo() < saldoMinimo) {

            double mitad = getInteresAnualBasico()/2;
            double intereses = getSaldo() * mitad ;
            intereses = intereses/100;

            ingresar(intereses);


        }else{
            double doble = getInteresAnualBasico()*2;
            double intereses = getSaldo() * doble ;
            intereses = intereses/100;

            ingresar(intereses);

        }
    }

}
