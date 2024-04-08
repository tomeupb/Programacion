package dominio;

public abstract class plaza {

    private boolean estado ;



    public plaza(){
        this.estado=false;
    }


    public boolean getEstado(){
        return estado;
    }


    // ocupar y deosocupar hacen la funcion de setter
    public void ocupar(){
        this.estado=true;
    }

    public void desocupar(){
        this.estado= false;
    }


    public void mostrarEstado(){
        if(estado){
            System.out.println("La plaza esta ocupada");

        }else{
            System.out.println("La plaza esta libre");
        }
    }

}
