
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;


public class Transformaciones {
    public static void main(String[] args) {
        //Transformar un número en su cuadrado
        Function<Integer,Integer> t1 =  n -> n*n;
        
        // Haz una transformacion que transforme una persona en true si es mayor de edad
        Predicate<Persona> t2 = p ->  p.getEdad()>=18;
        
        // Transformacion que coge dos números y los transforma en su suma
            BiFunction<Integer,Integer,Integer> t3 = (a,b) -> (a+b);
            
        // Transformación que recibe una persona y un número y los transforma en true si la persona tiene mas años que ese número
            BiPredicate<Persona,Integer> t4 = (a,b) -> a.getEdad()>b;
            
        // Transformacion que recibe una fecha y una hora y las muestra en la pantalla
            BiConsumer<LocalDate,LocalTime> t5 = (f,h) -> System.out.println(f+" "+h);
        
        
        
        
        
        
        
        
        
        
        
        }
}
