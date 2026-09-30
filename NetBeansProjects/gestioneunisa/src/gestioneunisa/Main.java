/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneunisa;

import it.unisa.diem.oop.persone.Docente;
import it.unisa.diem.oop.persone.Persona;
import it.unisa.diem.oop.persone.PersonaUnisa;
import it.unisa.diem.oop.persone.Studente;
import it.unisa.diem.oop.persone.Tecnico;

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
        
        Studente s = new Studente("Stefano", "Gialli", "SGL001", "061270001", 28.5); // UPCAST
        
        // Studente s1 = s // non si può fare perché non si sa se Persona s è uno Studente
        //Studente s1 = (Studente)s; // DOWNCAST
        
        Docente d = new Docente("Davide", "Grigi", "DRS001", "0330001", "ASD");
        
        Tecnico t = new Tecnico("Daniele", "Grigi", "DNS002", "0330010", "DIEM");
        
        PersonaUnisa persone[];
        persone = new PersonaUnisa[4];
        
        // persone[0] = p;
        persone[1] = s;
        persone[2] = d;
        persone[3] = t;
        
        System.out.println("*** Array ***");
        for (int i = 1; i < persone.length; i++) {
            System.out.println(persone[i].getRuolo());
            if (persone[i] instanceof Studente) {
                Studente s1 = (Studente) persone[i];
                System.out.println(s1.getVotoMedio());
            }
            
            if (persone[i].getClass() == Docente.class) {
                Docente d1 = (Docente) persone[i];
                System.out.println(d1.getInsegnamento());
            }
        }
        
        //System.out.println(p.toString());
        //System.out.println(s1);
    }
    
}
