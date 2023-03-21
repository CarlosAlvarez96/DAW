
package Clases;

import java.util.Random;

public class ProgramaHacker {
    public static void main(String[] args) {
        LoginNovato login = new LoginNovato();
        String clave = generarClaveAleatoria(login.getLongitudClaveCorrecta());
        int aciertos = login.getNumeroAciertos(clave);
        while(aciertos!=login.getLongitudClaveCorrecta()){
            String mutacion = introducirMutacion(clave);
            if(login.getNumeroAciertos(mutacion)>aciertos){
                clave = mutacion;
                aciertos = login.getNumeroAciertos(mutacion);
                System.out.println("Encontrada mejora: "+clave);
            }
        }
        
    }
    
    private static String introducirMutacion(String clave){
        Random r = new Random();
        int posicion = r.nextInt(0, clave.length());
        int ascii = r.nextInt('0','z');
        String claveMutada = clave.substring(0,posicion)
                +((char)ascii)
                +clave.substring(posicion+1);
        return claveMutada;
    }
    private static String generarClaveAleatoria(int longitud){
        String clave = " ";
        Random r = new Random();
        for(int i = 0; i<longitud;i++){
            int ascii = r.nextInt('0','z');
            clave += (char)ascii;
            
        }
        return clave;
    }
}
