
import java.io.IOException;
import java.util.Optional;


public class Persona {
    private String nombre;
    private int edad;
    private Persona hijo;
    
    
    public Persona(String n, int e){
       this(n,e,null);
    }

    public Optional<Persona> getHijo() {
        // Si hijo es null devuelve la caja vacía, sino, devuelve el hijo
//        Optional<Persona> o = Optional.empty();
//        if(hijo!=null){
//            o = Optional.of(hijo);
//        }
//        return o;
//    return hijo==null? 
//            Optional.empty(): 
//            Optional.of(hijo);
           return Optional.ofNullable(hijo);
    }

    public void setHijo(Persona hijo) {
        this.hijo = hijo;
    }
    public Persona(String n, int e,  Persona h){
         this.nombre=n;
        this.edad=e;
        this.hijo=h;
    }

    public void Trabajar() throws IOException {
        if(this.edad<18){
            throw new IOException ("Un menor no puede trabajar");
        }else{
            System.out.println("La persona "+this.nombre+" está trabajando");
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
