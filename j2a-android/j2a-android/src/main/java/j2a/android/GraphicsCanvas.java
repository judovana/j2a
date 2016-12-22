package j2a.android;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import j2a.BitmapImage;
import j2a.Color;
import j2a.Font;
import j2a.FontMetrics;

/**
 *
 * @author jvanek
 */
public class GraphicsCanvas implements j2a.GraphicsCanvas {

    private final Canvas back;
    private final Paint currentPaint = new Paint();

    GraphicsCanvas(Canvas createGraphics) {
        back = createGraphics;
    }

    @Override
    public void setColor(Color c) {
        this.currentPaint.setColor((Integer)c.getOriginal());

    }

    @Override
    public void fillOval(int i, int i0, int i1, int i2) {
        currentPaint.setStyle(Paint.Style.FILL);
        back.drawCircle(i, i0, (Math.abs(i1)+Math.abs(i2))/2, currentPaint);
    }

    @Override
    public void drawImage(BitmapImage mainBoardImage, int x, int y, Object obs) {
        back.drawBitmap((Bitmap) (mainBoardImage.getOrigianl()), x, y, currentPaint);
    }

    @Override
    public void fillRect(int x, int y, int w, int h) {
        currentPaint.setStyle(Paint.Style.FILL);
        back.drawRect(x, y, x+w, x+h, currentPaint);
    }

    @Override
    public FontMetrics getFontMetrics() {
        //return new j2a.java.FontMetrics(back.getFontMetrics());
        throw new UnsupportedOperationException("Please use java or android implementation");
    }

    @Override
    public void drawRect(int x, int y, int w, int h) {
        currentPaint.setStyle(Paint.Style.STROKE);
        back.drawRect(x, y, x+w, x+h, currentPaint);
    }

    @Override
    public void drawString(String string, int x, int y) {
        currentPaint.setStyle(Paint.Style.STROKE);
        back.drawText(string, x, y, currentPaint);
    }

    @Override
    public void drawLine(int x, int y, int i, int i0) {
        currentPaint.setStyle(Paint.Style.STROKE);
        back.drawLine(x, y, i, i0, currentPaint);
    }

    @Override
    public Font getFont() {
        //return new j2a.java.Font(back.getFont());
        throw new UnsupportedOperationException("Please use java or android implementation");
    }

    @Override
    public void setFont(Font f) {
        //back.setFont(null);
        throw new UnsupportedOperationException("Please use java or android implementation");
    }

}
