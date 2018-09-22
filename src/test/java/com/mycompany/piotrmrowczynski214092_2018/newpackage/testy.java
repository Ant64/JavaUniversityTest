/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.piotrmrowczynski214092_2018.newpackage;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Piotr
 */
public class testy {
 
    @Test
    public void przypadek1(){
    ZbiorOfert zo = new ZbiorOfert();
    Zabudowana z1 = new Zabudowana("zab1", 1000, 100);
    Zabudowana z2 = new Zabudowana("zab2", 2000, 150);
    z1.setCena(100000);
    z2.setCena(190000);
    Niezabudowana n1 = new Niezabudowana("niezab3", 800, 100);
    n1.setCena(90000);
    zo.dodaj(z1);
    zo.dodaj(z2);
    zo.dodaj(n1);
    assertEquals(3, zo.rozmiarListy());
    
    if(z1.getPowierzchniaDzialki() > z2.getPowierzchniaDzialki())
        zo.usunElementListy(z1);
    else
        zo.usunElementListy(z2);
    
    assertEquals(true, zo.zawieraWLiscie(z1));
    assertEquals(true, zo.zawieraWLiscie(n1));
    assertEquals(false, zo.zawieraWLiscie(z2));
    }
    
    @Test
    public void przypadek2(){
    ZbiorOfert zo = new ZbiorOfert();
    Zabudowana z1 = new Zabudowana("zab1", 1000, 100);
    Zabudowana z2 = new Zabudowana("zab2", 2000, 150);
    z1.setCena(100000); //100
    z2.setCena(190000); //95
    Niezabudowana n1 = new Niezabudowana("niezab3", 800, 100);
    n1.setCena(90000); //112,5
    zo.dodaj(z1);
    zo.dodaj(z2);
    zo.dodaj(n1); 
    
    assertEquals(90000, (zo.pobierzNajtanszaDzialke()).getCena());
    assertEquals(95, (zo.pobierzDzialkeZNajnizszaCenaM2()).getCenaM2());
    
    n1.setCena(60000);
    assertEquals(60000, (zo.pobierzNajtanszaDzialke()).getCena());
    
    }
}
