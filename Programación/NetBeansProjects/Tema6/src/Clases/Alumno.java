
package Clases;

public record Alumno(String nombre, String apellidos,String curso, int edad) {
    @Override
        public String toString(){
            return apellidos+", "+nombre;
        }
}
