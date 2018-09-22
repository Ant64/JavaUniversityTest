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
import java.util.List;
import java.util.Objects;

public class Nieruchomosc {
    private final String nazwa;
    private final int powierzchniaDzialki;
    private int cena;
    
    public Nieruchomosc(String nazwa, int powierzchniaDzialki){
        this.nazwa = nazwa;
        this.powierzchniaDzialki = powierzchniaDzialki;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public int getCena() {
        return cena;
    }
    public int getCenaM2(){
        return cena/powierzchniaDzialki;
    }
    public String getNazwa() {
        return nazwa;
    }
    public int getPowierzchniaDzialki() {
        return powierzchniaDzialki;
    }
    
     @Override
    public String toString() {
        return "Nieruchomosc{" + "nazwa: " + nazwa + ", powierzchnia dzialki w m^2: " + powierzchniaDzialki + ", cena: " + cena + '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nieruchomosc other = (Nieruchomosc) obj;
        if (this.powierzchniaDzialki != other.powierzchniaDzialki) {
            return false;
        }
        if (this.cena != other.cena) {
            return false;
        }
        if (!Objects.equals(this.nazwa, other.nazwa)) {
            return false;
        }
        return true;
    }
}