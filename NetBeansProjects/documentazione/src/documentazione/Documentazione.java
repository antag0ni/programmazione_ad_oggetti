/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentazione;

/**
 *
 * @author antagoni
 */
public class Documentazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prodotto p = new Prodotto(22, "Tavolo", 125.0, "10-08-2023");
        System.out.println(p.stampaProdotto());
    }
    
}
