package j2a;

/**
 *
 * @author jvanek
 */
public interface Font {

    public Font deriveFont(int mod);
            
    public static int getBOLD(){
        throw new UnsupportedOperationException("Please use java or android implementation");
    }
    
    public Object getOriginal(); 
    
}
