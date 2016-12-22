package j2a;

/**
 *
 * @author jvanek
 */
public interface Color {

    public Object getOriginal();

    public int getRed();

    public int getGreen();

    public int getBlue();

    @Override
    public boolean equals(Object o);

    @Override
    public int hashCode();
}
