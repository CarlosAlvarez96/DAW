
import java.util.ArrayList;
import java.util.List;

public class EjerciciosProgramacionFuncional {

    public static void main(String[] args) {
        List<String> frases = new ArrayList<>();
        frases.add("hola");
        frases.add("adios");
        frases.add("viernes");
        frases.add("vacaciones");

        //Muestra por pantalla en renglones diferentes cada palabra de la lista
        for (String i : frases) {
            System.out.println(i);
        }

        frases.forEach(f -> System.out.println(f));

        //Programa que borra las palabras que contienen la letra a
        /*for (int i = 0; i < frases.size()-1; i--) {
            String p = frases.get(i);
            if (p.contains("a")) {
                frases.remove(p);
            }

        }*/
        
        frases.removeIf(s -> s.contains("a"));
        
        // Crea un List<Persona> con tres personas de estas edades: 10, 50, 18. Borra las personas mayores de edad
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Pepito", 10));
        listaPersonas.add(new Persona("Pablito", 50));
        listaPersonas.add(new Persona("Pedrito", 18));
        
        listaPersonas.removeIf(p -> p.getEdad()>=18);
        
        // Actualizar cada palabra de la lista de frases pasadas a  mayúsculas 
        frases.replaceAll(f -> f.toUpperCase());
        
        
    }
}
