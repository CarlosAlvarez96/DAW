
package Clases;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Carnet implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private LocalDate fechaExpedicion;
    @OneToOne
    private CorredorProfesional corredor;
    private Carnet carnet;

    public Carnet getCarnet() {
        return carnet;
    }

    public void setCarnet(Carnet carnet) {
        this.carnet = carnet;
    }
    
    public Carnet(){}
    
    public Carnet(LocalDate fechaExpedicion){
        this.fechaExpedicion=fechaExpedicion;
        corredor=null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public CorredorProfesional getCorredor() {
        return corredor;
    }

    public void setCorredor(CorredorProfesional corredor) {
        this.corredor = corredor;
    }
    
    
}
