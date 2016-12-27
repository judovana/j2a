package j2a.android_test;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import j2a.BitmapImage;
import j2a.Font;
import j2a.GraphicsCanvas;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iw= (ImageView) findViewById(R.id.imageView) ;
        try {
            BitmapImage bm = j2a.Factory.BitmapImage.read(this.getClass().getResourceAsStream("/testresource/img.jpg"));
            BitmapImage bm2 = j2a.Factory.BitmapImage.read(this.getClass().getResourceAsStream("/testresource/img.jpg"));
            GraphicsCanvas gc = bm.createGraphics();
            gc.setColor(j2a.Factory.Color.getBLUE());
            gc.drawLine(0, 0, bm.getWidth(), bm.getHeight());
            gc.setColor(j2a.Factory.Color.getRED());
            gc.drawString("XXX", 50, 50);
            gc.drawImage(bm2, 100,100,null);
            Font f= gc.getFont();
            gc.setFont(f.getBold());
            gc.drawString("XXX", 70, 70);
            gc.setFont(f);
            gc.drawString("XXX", 100, 100);
            gc.fillOval(10,10,40,40);
            gc.setFont(f.getBold());
            gc = bm.createGraphics();
            gc.drawString("XXX", 130, 130);
            gc.setColor(j2a.Factory.Color.getBLUE());
            gc.drawRect(10,10,30,30);
            gc.setColor(j2a.Factory.Color.newColor(20,200,20,120));
            gc.fillRect(0,100,30,30);
            iw.setImageBitmap((Bitmap) bm.getOrigianl());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
