/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2a.android;

import android.graphics.Typeface;

/**
 *
 * @author jvanek
 */
public class Font implements j2a.Font {



    Typeface back;

    public  Font(Typeface back) { this.back = back; }

    @Override
    public j2a.Font getBold() {
        return new Font(Typeface.DEFAULT_BOLD);
    }


    @Override
    public Object getOriginal() {
        return back;

    }

}
