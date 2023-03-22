
package Clases;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//Cuando quiera que una clase se guarde en la base de datos:
//1. Pongo @Entity
//2. La clase debe implementar la interfazz Serializable
//3. Le ponemos un constructor vacío
//4. le ponemos los getters y serrers a todas las propiedades que se vayan a guardar en la base de datos
//5 Le ponemos @Id a la propiedad que queremos que sea la clave primaria. Si queremos que sea 
// autoincrementado le ponemos @GeneratedValue
@Entity 
@Inheritance(strategy = InheritanceType.JOINED)
public class Corredor implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    public Corredor(){
        
    }
    
    //Este constructor crea un corredor con el nombre y fecha de nacimientro pasada como parámetro
    public Corredor(String n, LocalDate fn){
        
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

    public void setNombre(String nombreM) {
        this.nombre = nombreM;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
