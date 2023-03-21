
package Clases;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;

@Entity
public class CorredorProfesional extends Corredor implements Serializable {
    private int numeroTrofeos;
    private String club;
    
    public CorredorProfesional(){}

     public CorredorProfesional(String nombre, LocalDate fechaNacimiento, int numeroTrofeos, String club){
         super(nombre, fechaNacimiento);
         this.club=club;
         this.numeroTrofeos=numeroTrofeos;
     }
    public int getNumeroTrofeos() {
        return numeroTrofeos;
    }

    public void setNumeroTrofeos(int numeroTrofeos) {
        this.numeroTrofeos = numeroTrofeos;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
    
    
}
