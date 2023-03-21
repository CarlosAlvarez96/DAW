package com.colores;

import java.awt.*;

/**
 * Clase que representa un cuadrado.
 * Un cuadrado es un tipo de rectángulo en el que los cuatro lados son iguales.
 * La longitud de los lados se especifica al crear el objeto.
 *
 * @author 1º DAW
 * @version 1.0
 */
public class Cuadrado extends Rectangulo {
    private int longitudLado;

    /**
     * Crea un objeto Cuadrado con la esquina superior izquierda especificada, la longitud de lado dada y el color dado.
     *
     * @param esquinaSuperiorIzquierda La coordenada de la esquina superior izquierda del cuadrado.
     * @param longitudLado             La longitud de cada lado del cuadrado.
     * @param color                    El color del cuadrado.
     * @version 1.0
     */
    public Cuadrado(Point esquinaSuperiorIzquierda, int longitudLado, Color color) {
        super(esquinaSuperiorIzquierda, new Point((int) (esquinaSuperiorIzquierda.getX() + longitudLado),
                (int) (esquinaSuperiorIzquierda.getY() + longitudLado)), color);
        this.longitudLado = longitudLado;
    }
}
