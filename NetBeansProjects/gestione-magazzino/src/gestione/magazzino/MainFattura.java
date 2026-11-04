/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione.magazzino;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author antagoni
 */
public class MainFattura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        //Prodotto p = new Prodotto();
        Prodotto p1 = new Prodotto("2020-10-10", "Gomma", 2.0F);
        Prodotto p2 = new Prodotto("2022-04-22", "Penna", 1.5F);
        Prodotto p3 = new Prodotto("2023-08-12", "Temperino", 3.0F);
        
        Fattura f = new Fattura("Cancelleria", LocalDate.now());
        f.aggiungiRiga(p1, 2);
        f.aggiungiRiga(p2, 1);
        f.aggiungiRiga(p3, 3);
        
        System.out.println(f);
        System.out.println("Importo totale: " + f.getTotaleScontato());
        
        Collection<Fattura.Riga> righe = f.getRighe();
        
        // oppure
        
        /*for (Fattura.Riga fr : righe) {
            System.out.println(fr.getProdotto());
        }*/
        
        // Fattura.Riga fr = new Fattura.Riga();        // Per poter instanziare una classe interna serve aver instanziato prima la classe esterna
        // Fattura.Riga fr = f.new Fattura.Riga(p1, 1); // static nested class
        /*
        Comparator<String> clenght = new Comparator<String>() {
            // CLASSE ANONIMA
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        */
        
        Comparator<String> clenght = (o1, o2) -> o1.length() - o2.length();
        // oppure
        /*
        Comparator<String> clenght = (o1, o2) -> { 
            return o1.length() - o2.length();
        };
        */
        Set<String> nomi = new TreeSet(clenght);
        
        nomi.add("Tavolo");
        nomi.add("Penna");
        nomi.add("Parcheggio");
        
        System.out.println(nomi);
    }
    
}
