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
public class MainString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String p1 = "Ciao";
        System.out.println(p1);
        
        //p1 = "Benvenuti";
        //System.out.println(p1);
        
        String p2 = new String("Ciao");
        System.out.println(p2);
        
        String p3 = p1 + " " + p2;
        System.out.println(p3);
        
        String p4 = "Benvenuti";
        
        Prodotto vp[] = new Prodotto[3];
        
        vp[0] = new Prodotto();
        vp[1] = new Prodotto();
        vp[2] = new Prodotto();
        
        String c = "";
        for(int i = 0; i < vp.length; i++) 
            c += vp[i].getDescrizione() + " ";
        System.out.println(c);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < vp.length; i++)
            sb.append(vp[i].getDescrizione() + " ");
        System.out.println(sb.toString());
        
        if (p1.equals(p2))
            System.out.println("Sono uguali");
        else
            System.out.println("Non sono uguali");
    }
    
}
