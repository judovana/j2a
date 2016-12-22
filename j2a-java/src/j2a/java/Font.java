/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2a.java;

/**
 *
 * @author jvanek
 */
public class Font implements j2a.Font {

    java.awt.Font back;

    public  Font(java.awt.Font back) {
        this.back = back;
    }

    @Override
    public j2a.Font getBold() {
        return new j2a.java.Font(back.deriveFont(java.awt.Font.BOLD));
    }

    @Override
    public Object getOriginal() {
        return back;
    }

}
