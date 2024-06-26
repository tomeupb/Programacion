package Dominio;


public class Cliente extends Usuario {

    private int  id;
    private int saldo;



    public Cliente(String nombre, String apellido, String direccion , char sexo , int id , int saldo){
        super(nombre,apellido,direccion,sexo);
        this.id=id;
        this.saldo=saldo;



    }

    @Override
    public String toString(){
        return "El nombre del cliente es "+nombre+" el apellido es "+apellido+" la direccion es "+direccion+" y el sexo es "+sexo+ " y la ID es "+id;
    }


    public void dinero() {
        int total = Cesta.precioTotal();

        if (saldo >= total) {
            System.out.println("Puede efectuar la compra");
        } else {
            System.out.println("tarjeta rechazada");
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo=saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

