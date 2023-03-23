
package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Fetch;

@Entity
public class Equipo implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    
    private String nombre;
    //Eager significa que la lista de ocrredores se recupera cuando se crea un objeto equipo
    //Lazy significa que la lista de corredores se recupera la primera vez que sea necesaria
    @OneToMany(fetch = FetchType.EAGER)
    private List<Corredor> corredores;
    
    public Equipo(){}
    
    public Equipo(String n){
        nombre=n;
        this.corredores= new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Corredor> corredores) {
        this.corredores = corredores;
    }
    
    
}
