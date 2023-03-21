
package Clases;


public class LoginNovato implements Login{

    private String clave;
    
    //Clave correcta: cnjebcuowhd829r3ufb248hfb8
    public LoginNovato(){
        this.clave="holaquetal";
    }
    //Devuelve el nº de caracteres del intento que coinciden con la clave correcta
    public int getNumeroAciertos(String intentoContraseña){
        int aciertos=0;
        int minimo= Math.min(
                                            intentoContraseña.length()
                                          , clave.length());
        for(int i=0;i<minimo;i++){
            char letraClave = clave.charAt(i);
            char letraIntento = intentoContraseña.charAt(i);
            if(letraClave==letraIntento){
                aciertos++;
            }
        }
        return aciertos;
    }
    //Devuelve la longitud de la clave correcta
    public int getLongitudClaveCorrecta(){
        return this.clave.length();
    }
    @Override
    public boolean comprobarContraseña(String usuario, String contraseña) {
        return this.getLongitudClaveCorrecta() == this.getNumeroAciertos(contraseña);
                }
    
}
