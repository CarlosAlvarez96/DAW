
import java.util.ArrayList;
import java.util.List;


public class ProgramaSerie {
    // Haz una transformacion que reciba un List<List<String>> y lo transforma en un List<String> que tiene los String que salen de reunir todas las listas
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        List<String> lista3 = new ArrayList<>();
        List<String> lista4 = new ArrayList<>();
        lista1.add("Alba");
        lista1.add("Álvaro");
        lista1.add("Alberto");
        lista2.add("Belen");
        lista2.add("Blanca");
        lista2.add("Blueno");
        lista3.add("Carlos");
        lista3.add("Cristina");
        lista3.add("Carolina");
        lista4.add("Daniel");
        lista4.add("David");
        lista4.add("Damián");
        List<List<String>> listaDeListas = new ArrayList<>();
        listaDeListas.add(lista1);
        listaDeListas.add(lista2);
        listaDeListas.add(lista3);
        listaDeListas.add(lista4);
        List<String> listaFinal = new ArrayList<>();
        listaDeListas.forEach(l -> l.forEach(s -> listaFinal.add( s)));
        System.out.println(listaFinal);
    }
}
