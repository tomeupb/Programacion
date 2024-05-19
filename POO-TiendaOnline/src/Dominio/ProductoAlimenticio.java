package Dominio;

public class ProductoAlimenticio extends Producto {

    boolean comida;
    boolean bebida;

    String caducidad;



    public ProductoAlimenticio(String nombre, int precio , int stock, String marca , boolean comida , boolean bebida , String caducidad){
        super(nombre,precio,stock, marca);
        this.comida=comida;
        this.bebida=bebida;
        this.caducidad= caducidad;
    }


    @Override
    public String toString(){
        return "El nombre del producto es: "+nombre+" el precio es de "+precio+" euros "+"el stock es de "
                +stock+" la marca es "+marca+" es bebida? "+bebida+" es comida? "+comida+"caducidad"+caducidad;
    }

}

