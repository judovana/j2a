package j2a;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author jvanek
 */
public interface BitmapImage {


    public int getWidth();

    public int getHeight();

    public GraphicsCanvas createGraphics();

    public Object getOrigianl();

}
