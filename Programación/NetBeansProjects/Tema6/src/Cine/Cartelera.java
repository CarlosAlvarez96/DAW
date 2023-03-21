
package Cine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

public class Cartelera {
    public static List<Sala> cargarCartelera(String ruta) throws IOException{
        List<Sala> cartelera = new ArrayList<>();
        File archivo = new File(ruta);
        FileReader lector = new FileReader(archivo);
        BufferedReader br = new BufferedReader(lector);
        
        for(int i = 0; i < br.lines().count();i++){
            String linea = br.readLine();
            String [] arrayLinea = linea.split(":");
            String nombre = arrayLinea[1];
            Sala nuevaSala = new Sala(i+1, 50, new Pelicula(nombre));
            cartelera.add(nuevaSala);
        }
        return cartelera;
    }
    
}
