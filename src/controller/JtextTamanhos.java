/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author phelype
 */
public class JtextTamanhos extends PlainDocument {
     
    public int imaxtam;
    public JtextTamanhos(int maxtam){
        super();
        imaxtam = maxtam;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(imaxtam <= 0){
            super.insertString(offs, str.toUpperCase(), a);
            return;
        }
            int ilen  = (getLength() + str.length());
            if(ilen <= imaxtam)
        super.insertString(offs, str.toUpperCase(), a); //To change body of generated methods, choose Tools | Templates.
    }
}