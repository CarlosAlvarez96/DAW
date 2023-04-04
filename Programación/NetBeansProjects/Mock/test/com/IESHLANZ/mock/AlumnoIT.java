
package com.IESHLANZ.mock;

import org.junit.Assert;
import org.junit.Test;


public class AlumnoIT {
    
    public AlumnoIT() {
    }

    @Test
    public void testSomeMethod() {
        Alumno a = new Alumno("Carlos",5);
        Assert.assertThat(a.getNombre(), equals("Carlos"));
    }
    
}
