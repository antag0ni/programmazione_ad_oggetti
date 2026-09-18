/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione.magazzino;

/**
 *
 * @author antagoni
 */
public class GestioneMagazzino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello World");
        
        // Le variabili devono essere sempre inizializzate
        Prodotto p;
        p = new Prodotto(); // p contiene il riferimento all'area di memoria che contiene l'oggetto 
        
        Prodotto p1 = new Prodotto();
        
        // NON ACCESSIBILI SE PRIVATI
        //System.out.println(p.codice);
        //p.codice = 1;
        //System.out.println(p.codice);
        //System.out.println(p.dataDiProduzione);
        
        //System.out.println(p.getCodice());
        p.setCodice(10);
        p.setDataDiProduzione("2015-11-12");
        p.setDescrizione("Tavolo");
        p.setCosto(12.50F); //va specificato il tipo altrimenti il default è double
        
        p.stampaInfo();
        
        p1.stampaInfo();
        
        Prodotto p2 = new Prodotto(25, "2025-12-20", "Penna", 6.0F);
        
        p2.stampaInfo();
        
        Prodotto p3;
        p3 = p2.clona();
        
        p3.setCosto(1.5F);
        
        p3.stampaInfo();
    }
}
