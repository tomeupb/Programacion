
public class Main {
    public static void main(String[] args) {

CuentaCorriente cuentaCorriente1 = new CuentaCorriente("abc1",1000,3);
CuentaAhorro cuentaAhorro1 = new CuentaAhorro("asd1",2000,5,1500);


        System.out.println();
        System.out.println("---Realizamos Transferencias---");
        cuentaAhorro1.traspasar(500,cuentaCorriente1);
        System.out.println(cuentaCorriente1.getSaldo());
        System.out.println(cuentaAhorro1.getSaldo());





        System.out.println();
        System.out.println("---Mostramos datos de las cuentas---");
        System.out.println("Cuenta corriente: "+cuentaCorriente1);
        System.out.println("Cuenta Ahorro: "+cuentaAhorro1);

        System.out.println();
        System.out.println("--- Ingresamos y mostramos ---");
        cuentaCorriente1.ingresar(100);
        System.out.println("Ingresamos 100 "+cuentaCorriente1.getSaldo());
        cuentaAhorro1.ingresar(200);
        System.out.println("Ingresamos 200 "+cuentaAhorro1.getSaldo());

        System.out.println();
        System.out.println("--- Retiramos y mostramos ---");
        cuentaCorriente1.retirar(100);
        System.out.println("Retiramos 100 "+cuentaCorriente1.getSaldo());
        cuentaAhorro1.retirar(200);
        System.out.println("Retiramos 200 "+cuentaAhorro1.getSaldo());

        System.out.println();
        System.out.println("---  Aplicamos intereses ---");
        cuentaCorriente1.calcularIntereses();
        System.out.println(cuentaCorriente1.getSaldo());
        cuentaAhorro1.calcularIntereses();
        System.out.println(cuentaAhorro1.getSaldo());




    }
}