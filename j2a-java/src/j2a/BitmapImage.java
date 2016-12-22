package j2a;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author jvanek
 */
public interface BitmapImage {

    public static BitmapImage newBitmapImage(int width, int height) {
        return j2a.java.BitmapImage.newBitmapImage(width, height);
    }

    public static BitmapImage read(InputStream resourceAsStream) throws IOException{
        return j2a.java.BitmapImage.read(resourceAsStream);
    }

    public int getWidth();

    public int getHeight();

    public GraphicsCanvas createGraphics();

    public Object getOrigianl();

}
