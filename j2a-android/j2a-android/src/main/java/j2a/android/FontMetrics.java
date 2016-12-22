/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2a.android;

import android.graphics.Rect;

/**
 *
 * @author jvanek
 */
public class FontMetrics implements j2a.FontMetrics {

    //private final android.graphics.Paint.FontMetrics back;
    private final android.graphics.Paint back;

   //FontMetrics(android.graphics.Paint.FontMetrics fontMetrics) {this.back=fontMetrics;}

    FontMetrics(android.graphics.Paint paint) {this.back=paint;}

    @Override
    public int getHeight() {
        return (int)(back.getFontMetrics().top);
    }

    @Override
    public int stringWidth(String s) {
        Rect bounds = new Rect();
        back.getTextBounds(s, 0, s.length(), bounds);
        int height = bounds.height();
        int width = bounds.width();
        return width;

    }
    
}
