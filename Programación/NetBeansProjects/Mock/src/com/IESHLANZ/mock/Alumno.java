
package com.IESHLANZ.mock;


public class Alumno {
    private String nombre;
    private int nota;
    
    public Alumno(String nombre, int nota){
        this.nombre=nombre;
        this.nota=nota;
    }
    public String getNombre(){
        return nombre;
    }
    public int getNota(){
        return nota;
    }
}
