/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.persone;
import java.util.Comparator;

/**
 *
 * @author antagoni
 */
public class CognomeComparator implements Comparator<Persona> {
    
    @Override 
    public int compare(Persona o1, Persona o2) {
        if (o1.getCognome().equals(o2.getCognome())) {
            return o1.compareTo(o2);
        }
        return o1.getCognome().compareTo(o2.getCognome());
    }
    
}
