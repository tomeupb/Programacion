package Dominio;

public class ProductoElectronico extends Producto {

    int numeroDeSerie;
    boolean camara;

    String sitemaOperativo;



    public ProductoElectronico(String nombre, int precio , int stock, String marca, int numeroDeSerie , boolean camara, String sitemaOperativo){
        super(nombre,precio,stock,marca);
        this.numeroDeSerie=numeroDeSerie;
        this.camara=camara;
        this.sitemaOperativo=sitemaOperativo;
    }


    @Override
    public String toString(){
        return "El nombre del producto es: "+nombre+" el precio es de "+precio+" euros "+"el stock es de "
                +stock+" la marca es "+marca+" el numero de serie es "+numeroDeSerie+" tiene camara "+camara+" el sistema operativo es "+sitemaOperativo;
    }

}

