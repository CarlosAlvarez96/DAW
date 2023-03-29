
public class Serie {
    private String titulo;
    private int añoInicio;
    private int añoFinalizacion;
    
    public Serie(String t, int ai, int af){
        this.titulo=t;
        this.añoInicio=ai;
        this.añoFinalizacion=af;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoInicio() {
        return añoInicio;
    }

    public void setAñoInicio(int añoInicio) {
        this.añoInicio = añoInicio;
    }

    public int getAñoFinalizacion() {
        return añoFinalizacion;
    }

    public void setAñoFinalizacion(int añoFinalizacion) {
        this.añoFinalizacion = añoFinalizacion;
    }
    
    //El método parse recibe un String y nos devuelve un optional con la correspondiente Serie,
    // pero si el formato es incorrecto devuelve el Optional empty
    //El string tiene como formato: titulo(añoInicio - añoFIn)
    //public static Serie parse(String s){
        
    //}
    
    
}
