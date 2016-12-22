package j2a.android;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import j2a.GraphicsCanvas;
import java.io.IOException;
import java.io.InputStream;


/**
 *
 * @author jvanek
 */
public class BitmapImage implements j2a.BitmapImage {


    public static j2a.BitmapImage newBitmapImage(int width, int height) {
        return new BitmapImage(width, height);
    }


    public static j2a.BitmapImage read(InputStream resourceAsStream) throws IOException {
        Bitmap bf = BitmapFactory.decodeStream(resourceAsStream);
        Bitmap mutableBitmap = bf.copy(Bitmap.Config.ARGB_8888, true);
        return new BitmapImage(mutableBitmap);
    }

    private final Bitmap back;

    private BitmapImage(int width, int height) {
        back = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
    }
    private BitmapImage(Bitmap bf) {
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
        return new j2a.android.GraphicsCanvas(new Canvas(back));
    }

    @Override
    public Object getOrigianl() {
        return back;
    }

}
