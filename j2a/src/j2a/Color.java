package j2a;

/**
 *
 * @author jvanek
 */
public interface Color {

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

    public Object getOriginal();

    public int getRed();

    public int getGreen();

    public int getBlue();

    @Override
    public boolean equals(Object o);

    @Override
    public int hashCode();
}
