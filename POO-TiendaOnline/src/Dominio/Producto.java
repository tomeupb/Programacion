package Dominio;

public class Producto {

    String nombre;
    int precio;
    int stock;
    String marca;


    public Producto(String nombre, int precio, int stock , String marca){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
        this.marca=marca;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public void restarStock(int cantidadComprada){
        this.stock-=cantidadComprada;
    }

    public void disponibilidad(int cantidadComprada){
        if(cantidadComprada<=this.stock){
            System.out.println("Puedes comprar la cantidad seleccionada");
        }else{
            System.out.println("No puedes comprar la cantidad seleccionada");
        }
    }


}

