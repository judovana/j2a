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
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static j2a.Color getYELLOW() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static j2a.Color getBLACK() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static j2a.Color getRED() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static j2a.Color getCYAN() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static j2a.Color newColor(int r, int g, int b, int a) {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static j2a.Color newColor(int r, int g, int b) {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static j2a.Color getWHITE() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }
    }

    public static class Point {

        public static j2a.Point newPoint(int x, int y) {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }
    }

    public static class Font {

        public static int getBOLD() {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }
    }

    public static class BitmapImage {

        public static j2a.BitmapImage newBitmapImage(int width, int height) {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }

        public static j2a.BitmapImage read(InputStream resourceAsStream) throws IOException {
            throw new UnsupportedOperationException("Please use java or android implementation");
        }
    }

}
