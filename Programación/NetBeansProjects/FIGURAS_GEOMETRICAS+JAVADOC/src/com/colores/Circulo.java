package com.colores;

import java.awt.*;

/**
 * Clase que representa un círculo.
 *
 * @author 1º DAW
 * @version 1.0
 * @see FiguraGeometrica
 * @see Centrable
 */
public class Circulo implements FiguraGeometrica, Centrable {
    private Point centro;
    private int radio;
    private Color color;

    /**
     * Constructor que crea un objeto Circulo con un centro, un radio y un color.
     *
     * @param centro El punto que representa el centro del círculo.
     * @param radio El radio del círculo.
     * @param color El color del círculo.
     */
    public Circulo(Point centro, int radio, Color color) {
        this.centro = centro;
        this.radio = radio;
        this.color = color;
    }

    /**
     * Devuelve el color del círculo.
     *
     * @return El color del círculo.
     */
    @Override
    public Color getColor() {
        return this.color;
    }

    /**
     * Devuelve el área del círculo.
     *
     * @return El área del círculo.
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Devuelve el perímetro del círculo.
     *
     * @return El perímetro del círculo.
     */
    @Override
    public int getPerimetro() {
        return (int) (Math.PI * 2 * radio);
    }

    /**
     * Dibuja el círculo en un objeto Graphics.
     *
     * @param g El objeto Graphics donde se dibujará el círculo.
     */
    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.centro.x - radio, this.centro.y - radio, radio * 2, radio * 2);
    }

    /**
     * Devuelve el punto que representa el centro del círculo.
     *
     * @return El punto que representa el centro del círculo.
     */
    @Override
    public Point getCentro() {
        return this.centro;
    }
}
