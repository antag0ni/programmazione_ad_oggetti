import java.util.*;

/**
 *
 * @author leonardorundo
 */
public class Carrello {
    
    /* completare con eventuali attributi */
    private List<Prodotto> listaProdotti; // List è un'interfaccia
    
    public Carrello(){
        /*completare */   
        listaProdotti = new ArrayList<>(); // ArrayList è una classe concreta che implementa List
    }
    
    public void addProdotto(Prodotto p){
        /*completare */
        listaProdotti.add(p);
    }
    
    public double getTotale(){
        /*completare */   
        double totale = 0.0;
        for (Prodotto p : listaProdotti) {
            totale += p.getPrezzo();
        }
        return totale;
    }
    
    public double getTotaleScontato(){
        /*completare */    
        double totale = 0.0;
        for (Prodotto p : listaProdotti) {
            totale += p.applicaSconto();
        }
        return totale;
    }

    
    public void removeProdotto(Prodotto p){
        /*completare */
        listaProdotti.remove(p);
    }
    
    public Prodotto getProdotto(int idx){
        /*completare */
        return listaProdotti.get(idx);
    }
    
    
    @Override
    public String toString(){
        /*completare */
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------\n");  //sb.append("-".repeat(40)).append('\n');
        for (Prodotto p : listaProdotti) {
            sb.append(String.format("%-25s %9.2f €%n", p.getDescrizione(), p.getPrezzo()));
        }
        sb.append("-------------------------------------\n"); 
        sb.append(String.format("%-25s %9.2f €%n", "TOTALE:", this.getTotale()));
        sb.append(String.format("%-25s %9.2f €%n", "SCONTATO:", this.getTotaleScontato()));
        return sb.toString();
    }
    
}
