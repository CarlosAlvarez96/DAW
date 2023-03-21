/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author CARLOS
 */
public class Programa {
    // Vamos a modificar el nombre de Arturo a Arturo Manuel
    // Vamos a borrar el objeto con id 2
    public static void main5(String[] args) {
       EntityManager em = Persistence.createEntityManagerFactory("CORREDORES").createEntityManager();
       Corredor c = (Corredor)em.createQuery("""
                      SELECT c 
                      FROM Corredor c 
                      WHERE c.nombre= 'Arturo' """).getSingleResult();
        // Recupero el corredor con id=2
        Corredor id2 = em.find(Corredor.class, 2);
        
        em.getTransaction().begin();
        c.setNombre("Arturo Manuel");
        em.persist(c); // Actualiza el corredor Alvaro
        em.getTransaction().commit();//Borra el corredor con id2
        em.close(); 
    }
    
    
    //Programa que muestra en pantalla el nombre de todos los corredores
    public static void main4(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        //Vamos a hacer una consulta en lenguaje jpql
        // que nos recupera todos los objetos de la clase corredor
        Query q = em.createQuery("SELECT c FROM Corredor c");
        List<Corredor> resultado = q.getResultList();
        for(Corredor c : resultado){
            System.out.println(c.getNombre());
        }
        em.close();
    }
    
    
    
    
    
    
    
    //Haz un programa con este menu de opciones:
    // 1.- Nuevo corredor
    // 2.- Salir
    
    // Si pulsamos 1) nos preguntará nombre y fecha de nacimiento y creará
    // el corredor en la BD
    // Al pulsar 2(, se cerrará la unidad de persistencia
    //IMPORTANTE: La unidad de persistencia se crea al principio antes de
    // que aparezca el menú
    
    public static void main3(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        boolean repetir = true;
        while(repetir){
        System.out.println("""
                           1.- Nuevo corredor
                           2.- Salir
                           """);
        int m = new Scanner(System.in).nextInt();
        if(m==1){
            System.out.println("Introduzca un nombre");
            String nombre =new Scanner(System.in).nextLine();
            System.out.println("Introduzca el año de nacimiento");
            int año = new Scanner(System.in).nextInt();
            System.out.println("Introduzca el mes de nacimiento");
            int mes = new Scanner(System.in).nextInt();
            System.out.println("Introduzca el diade nacimiento");
            int dia = new Scanner(System.in).nextInt();
            LocalDate ld = LocalDate.of(año, mes, dia);
            Corredor c=new Corredor(nombre,ld);
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        }else if(m==2){
            repetir=false;
        }
      }
        em.close();
    }
    
    
    
    
    //Vamos a recuperar el corredor que hicimos antes
    public static void main2(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        Corredor c = em.find(Corredor.class,1);
        System.out.println(c.getNombre());
        System.out.println(c.getFechaNacimiento());
    }
    
    
    
    //Ejemplo que crea un corredor y lo guarda en la BD
    public static void main1(String[] args) {
        // nos conectamos a la unidad de persistencia CARRERA
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        //Creamos el corredor
        Corredor c = new Corredor("Alvaro", LocalDate.now().minusYears(20));
        
        //Guardamos el corredor en la unidad de persistencia
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        // nos desconectamos
        em.close();
    }
}
