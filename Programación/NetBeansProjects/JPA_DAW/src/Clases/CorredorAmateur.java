
package Clases;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;

//Esto para que se grabe en una base de datos
@Entity
public class CorredorAmateur extends Corredor implements Serializable{
    private double velocidadMedia;
    private int experiencia;
    
    
    public CorredorAmateur(){
        
    }
    
    public CorredorAmateur(String nombre, LocalDate fechaNac, double vm, int experiencia){
        super(nombre, fechaNac);
        this.velocidadMedia=vm;
        this.experiencia=experiencia;
    }

    public double getVelocidadMedia() {
        return velocidadMedia;
    }

    public void setVelocidadMedia(double velocidadMedia) {
        this.velocidadMedia = velocidadMedia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
}
