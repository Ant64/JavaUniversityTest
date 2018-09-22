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
public class Zabudowana extends Nieruchomosc {
    
    private final int powierzchniaDomu;
   
    public Zabudowana(String nazwa, int powierzchniaDzialki, int powierzchniaDomu) {
        super(nazwa, powierzchniaDzialki);
        this.powierzchniaDomu = powierzchniaDomu;
    }    
}