package j2a;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author jvanek
 */
public class Factory {

    public static class Color {

        public static Color getBLUE() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static Color getYELLOW() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static Color getBLACK() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static Color getRED() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static Color getCYAN() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static Color newColor(int r, int g, int b, int a) {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static Color newColor(int r, int g, int b) {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static Color getWHITE() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }
    }

    public static class Point {

        public static Point newPoint(int x, int y) {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }
    }

    public static class Font {

        public static int getBOLD() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }
    }

    public static class Image {

        public static BitmapImage newBitmapImage(int width, int height) {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static BitmapImage read(InputStream resourceAsStream) throws IOException {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }
    }

}
