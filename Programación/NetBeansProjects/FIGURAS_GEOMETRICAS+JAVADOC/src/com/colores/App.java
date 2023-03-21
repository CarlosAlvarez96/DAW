package com.colores;

import bpc.daw.consola.*;
import java.util.List;
import java.util.*;
import java.awt.*;

/**
 * Clase principal que representa una aplicación para dibujar figuras geométricas
 * en una consola DAW o en un archivo PDF.
 * 
 * @author 1º DAW
 * @version 1.0
 */
public class App {

    /**
     * Método principal que se encarga de ejecutar la aplicación y de solicitar
     * las figuras geométricas que se desean dibujar.
     * 
     * @param args argumentos de entrada de la aplicación
     */
    public static void main(String... args) {
        List<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

        boolean repetir = true;

        while (repetir) {

            System.out.println("""
                    1) Añadir un rectángulo
                    2) Añadir un cuadrado
                    3) Añadir un círculo
                    4) Añadir un triángulo
                    5) Dibujar todo
                    """);

            int opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Elige las coordenadas X e Y donde estará situada la esquina superior izquierda:");
                    int esiX = new Scanner(System.in).nextInt();
                    int esiY = new Scanner(System.in).nextInt();
                    System.out.println("Elige las coordenadas X e Y donde estará situada la esquina inferior derecha");
                    int eidX = new Scanner(System.in).nextInt();
                    int eidY = new Scanner(System.in).nextInt();
                    Rectangulo rect = new Rectangulo(new Point(esiX, esiY), new Point(eidX, eidY), Color.green);
                    figuras.add(rect);
                }
                case 2 -> {
                    System.out.println("Elige las coordenadas X e Y donde estará situada la esquina superior izquierda:");
                    int esiX = new Scanner(System.in).nextInt();
                    int esiY = new Scanner(System.in).nextInt();
                    System.out.println("Elige la longitud del lado: ");
                    int lado = new Scanner(System.in).nextInt();
                    Cuadrado cuadr = new Cuadrado(new Point(esiX, esiY), lado, Color.RED);
                    figuras.add(cuadr);
                }

                case 3 -> {
                    System.out.println("Elige las coordenas X e Y donde estará situado el centro del círculo");
                    int centX = new Scanner(System.in).nextInt();
                    int centY = new Scanner(System.in).nextInt();
                    System.out.println("Elige el radio del círculo");
                    int radio = new Scanner(System.in).nextInt();
                    Circulo cir = new Circulo(new Point(centX, centY), radio, Color.red);
                    figuras.add(cir);
                }
                case 4 -> {
                    System.out.println("Elige las coordenadas X e Y de los tres vértices del triángulo: ");
                    int v1X = new Scanner(System.in).nextInt();
                    int v1Y = new Scanner(System.in).nextInt();
                    int v2X = new Scanner(System.in).nextInt();
                    int v2Y = new Scanner(System.in).nextInt();
                    int v3X = new Scanner(System.in).nextInt();
                    int v3Y = new Scanner(System.in).nextInt();
                    Triangulo tr = new Triangulo(new Point(v1X, v1Y), new Point(v2X, v2Y), new Point(v3X, v3Y));
                    figuras.add(tr);
                }

                 /**
                 * Dibuja todas las figuras agregadas por el usuario en la consola DAW o en un
                 * archivo PDF.
                 */
                case 5 -> {
                    System.out.println("Deseas dibujarlo en la Consola DAW o en un PDF?");

                    String opcion2 = new Scanner(System.in).nextLine();

                    switch (opcion2) {
                        /**
                         * Dibuja las figuras en la consola DAW.
                         */
                        case "Consola DAW" -> {
                            Consola c = new Consola();
                            Teclado t = c.getTeclado();
                            CapaCanvas canvas = c.getCapaCanvas();
                            Graphics2D g = canvas.getGraphics2D();

                            for (FiguraGeometrica i : figuras) {
                                i.dibujar(g);
                            }

                            t.leerCaracter();
                            repetir = false;
                        }
                        
                        }
                    }
                }
            }
        }
    }
