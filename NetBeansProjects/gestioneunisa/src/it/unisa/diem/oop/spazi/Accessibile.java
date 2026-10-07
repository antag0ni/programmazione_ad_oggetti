/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.spazi;

import it.unisa.diem.oop.persone.Persona;
import it.unisa.diem.oop.spazi.eccezioni.AccessibileException;
import it.unisa.diem.oop.spazi.eccezioni.AccessibilePienoException;
import it.unisa.diem.oop.spazi.eccezioni.AccessibileVuotoException;

/**
 *
 * @author antagoni
 */
public interface Accessibile {
    void entra(Persona p) throws AccessibileException;
    Persona esce() throws AccessibileVuotoException;
}
