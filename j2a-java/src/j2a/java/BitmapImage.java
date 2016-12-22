package j2a.java;

import j2a.GraphicsCanvas;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author jvanek
 */
public class BitmapImage implements j2a.BitmapImage {

  
    public static j2a.BitmapImage newBitmapImage(int width, int height) {
        return new BitmapImage(width, height);
    }

  
    public static j2a.BitmapImage read(InputStream resourceAsStream) throws IOException {
        BufferedImage bf = ImageIO.read(resourceAsStream);
        return new BitmapImage(bf);
    }

    private final BufferedImage back;

    private BitmapImage(int width, int height) {
        back = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    }
    private BitmapImage(BufferedImage bf) {
        back = bf;
    }

    @Override
    public int getWidth() {
        return back.getWidth();
    }

    @Override
    public int getHeight() {
        return back.getHeight();
    }

    @Override
    public GraphicsCanvas createGraphics() {
        return new j2a.java.GraphicsCanvas(back.createGraphics());
    }

    @Override
    public Object getOrigianl() {
        return back;
    }

}
