
package com.IESHLANZ.mock;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;


public class InstitutoIT {
    
    public InstitutoIT() {
    }

    //Añado un alumno y compruebo que se ha añadido correctamente
    @Test
    public void testSomeMethod() {
        //Creo un mock de a clase alumno
        Alumno a = Mockito.mock(Alumno.class);
        Mockito.when(a.getNombre()).thenReturn("Miguel");
        Mockito.when(a.getNota()).thenReturn(5);
        Instituto i = new Instituto("Hlanz");
        i.añadir(a);
        Alumno MiguelTeórico = i.getAlumnos().get(0);
        assertEquals("Miguel", a.getNombre());
    }
    
    @Test
    public void testSomeMethod1(){
    
    }
}
