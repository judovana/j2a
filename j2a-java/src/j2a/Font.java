package j2a;

/**
 *
 * @author jvanek
 */
public interface Font {

    public Font deriveFont(int mod);
    
    public Object getOriginal(); 
    
}
