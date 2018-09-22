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
import java.util.*;

public interface Kolekcja<T> {

    public List<T> pobierzWszystkie();
    public void dodaj(T t);
    public void usun(T t);
}
