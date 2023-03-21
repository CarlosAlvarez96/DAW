package Cine;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public record Pelicula(String titulo, String rutaFoto) {
    
    public Pelicula(String titulo) {
        this(titulo, titulo + ".png");
    }

    public Image getFoto() {
        Image img=null;
        try {
            File f = new File(rutaFoto);
            BufferedImage bImg = ImageIO.read(f);
            img =bImg;
        } catch (IOException e) {
            System.out.println(e);
        }
        return img;
    }
}
