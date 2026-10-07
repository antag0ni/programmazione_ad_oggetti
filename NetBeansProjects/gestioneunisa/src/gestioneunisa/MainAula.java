/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneunisa;

import it.unisa.diem.oop.persone.Docente;
import it.unisa.diem.oop.persone.Persona;
import it.unisa.diem.oop.persone.Studente;
import it.unisa.diem.oop.spazi.Accessibile;
import it.unisa.diem.oop.spazi.Aula;
import it.unisa.diem.oop.spazi.eccezioni.AccessibilePienoException;
import it.unisa.diem.oop.spazi.eccezioni.AccessibileVuotoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antagoni
 */
public class MainAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aula a = new Aula("B", 10);
        
        try {
            a.esce(); // STACK POP
            // altro codice nel blocco try non verrebbe eseguito
            a.entra(new Persona("Mario", "Rossi", "MRS0001"));
        } catch (AccessibileVuotoException | AccessibilePienoException ex ) {
            // Logger.getLogger(MainAula.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
        } 
        /* // catch multipli
        catch (AccessibilePienoException ex) {
            Logger.getLogger(MainAula.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        try {
            a.entra(new Persona("Mario", "Rossi", "MRS0001"));
            // a.entra(new Studente("Fabio", "Tozzi", "FBT0006", "06127111111", 13)); //test voto non valido
            a.entra(new Studente("Fabio", "Tozzi", "FBT0006", "06127111111", 20));
            a.entra(new Docente("Tozzi", "Fabio", "FBT0060", "06127111", "ASD")); // STACK PUSH
        } catch (Exception ex) {
            System.err.println(ex);
        }
    
        System.out.println(a);
    }
    
}
