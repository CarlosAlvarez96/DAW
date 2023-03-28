
import java.io.IOException;
import java.util.List;


public class Programa2 {
    private static void Trabajar(Persona p){
            try{
                p.Trabajar();
            }catch(IOException error){
                System.out.println(error.getMessage());
            }
        }
    public static void main(String[] args) {
        
        //Forma con programación estructurada
//        Persona p = new Persona("Antonio",30);
//        System.out.println(p.getHijo().getNombre());

       // Forma con programacion estructurada y funcional
       // Para no usar null en programacion funcional, tenemos un tipo de dato llamado Optional<T> 
//       Persona p = new Persona("Antonio",30);
//       Optional<Persona> optHijo = p.getHijo();
//       if(optHijo.isEmpty()){
//           System.out.println("No tiene hijos");
//       }else{
//           Persona hijo = optHijo.get();
//           System.out.println(hijo.getNombre());
//       }
       
       // Forma con programacion funcional
//       Persona p = new Persona("Antonio",30, new Persona("Ana",10));
//       p.getHijo().ifPresentOrElse(
//       hijo -> System.out.println(hijo.getNombre()),
//               () -> System.out.println("No tiene hijos")
//       );




    }
}
