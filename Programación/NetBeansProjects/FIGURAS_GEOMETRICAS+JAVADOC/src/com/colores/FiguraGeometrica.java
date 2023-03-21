package com.colores;

import java.awt.*;

/**
 * Interfaz que define una figura geométrica.
 * Toda figura geométrica debe tener un área, un perímetro y la capacidad de dibujarse en un objeto Graphics.
 * Además, puede ser coloreada con un color específico.
 * También tiene la capacidad de crear un cuadrado con igual área que la figura geométrica.
 *
 * @see Coloreable
 * @author 1º DAW
 * @version 1.0
 */
public interface FiguraGeometrica extends Coloreable {
    /**
     * Devuelve el área de la figura geométrica.
     *
     * @return El área de la figura geométrica.
     * @version 1.0
     */
    public double getArea();

    /**
     * Devuelve el perímetro de la figura geométrica.
     *
     * @return El perímetro de la figura geométrica.
     * @version 1.0
     */
    public int getPerimetro();

    /**
     * Dibuja la figura geométrica en un objeto Graphics especificado.
     *
     * @param g El objeto Graphics en el que se dibujará la figura geométrica.
     * @version 1.0
     */
    public void dibujar(Graphics g);

    /**
     * Crea un cuadrado con la misma área que la figura geométrica.
     *
     * @param esquinaSuperiorIzquierda La coordenada de la esquina superior izquierda del cuadrado.
     * @return El objeto Cuadrado con la misma área que la figura geométrica.
     * @version 1.0
     */
    public default Cuadrado crearCuadradoIgualArea(Point esquinaSuperiorIzquierda) {
        return new Cuadrado(esquinaSuperiorIzquierda, (int) (Math.sqrt(this.getArea())), this.getColor());
    }
}