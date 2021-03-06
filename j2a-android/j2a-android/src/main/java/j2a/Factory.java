package j2a;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author jvanek
 */
public class Factory {

    public static class Color {

        public static j2a.Color getBLUE() {
            return j2a.android.Color.getBLUE();
        }

        public static j2a.Color getYELLOW() {
            return j2a.android.Color.getYELLOW();
        }

        public static j2a.Color getBLACK() {
            return j2a.android.Color.getBLACK();
        }

        public static j2a.Color getRED() {
            return j2a.android.Color.getRED();
        }

        public static j2a.Color getCYAN() {
            return j2a.android.Color.getCYAN();
        }

        public static j2a.Color newColor(int r, int g, int b, int a) {
            return j2a.android.Color.newColor(r, g, b, a);
        }

        public static j2a.Color newColor(int r, int g, int b) {
            return j2a.android.Color.newColor(r, g, b);
        }

        public static j2a.Color getWHITE() {
            return j2a.android.Color.getWHITE();
        }
    }

    public static class Point {

        public static j2a.Point newPoint(int x, int y) {
            return j2a.android.Point.newPoint(x, y);
        }

    }


    public static class BitmapImage {

        public static j2a.BitmapImage newBitmapImage(int width, int height) {
            return j2a.android.BitmapImage.newBitmapImage(width, height);
        }

        public static j2a.BitmapImage read(InputStream resourceAsStream) throws IOException {
            return j2a.android.BitmapImage.read(resourceAsStream);
        }
    }

}
