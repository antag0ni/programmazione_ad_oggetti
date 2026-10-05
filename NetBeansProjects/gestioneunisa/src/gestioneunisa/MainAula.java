/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneunisa;

import it.unisa.diem.oop.persone.Docente;
import it.unisa.diem.oop.persone.Persona;
import it.unisa.diem.oop.persone.Studente;
import it.unisa.diem.oop.spazi.Aula;

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
        
        a.entra(new Persona("Mario", "Rossi", "MRS0001"));
        a.entra(new Studente("Fabio", "Tozzi", "FBT0006", "06127111111", 13));
        a.entra(new Studente("Tozzi", "Fabio", "FBT0060", "06127111111", 28)); // STACK PUSH
        
        a.esce(); // STACK POP
        System.out.println(a);
    }
    
}
