package Dominio;

public class productoTextil extends  producto {


    char talla;
    String tipo;

    boolean segundaMano;


    public productoTextil(String nombre, int precio , int stock, String marca, char talla , String tipo, boolean segundaMano){
        super(nombre,precio,stock, marca);
        this.talla=talla;
        this.tipo=tipo;
        this.segundaMano=segundaMano;

    }

    @Override
    public String toString(){
        return "El nombre del producto es: "+nombre+" el precio es de "+precio+" euros "+"el stock es de "
                +stock+" la marca es "+marca+" la talla es "+talla+" el tipo de prenda es "+tipo+" es de segunda mano"+segundaMano;
    }
}

