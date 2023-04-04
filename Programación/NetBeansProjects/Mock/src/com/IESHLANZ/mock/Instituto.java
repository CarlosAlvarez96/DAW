
package com.IESHLANZ.mock;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<Alumno> alumnos;

    public Instituto(String nombre){
        this.nombre=nombre;
        this.alumnos=new ArrayList<>();
    }
    public void añadir(Alumno a){
        throw new UnsupportedOperationException("Método sin programar");
    }
    public List<Alumno> getAlumnos(){
        throw new UnsupportedOperationException("Método sin programar");
    }
}
