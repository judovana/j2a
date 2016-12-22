package j2a.android;

/**
 *
 * @author jvanek
 */
public class Color implements j2a.Color {

    public static j2a.Color getBLUE() {
        return new Color(android.graphics.Color.BLUE);
    }

    public static j2a.Color getYELLOW() {
        return new Color(android.graphics.Color.YELLOW);
    }

    public static j2a.Color getBLACK() {
        return new Color(android.graphics.Color.BLACK);
    }

    public static j2a.Color getRED() {
        return new Color(android.graphics.Color.RED);
    }

    public static j2a.Color newColor(int r, int g, int b, int a) {
        return new Color(r, g, b, a);
    }

    public static j2a.Color getCYAN() {
        return new Color(android.graphics.Color.CYAN);
    }

    public static j2a.Color getWHITE() {
        return new Color(android.graphics.Color.WHITE);
    }

    public static j2a.Color newColor(int r, int g, int b) {
        return newColor(r, g, b, 255);
    }

    private final int back;

    public Color(int  c) {
        this.back = c;
    }

    private Color(int r, int g, int b, int a) {
        back = android.graphics.Color.argb(a, r, g, b);

    }

    @Override
    public Object getOriginal() {
        return back;
    }

    @Override
    public int getRed() {
        return android.graphics.Color.red(back);
    }

    @Override
    public int getGreen() {
        return android.graphics.Color.green(back);
    }

    @Override
    public int getBlue() {
        return android.graphics.Color.blue(back);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof j2a.Color)) {
            return false;
        }
        return this.getOriginal().equals(((j2a.Color)o).getOriginal());
    }

    @Override
    public int hashCode(){
        return back;
    }

}
