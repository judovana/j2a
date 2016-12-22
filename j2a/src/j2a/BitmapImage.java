package j2a;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author jvanek
 */
public interface BitmapImage {

    public static BitmapImage newBitmapImage(int width, int height) {
        throw new UnsupportedOperationException("Please use java or android implementation");
    }

    public static BitmapImage read(InputStream resourceAsStream) throws IOException{
        throw new UnsupportedOperationException("Please use java or android implementation");
    }

    public int getWidth();

    public int getHeight();

    public GraphicsCanvas createGraphics();

    public Object getOrigianl();

}
