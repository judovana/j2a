/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2a.android;

/**
 *
 * @author jvanek
 */
public class Font implements j2a.Font {

    public static int getBOLD() {
        //  return java.awt.Font.BOLD;
        throw new UnsupportedOperationException("Please use java or android implementation");// }
    }

    //java.awt.Font back;

    //public  Font(java.awt.Font back) { this.back = back; }

    @Override
    public j2a.Font deriveFont(int mod) {
      //  back.deriveFont(mod);
      //  return new Font(back);
        throw new UnsupportedOperationException("Please use java or android implementation");    }

    @Override
    public Object getOriginal() {
        //return back;
        throw new UnsupportedOperationException("Please use java or android implementation");
    }

}
