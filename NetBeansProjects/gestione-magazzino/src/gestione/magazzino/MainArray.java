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
public class MainArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int v[];
        // Un array è un oggetto
        v = new int[2];
        
        System.out.print("len: ");
        System.out.println(v.length);
        // System.out.println(v[0]);
        
        // FOR
        for(int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
        
        // FOR EACH
        for(int a : v) {
            System.out.print(a + " ");
        }
        System.out.println(""); */
        
        Prodotto vp[]; // array di prodotti
        vp = new Prodotto[3];
        
        Prodotto p = new Prodotto();
        vp[0] = p;
        vp[1] = new Prodotto();
        vp[2] = new Prodotto();
        
        for (int i = 0; i < vp.length; i++) {
            System.out.println(vp[i].getCodice());
        }
        vp = null; // dereferenzio
    }
    
}
