/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.piotrmrowczynski214092_2018.newpackage;

/**
 *
 * @author Piotr
 */
public class Niezabudowana extends Nieruchomosc {
    
    private final int dopuszczalnaPowierzchniaZabudowy;
    
    public Niezabudowana(String nazwa, int powierzchniaDzialki, int dopuszczalnaPowierzchniaZabudowy) {
        super(nazwa, powierzchniaDzialki);
        this.dopuszczalnaPowierzchniaZabudowy = dopuszczalnaPowierzchniaZabudowy;
    }
}
