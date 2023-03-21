
package Cine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sala {
    private int numero;
    private int capacidad;
    private Pelicula pelicula;
    private List<Integer> plazaslibres;
    
    public Sala(int n, int c, Pelicula p){
        this.numero=n;
        this.capacidad=c;
        this.pelicula=p;
        this.plazaslibres= new ArrayList<>();
        for(int i = 0;i < c; i++){
            this.plazaslibres.add(i+1);
        }
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public List<Integer> getPlazaslibres() {
        return plazaslibres;
    }
    
     
    public int buscarPlazaLibre(){
        Random r = new Random();
        int alt = r.nextInt(1, this.getPlazaslibres().size());
        return alt;
    }
    
    public boolean reservar(int n){
        boolean reservada = false;
        if(this.plazaslibres.contains(n)){
            this.plazaslibres.remove(n);
            reservada = true;
        }
        return reservada;
    }
    
    @Override
    public String toString(){
        String s = "Sala"+this.numero+ "-" + this.pelicula.titulo(); 
        return s;
    }
    
}
