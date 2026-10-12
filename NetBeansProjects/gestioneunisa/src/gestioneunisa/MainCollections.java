/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneunisa;

import it.unisa.diem.oop.persone.Persona;
import it.unisa.diem.oop.persone.Studente;
import java.util.*;

/**
 *
 * @author antagoni
 */
public class MainCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Mario", "Vento", "MRV0001");
        Persona p2 = new Persona("Mario", "Rossi", "MRV0001");
        
        Studente s = new Studente("Mario", "Gialli", "MRV0001", "061271170001", 30);
        
        boolean test = p1.equals(s);
        // System.out.println(test);
        
        List<Persona> c;
        
        c = new LinkedList<>(); // ArrayList di Persona
        c.add(p1);
        c.add(p2);
        c.add(s);
        // System.out.println(c.get(2));
        
        for(Persona p : c) {
            System.out.println(p.getNome());
        }
        
        Iterator<Persona> it = c.iterator();
        
        while(it.hasNext()) {
            Persona p5 = it.next();
            System.out.println(p5.getCognome());
            
            if (p5.getCognome().equals("Vento")) {
                it.remove();
                // c.remove(p5);
            }
        }
        System.out.println(c);
    }
    
}
