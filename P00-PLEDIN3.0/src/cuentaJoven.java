public class cuentaJoven extends cuenta {

     private int bonificacion;
     private int edadTitular;

     public  cuentaJoven(String titular, double cantidad , int bonificacion , int edadTitular ){
         super( titular , cantidad);
         this.bonificacion=bonificacion;
         this.edadTitular=edadTitular;
     }


     public void setBonificacion(int bonificacion){
         this.bonificacion=bonificacion;
     }

    public int getBonificacion() {
        return bonificacion;
    }


    public boolean esTitularValido(){
         if(edadTitular>=18 && edadTitular<=25){
             System.out.println("Es un titular valido");
             return true;
         }
        System.out.println("No es un titular valido");
         return false;

    }
    @Override
    public double retirar(double cantidad) {
        if (esTitularValido()) {
            // Si el titular es válido, permitir la retirada de dinero
            return super.retirar(cantidad);
        } else {
            System.out.println("No se puede retirar dinero. El titular no es válido.");
            return getCantidad();
        }
    }
    @Override
    public void mostrar() {
        super.mostrar(); // Llama al método mostrar() de la clase base para mostrar el titular y la cantidad
        System.out.println("Tipo de cuenta: Cuenta Joven");
        System.out.println("Bonificación: " + bonificacion + " euros");
    }



}
