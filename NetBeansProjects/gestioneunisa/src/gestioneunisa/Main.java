/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneunisa;

import it.unisa.diem.oop.persone.Persona;
import it.unisa.diem.oop.persone.PersonaUnisa;
import it.unisa.diem.oop.persone.Studente;

/**
 *
 * @author antagoni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("Mario", "Rossi", "MRS001");
        
        // PersonaUnisa pa = new PersonaUnisa("Davide", "Grigi", "DRS001", "0330001"); // astratta 
        
        Studente s = new Studente("Stefano", "Gialli", "SGL001", "061270001", 28.5);
        
        //System.out.println(p.toString());
        System.out.println(s);
    }
    
}
