package com.colores;

import java.awt.*;

/**
 * Esta clase representa un triángulo y se puede dibujar en un objeto de tipo Graphics.
 *
 * @author 1º DAW
 * @version 1.0
 */
public class Triangulo implements Apoyable {

    /**
     * Los tres vértices que forman el triángulo.
     */
    private Point[] vertices;

    /**
     * Crea un triángulo a partir de los tres puntos que forman sus vértices.
     *
     * @param v1 el primer vértice
     * @param v2 el segundo vértice
     * @param v3 el tercer vértice
     */
    public Triangulo(Point v1, Point v2, Point v3) {
        vertices = new Point[] { v1, v2, v3 };
    }
    
    /**
     * 
     * @param a el primer vértice del lado
     * @param b el último vértice del lado
     * @return Devuelve la longitud de un lado
     */
    private double getLongitud(Point a, Point b) {
        return Math.sqrt(Math.pow((b.x - a.x), 2) + (Math.pow((b.y - a.y), 2)));
    }

    /**
     * Calcula el área del triángulo.
     *
     * @return el área del triángulo
     */
    @Override
    public double getArea() {
        double semiperimetro = this.getPerimetro() / 2;
        double ladoA = getLongitud(this.vertices[0], this.vertices[1]);
        double ladoB = getLongitud(this.vertices[1], this.vertices[2]);
        double ladoC = getLongitud(this.vertices[2], this.vertices[0]);

        return Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
    }

    /**
     * Calcula el perímetro del triángulo.
     *
     * @return el perímetro del triángulo
     */
    @Override
    public int getPerimetro() {
        return (int) (getLongitud(this.vertices[0], this.vertices[1]) + getLongitud(this.vertices[1], this.vertices[2])
                + getLongitud(this.vertices[2], this.vertices[0]));
    }

    /**
     * Dibuja el triángulo en un objeto de tipo Graphics.
     *
     * @param g el objeto de tipo Graphics donde se dibujará el triángulo
     */
    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.getColor());
        g.fillPolygon(new int[] { vertices[0].x, vertices[1].x, vertices[2].x },
                new int[] { vertices[0].y, vertices[1].y, vertices[2].y }, 3);
    }

    /**
     * Devuelve el color del triángulo.
     *
     * @return el color del triángulo
     */
    @Override
    public Color getColor() {
        return Color.blue;
    }

    /**
     * Calcula la longitud de la base del triángulo.
     *
     * @return la longitud de la base del triángulo
     */
    @Override
    public int getLongitudBase() {
        int ejeXmasPequeño = Math.min(this.vertices[0].x, Math.min(this.vertices[1].x, this.vertices[2].x));
        int ejeXmasGrande = Math.max(this.vertices[0].x, Math.max(this.vertices[1].x, this.vertices[2].x));
        return ejeXmasGrande - ejeXmasPequeño;
    }

    /**
     * Calcula la longitud de la altura del triángulo.
     * La altura se define como la distancia entre la base y el punto opuesto a la base.
     *    
     * @return la longitud de la base del triángulo
     */
    @Override
    public int getLongitudAltura() {
        int ejeYmasPequeño = Math.min(this.vertices[0].y, Math.min(this.vertices[1].y, this.vertices[2].y));
        int ejeYmasGrande = Math.max(this.vertices[0].y, Math.max(this.vertices[1].y, this.vertices[2].y));
        int base = getLongitudBase();
        double area = getArea();
        return (int) (2 * area / base);
    }
}