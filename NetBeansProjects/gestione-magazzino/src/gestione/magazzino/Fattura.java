/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione.magazzino;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author antagoni
 */ 
public class Fattura {
    
    private String descrizione;
    
    private LocalDate dataEmissione;
    
    private List<Riga> righe;
            
    public Fattura(String descrizione, LocalDate dataEmissione) {
        this.descrizione = descrizione;
        this.dataEmissione = dataEmissione;
        
        this.righe = new ArrayList<>();
    }
    
    public void aggiungiRiga(Prodotto p, int quantita) {
        this.righe.add(new Riga(p, quantita));
    }
    
    public float getTotale() {
        float somma = 0;
        for (Riga r : righe) {
            somma += r.p.getCosto() * r.quantita;
        }
        return somma;
    }
    
    public float getTotaleScontato() {
        // classe locale
        class CalcolatoreSconto {

            float importoRiga(Riga r) {
                int pagati = (r.quantita / 3) * 2 + (r.quantita % 3);
                return r.p.getCosto() * pagati;
            }
        }
        CalcolatoreSconto cr = new CalcolatoreSconto();

        float totale = 0;
        for (Riga r : righe) {
            totale += cr.importoRiga(r);
        }
        return totale;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("***Fattura**\n");
        sb.append("Data emissione: " + this.dataEmissione);
        sb.append("\nDescrizione: " + this.descrizione );
        
        for(Riga r : righe) {
            sb.append(r);
        }
        
        return sb.toString();
    }
    
    public Collection<Riga> getRighe() {
        return new ArrayList(this.righe);
    }
    
    // CLASSE INNESTATA (interna)
    // se si usa static si può instanzaiare una Riga senza avere una Fattura
    public class Riga {
        private Prodotto p;
        private int quantita;
        private String descrizione;
        
        public Riga(Prodotto p, int quantita) { // Solo Fattura può instanziare una Riga se si usa private come modificatore di visibilità
            this.p = p;
            this.quantita = quantita;
        }
        
        public Prodotto getProdotto() {
            return this.p;
        }
        
        public int getQuantita() {
            return this.quantita;
        }
        
        public void stampaDescrizione() {
            // SHADOWING
            String descrizione;
            descrizione = "msg_locale"; // variabile locale
            this.descrizione = "msg_riga"; // variabile di Riga
            Fattura.this.descrizione = "msg_fattura"; 
        }
        
        @Override
        public String toString() {
            return "\n" + p.toString() + "quantità: " + quantita;
        }
        
    }
}
