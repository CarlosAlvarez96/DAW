package com.colores;

/**
 * Interfaz que representa una figura apoyable.
 *
 * @author 1º DAW
 * @version 1.0
 * @see FiguraGeometrica
 */
public interface Apoyable extends FiguraGeometrica {

    /**
     * Devuelve la longitud de la base de la figura.
     *
     * @return La longitud de la base de la figura.
     */
    public int getLongitudBase();

    /**
     * Devuelve la longitud de la altura de la figura.
     *
     * @return La longitud de la altura de la figura.
     */
    public int getLongitudAltura();

    /**
     * Indica si la figura es horizontal (si la longitud de la base es mayor que la longitud de la altura).
     *
     * @return true si la figura es horizontal, false en caso contrario.
     */
    public default boolean esHorizontal() {
        return this.getLongitudBase() > this.getLongitudAltura();
    }

    /**
     * Indica si la figura es vertical (si la longitud de la altura es mayor que la longitud de la base).
     *
     * @return true si la figura es vertical, false en caso contrario.
     */
    public default boolean esVertical() {
        return this.getLongitudAltura() > this.getLongitudBase();
    }
}
