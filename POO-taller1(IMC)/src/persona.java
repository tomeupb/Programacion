import java.sql.SQLOutput;

public class persona {

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;


    public persona() {

    }

    public persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    public persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public String calcularIMC() {
        double imc;
        imc = peso / (Math.pow(altura, 2));

        if (imc < 20) {
            return "Esta por debajo del peso ideal nivel -1";
          //  return -1;
        }
        if (imc >= 20 && imc <= 25) {

            return "Peso ideal nivel 0";
           // return 0;
        }
        if (imc > 25) {
           return "Tiene sobrepeso nivel 1";
           // return 1;
        }
        System.out.println("error");
        return "error nivel -2";

    }




    public boolean esMayorDeEdad(){
        if(edad>=18){
            System.out.println("Es mayor de edad");
            return true;
        }else{
            System.out.println("Es menor de edad");
            return false;
        }
    }



    public void ComprobarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm') {
            System.out.println("ES un hombre");

        }
        if (sexo == 'F' || sexo == 'f') {
            System.out.println("ES una mujer");
        }
    }


    @Override
    public String toString(){
      return  "La persona "+nombre+" tiene "+edad+" años , es de sexo "+sexo+" su peso es de "+peso+" kg y su altura es de "+altura+" m y su IMC es :"+calcularIMC();
    }

}


