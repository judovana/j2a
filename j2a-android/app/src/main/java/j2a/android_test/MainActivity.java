package j2a.android_test;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import j2a.BitmapImage;
import j2a.GraphicsCanvas;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iw= (ImageView) findViewById(R.id.imageView) ;
        try {
            BitmapImage bm = j2a.Factory.BitmapImage.read(this.getClass().getResourceAsStream("/org/fbb/balkna/data/imgs/app/title.png"));
            GraphicsCanvas gc = bm.createGraphics();
            gc.setColor(j2a.Factory.Color.getBLUE());
            gc.drawLine(0, 0, bm.getWidth(), bm.getHeight());
            gc.setColor(j2a.Factory.Color.getRED());
            gc.drawString("aaa", 50, 50);
            iw.setImageBitmap((Bitmap) bm.getOrigianl());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
