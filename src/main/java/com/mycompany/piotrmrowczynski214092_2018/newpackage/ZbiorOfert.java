/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.piotrmrowczynski214092_2018.newpackage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author Piotr
 */
public class ZbiorOfert implements Kolekcja<Nieruchomosc> {
    
     private List<Nieruchomosc> Nieruchomosci = new ArrayList<>();
     
     @Override
     public void dodaj(Nieruchomosc t){
         Nieruchomosci.add(t);
     }
     @Override
     public void usun(Nieruchomosc t){
         Nieruchomosci.remove(t);
     }
     @Override
     public List<Nieruchomosc> pobierzWszystkie(){
         return Nieruchomosci;
     }
     
     public Nieruchomosc pobierzDzialkeZNajnizszaCenaM2() {
        Nieruchomosc najnizszaCenaM2 = null;
        int obecna_okazja = Integer.MAX_VALUE;
            for(Nieruchomosc t : Nieruchomosci) {
                if (t.getCenaM2() < obecna_okazja) {
                    obecna_okazja = t.getCenaM2();
                    najnizszaCenaM2 = t;
                }
            }
        return najnizszaCenaM2;
     }
     public Nieruchomosc pobierzNajtanszaDzialke()
     {
         Nieruchomosc najtansza = null;
         int tempCena = Integer.MAX_VALUE;
         for (Nieruchomosc t : Nieruchomosci){
             if (t.getCena() < tempCena){
                 tempCena = t.getCena();
                 najtansza = t;
             }
         }
         return najtansza;
     }
     //metody do testow
     public int rozmiarListy(){
         return Nieruchomosci.size();
     }
     public void usunElementListy (Nieruchomosc t) {
         Nieruchomosci.remove(t);
     }
     public Nieruchomosc getElementListy(int index){
         return Nieruchomosci.get(index);
     }
     public boolean zawieraWLiscie(Nieruchomosc t){
         if (Nieruchomosci.contains(t))
            return true;
         else
            return false;
     }
}
