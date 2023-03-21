package com.colores;

import java.awt.*;

/**
 * Representa un rectángulo con esquina superior izquierda y esquina inferior derecha.
 * Implementa las interfaces Centrable y Apoyable y extiende de la clase abstracta FiguraGeometrica.
 *
 * @author 1º DAW
 * @version 1.0
 * @see FiguraGeometrica
 * @see Centrable
 * @see Apoyable
 */
public class Rectangulo implements Centrable, Apoyable {
    protected Point esquinaSuperiorIzquierda;
    protected Point esquinaInferiorDerecha;
    private Color color;

    /**
     * Crea un rectángulo a partir de la esquina superior izquierda, esquina inferior derecha y el color dado.
     *
     * @param esi la esquina superior izquierda del rectángulo
     * @param eid la esquina inferior derecha del rectángulo
     * @param c el color del rectángulo
     */
    public Rectangulo(Point esi, Point eid, Color c) {
        this.esquinaSuperiorIzquierda = esi;
        this.esquinaInferiorDerecha = eid;
        this.color = c;
    }

    /**
     * Devuelve el punto central del rectángulo.
     *
     * @return el punto central del rectángulo
     */
    @Override
    public Point getCentro() {
        return new Point((int) ((esquinaSuperiorIzquierda.getX() - esquinaInferiorDerecha.getX()) / 2),
                (int) ((esquinaSuperiorIzquierda.getY() - esquinaInferiorDerecha.getY()) / 2));
    }

    /**
     * Devuelve el área del rectángulo.
     *
     * @return el área del rectángulo
     */
    @Override
    public double getArea() {
        return getLongitudBase() * getLongitudAltura();
    }

    /**
     * Devuelve el perímetro del rectángulo.
     *
     * @return el perímetro del rectángulo
     */
    @Override
    public int getPerimetro() {
        return (getLongitudAltura() * 2) + (getLongitudBase() * 2);
    }

    /**
     * Dibuja el rectángulo en el contexto gráfico dado.
     *
     * @param g el contexto gráfico en el que se dibuja el rectángulo
     */
    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.esquinaSuperiorIzquierda.x, this.esquinaSuperiorIzquierda.y, getLongitudBase(),
                getLongitudAltura());
    }

    /**
     * Devuelve el color del rectángulo.
     *
     * @return el color del rectángulo
     */
    @Override
    public Color getColor() {
        return this.color;
    }

    /**
     * Devuelve la longitud de la base del rectángulo.
     *
     * @return la longitud de la base del rectángulo
     */
    @Override
    public int getLongitudBase() {
        return (int) this.esquinaInferiorDerecha.getX() - (int) (this.esquinaSuperiorIzquierda.getX());
    }

    /**
     * Devuelve la longitud de la altura del rectángulo.
     * @return la longitud de la altura del rectángulo
     */
    @Override
    public int getLongitudAltura() {
    return (int) (this.esquinaInferiorDerecha.getY() - this.esquinaSuperiorIzquierda.getY());
    }
}