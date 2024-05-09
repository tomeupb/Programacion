package Dominio;

public abstract class descuentoCantidad implements  descuentos {

    private int facturaGasto;
    private int descuento;





    public descuentoCantidad( ){
        this.facturaGasto= 0; //inicializamos facturaGasto a 0
        calcularDescuento(this.facturaGasto);  // inicializamos descuento a 0


    }


    public int getDescuento() {
        return descuento;
    }

    public int getFacturaGasto() {
        return facturaGasto;
    }



    public void setFacturaGasto(int facturaGasto) {
        this.facturaGasto = facturaGasto;
        this.descuento = calcularDescuento(this.facturaGasto);
    }

    @Override
    public void nombreDescuento() {
        if (facturaGasto > 100) {
            System.out.println("Gasto pequeño : Tienes que gastar más");
        }

        if (facturaGasto > 250) {
            System.out.println("Gasto Mediano : Descuento aceptado");
        }

        if (facturaGasto > 500) {
            System.out.println("Gasto grande : Descuento aceptado +Bonus");
        }
    }

    public int calcularDescuento(int facturaGasto) {
        if (facturaGasto < 100) {
            descuento = 0;
        } else if (facturaGasto < 250) {
            descuento = 25;
        } else if (facturaGasto >= 500) {
            descuento = 50;
        }
        return descuento;
    }




}
