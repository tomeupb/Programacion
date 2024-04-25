import java.util.ArrayList;
import java.util.Scanner;

public class cuentaBancaria {

    private final String nombre;
    private final String iban;
    private  double saldo;
    private boolean valida;

    private ArrayList<Double>movimientos;


    Scanner sc = new Scanner(System.in);

    public cuentaBancaria(String iban, String nombre, double saldo) {
        this.iban = iban;
        this.nombre = nombre;
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
        // se inicializa el ArrayList movimientos para almacenar los movimientos de la cuenta.
        // Se crea un nuevo ArrayList vacío en cada instancia de cuentaBancaria
    }


    public String getIban() {
        return iban;
    }

    public String getNombre(){
        return nombre;
    }


    public double getSaldo(){
        return saldo;
    }



    public boolean valido() {

        if (iban.matches("^[A-Z]{2}\\d{22}")) {
            System.out.println("La validación es correcta");
            valida = true;
        } else {
            System.out.println("La validacion no es corecta");
            valida = false;


        }
        return valida;
    }


    public double ingresar() {

        System.out.println("Cuánto quieres ingresar?");
        double cantidad = sc.nextDouble();

        if(cantidad>3000){
            System.out.println("AVISO HACIENDA");
        }
        this.saldo += cantidad;
        nMovimiento(cantidad);

        return this.saldo;
    }




    public double retirar(){
        System.out.print("Cuanto quieres retirar?: ");

        double cantidad = sc.nextDouble();
        if(cantidad>3000){
            System.out.println("AVISO HACIENDA");
        }

        this.saldo-=cantidad;
        nMovimiento(-cantidad);
        if(this.saldo<0){
            System.out.println("SALDO NEGATIVO");
        }
        return cantidad;

    }





    @Override
    public String toString() {
        return "El nombre del titular es " +nombre+" y el numeros de  iban es " +iban+ "y el saldo es de"+this.saldo;
    }


    public void nMovimiento(double valorMovimiento) {
        movimientos.add(valorMovimiento);
        if (movimientos.size() > 100) {
            System.out.println("No tienes más movimientos");

        }
    }

    public void mostrarMovimientos() {
        System.out.println("Historial de movimientos:");
        for (int i = 0; i < movimientos.size(); i++) {
            System.out.println((i + 1) + ". " + movimientos.get(i));
        }
    }

}





