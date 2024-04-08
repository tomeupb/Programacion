import org.w3c.dom.ls.LSOutput;

public class persona {

     private String nombre;
    private int edad;
     private int DNI;


    public persona() {

    }

    public persona(String nombre, int edad, int DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;

    }


    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }


    public void setDNI(int DNI) {
        this.DNI = DNI;

    }

    public int getDNI() {
        return DNI;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }


    /* puede ser de las dos maneras

    public String mostrar() {
        return "El nombre es " + nombre + " tiene " + edad + "años" + "y su DNI es " + DNI + ";";
    }
    */
    
@Override
    public String toString() {
        return "El nombre es " + nombre + " tiene " + edad + " años" + " y su DNI es " + DNI + ";";
    }


    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;

        }
        System.out.println("Es menor de edad");
        return false;

    }
}




