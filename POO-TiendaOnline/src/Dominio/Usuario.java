package Dominio;

public abstract class Usuario {
    String nombre;
    String apellido;
    String direccion;
    char sexo;

    public Usuario(String nombre, String apellido , String direccion , char sexo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.sexo=sexo;
    }


}

