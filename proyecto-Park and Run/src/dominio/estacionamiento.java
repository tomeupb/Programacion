package dominio;
import java.util.HashSet;
public class estacionamiento {


    HashSet<plaza>parking;
private int plazasTotales;
    public estacionamiento( int plazasTotales){
        this.parking= new HashSet<>();
        this.plazasTotales = plazasTotales;

    }


    public void addPlaza(plaza p){
       this.parking.add(p);

    }


    public  boolean containsPlaza(plaza p){
        return this.parking.contains(p);

    }

    public int sizeParking(){
        return this.parking.size();
    }

    public void removePlaza(plaza p){
    this.parking.remove(p);
    }

//no hace falta parámetro

    public void clearPlaza(){
        this.parking.clear();

    }

    public int plazasTotales(){
        return this.plazasTotales;

    }

    public int plazasDisponibles(){
        return this.plazasTotales - this.sizeParking();
    }

    public boolean espacioDisponible(){
        if(plazasDisponibles()>0){
            System.out.println("tienes plazas disponibles");
            return true;

        }
        System.out.println("no tienes plazas disponibles");
        return false;
    }


    public boolean puedoAparcar(){
        int i =1;

        for(plaza p: parking){
            if(!p.getEstado()){
                System.out.println("Puede aparcar en la plaza "+i);
                return true;
            }
            i++;
        }
        System.out.println("Lo sentimos no tenemos plazas libres ");
        return false;
    }




}
