
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Ejemplo1 {


    public static void main(String args[]) {

        //Hago una variable que va a guardar la transformación 
        // que a cada entero lo transforma en su cuadrado
        
        Function<Integer,Integer> t1 = n -> n*n; // expresion lambda
        
        int resultado = t1.apply(10);
        System.out.println(resultado);
        
        
        // Transformación que convierte un String en su primera letra
        Function<String, Character> t2 = s -> s.charAt(0);
        
        // Mostramos por pantalla en qué se transforma "Viernes"
        System.out.println(t2.apply("Viernes"));
        
        // Transformación que coge un String y lo convierte en su última letra
        Function<String,Character> t3 = (String s) -> s.charAt(s.length()-1);
        
        // Aplicamos la transformación para convertir "Viernes"
        // en su último carácter
        System.out.println(t3.apply("Viernes"));
        
        
        //Una transformacion que transforma una fecha 
        //en el número 524
        Function<LocalDate,Integer> t4 = f -> 524;
        
        //Transformacion que convierte un String en su número de caracteres
        Function<String,Integer> t5 = l -> l.length()-1;
        System.out.println(t5.apply("Viernes"));
        
        //Transformación que convierte un número entero en true,
        //si es para y el false si es impar
        
        Function<Integer,Boolean> t6 = b -> b%2==0?true:false;
        // Transformacion que convierte una lista de enteroos 
        // en el primer entero de la lista
        Function<List<Integer>,Integer> t7 = a -> a.get(0);

        //Transformación que recibe una lista de String
        //y nos devuelve true si la lista NO está vacía
        Predicate<List<String>> t8 = lista -> !lista.isEmpty();
        
        //Vamos a crear una lista con las palabras "Hola" y "Adios"
        //y vamos a transformar esa lista en true/false
        List<String> palabras = List.of("Hola","Adios");
        System.out.println(t8.test(palabras));
        
        // Haz una transformacion que reciba un string y nos devuelva true
        // si comienza por mayúscula
        Predicate<String> t9 = s -> Character.isUpperCase( s.charAt(0));
        
        // Haz una transformación que reciba una fecha y nos devuelva true 
        // si esa fecha ya ha pasado
        Predicate<LocalDate> t10 = fecha -> fecha.isBefore(LocalDate.now());
        
         // Haz una transformación que devuelva un numero entero y 
         // y nos develva true si es un numero primo
         Predicate<Integer> t12 = n -> {
             boolean primo = true;
             for(int i=0; i< n && primo;i++){
                 if(n % i ==0){
                     primo=false;
                 }
             }
             
             
             return primo;
         };
         
         // Transformación que recibe una palabra y la muestra 
         // en la pantalla convertida en mayúsculas
         
         Consumer<String>t13 = s -> System.out.println(s.toUpperCase());
         
         // Usamos la transformacion para mostrar en pantalla 
         // la palabra hola escrita en mayúscula
         t13.accept("hola");
         
         // Transformación que recibe una palabra y la guarda en un 
         // archivo llamado palabra.txt
         Consumer<String> t14 = x -> {
             try(PrintWriter p = new PrintWriter("palabra.txt")){
                 p.println(x);
                 
             }catch(IOException e){
                 System.out.println(e.getMessage());
             }
         };
         
         //Transformación que genera un número aleatorio entre 0 y 1
         Supplier<Double> t15 = () -> Math.random();
         
         //Activa la transformación anterior para generar 2 número aleatorios
         System.out.println(t15.get());
         System.out.println(t15.get());
         
         //Haz una transformación que escriba en la pantalla el mensaje
         // "hoy es jueves"
         Runnable t16 = () ->  System.out.println("Hoy es jueves");
         
         //activamos la transformacion
         t16.run();
    }
}
