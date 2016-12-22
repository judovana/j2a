package j2a.android;




/**
 *
 * @author jvanek
 */
public class Point implements j2a.Point{

    private final android.graphics.Point back;

    public static j2a.Point newPoint(int x, int y) {
        return new Point(x, y);
    }

    public Point(android.graphics.Point back) {
        this.back = back;
    }

    public Point(int x, int y) {
        this.back = new android.graphics.Point(x, y);
    }

    @Override
    public int getX() {
        return back.x;
    }

    @Override
    public int getY() {
        return back.y;
    }

    @Override
    public double distance(j2a.Point point) {
        //android sucks
        return Math.sqrt(Math.pow(point.getX() - this.getX(), 2) + Math.pow(point.getY()- this.getY(), 2));
    }

    @Override
    public Object getOriginal() {
        return back;
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof j2a.Point)) {
            return false;
        }
        return this.getOriginal().equals(((j2a.Point)o).getOriginal());
    }

    @Override
    public int hashCode(){
        return back.hashCode();
    }

}
