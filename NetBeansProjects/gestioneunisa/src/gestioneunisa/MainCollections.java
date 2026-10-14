/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneunisa;

import it.unisa.diem.oop.persone.CognomeComparator;
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
        
        Persona p1 = new Persona("Mario", "Rossi", "MRR0012");
        Persona p2 = new Persona("Mario", "Vento", "MRV0001");
        Persona p3 = new Persona("Mario", "Rossi", "MRR0012");
        
        Studente s = new Studente("Mario", "Gialli", "MRG0201", "061271170001", 30);
        
        boolean test = p1.equals(s);
        // System.out.println(test);
        
        List<Persona> c;
        
        c = new LinkedList<>(); // ArrayList di Persona
        c.add(p1);
        c.add(p2);
        c.add(p3); // duplicato
        c.add(s);
        // System.out.println(c.get(2));
        
        /*
        for(Persona p : c) {
            System.out.println(p.getNome());
        }
        */
        Iterator<Persona> it = c.iterator();
        
        Persona p6 = null;
        
        while(it.hasNext()) {
            Persona p5 = it.next();
            // System.out.println(p5.getCognome());
                        
            if (p5.getCognome().equals("Vento")) {
                // it.remove();
                p6 = p5;
                // c.remove(p5);
            }
            // System.out.println(p5.hashCode());
        }
        // c.remove(p6);
        System.out.println(c);
        
        System.out.println("***HASHSET***");
        Set<Persona> sp;
        sp = new HashSet<>();
        sp.add(p1);
        sp.add(p2);
        sp.add(s);
        System.out.println(sp);
        
        System.out.println("***TREESET***");
        Set<Persona> sp1;
        sp1 = new TreeSet<>();
        sp1.add(p1);
        sp1.add(p2);
        sp1.add(p3);
        sp1.add(s);
        
        System.out.println(sp1); // Ordinamento rispetto codiceFiscale
        
        System.out.println("***TREESET Cognome Comparator***");
        Set<Persona> sp2;
        sp2 = new TreeSet<>(new CognomeComparator());
        sp2.add(p1);
        sp2.add(p2);
        sp2.add(p3);
        sp2.add(s);
        
        System.out.println(sp2);

    }
}
