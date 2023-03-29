
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejemlos {

    public static void main(String[] args) {
        List<String> palabras = List.of("lunes", "hola", "martes", "miercoles", "jueves");
        //Programa que cuenta las palabras que llevan la letra a
        long resultado = palabras.stream()
                .filter(p -> p.contains("a"))
                .count();
        System.out.println(resultado);

        // Programa que muestre en mayúsculas las palabras de más de 3 letras que contienen la letra "a"
        palabras.stream()
                .filter(p -> p.contains("a"))
                .filter(p -> p.length() > 3)
                .map(p -> p.toUpperCase())
                .forEach(p -> System.out.println(p));

        // Programa que nos dice si el 12531 es un número primo
        int n = 12531;
        IntStream.range(2, 12530) //Cadena de montaje
                .filter(p -> 12531 % p == 0)// filtro que solo deja pasar divisores
                .findAny()//Me devuelve una caja con cualquier divisor
                .ifPresentOrElse(
                        i -> System.out.println("no es primo"),
                        () -> System.out.println("Es primo")
                );

        // Programa que ordena esta lista de números de menor a mayor
        IntStream.of(5, 2, 9, 4, 6)
                .sorted()
                .forEach(x -> System.out.println(x)
                );

        //Creamos 4 empleados
        Empleado a = new Empleado("Antonio", "Programador", 1000);
        Empleado b = new Empleado("Manuel", "Analista", 2000);
        Empleado c = new Empleado("Lucas", "Jefe proyecto", 5000);

        //Usa programacion funcional para conseguir una lista de empleados ordenados de menor a mayor sueldo
        List<Empleado> listaEmpleados = Stream.of(a,b,c)
                .sorted()
                .toList();
        System.out.println();
        // sube el sueldo 100 euros a los empleados que ganan menos de 1500 euros
        Stream.of(a,b,c)
                .sorted()
                .filter(e -> e.getSueldo()<1500)
                .forEach(e -> e.setSueldo(e.getSueldo()+100));
        
        // 1) Guarda en una lista todos los empleados que sean programadores
        String puestoProgramador = "Programador";
        List<Empleado> listaProgramadores = Stream.of(a,b,c)
                .filter(e -> e.getPuesto().equalsIgnoreCase("Programadores"))
                .toList();
        // 2) Haz un programa que pida por teclado el nombre
        // de un empleado y nos muestra sus datos
        String nombre = new Scanner(System.in).nextLine();
        Stream.of(a,b,c)
                .filter(e -> e.getNombre().equalsIgnoreCase(nombre))
                .findAny()
                .ifPresentOrElse(e -> System.out.println(nombre), System.out.println("No hay un "+nombre));
                
                
                
        
        /* if(numeroDivisores==0){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }*/
    }
}
