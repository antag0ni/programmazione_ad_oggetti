/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.gestioneprodotti;
import it.unisa.diem.oop.gestioneclienti.Cliente;
import java.util.Locale;

/**
 *
 * @author antagoni
 */

/*
 * La classe Fattura deve incapsulare un array prodotti di oggetti della classe Prodotto mediante l'information hiding. 
 * Pertanto, deve essere gestita la dimensione massima dell'array (dimensione fisica) e il numero di elementi effettivamente presenti (dimensione logica). 
 * Ogni Fattura deve essere identificata da un valore numerico progressivo. Inoltre, deve essere indicato il destinatario della fattura (incapsulando un oggetto della classe Cliente) 
 * e la data di emissione (come una stringa nel formato "DD-MM-YYYY"). Infine, deve essere prevista la percentuale di tassa da applicare all'imponibile. 
 * Oltre ai metodi getter, i metodi richiesti devono presentare i seguenti prototipi:
 *
 *  void aggiungiProdotto(Prodotto p): inserisce un prodotto alla fattura fino al raggiungimento del riempimento massimo;
 *  double calcolaImponibile(): calcola l'imponibile complessivo della fattura;
 *  double calcolaTotale(): calcola il totale della fattura (dopo l'applicazione della percentuale di tasse);
 *  String stampaFattura(): visita l'array di prodotti e restituisce i dettagli della fattura in formato testuale.
 */
public class Fattura {
    private static int codice;
    private int dimensione;
    private Cliente cliente;
    private String dataEmissione;
    private double percentualeTassa;
    private Prodotto[] arrayProdotti;
    private int cont;
    
    //Fattura fatt1 = new Fattura(5, cliente1, "20-09-2025", 0.10F);
    public Fattura(int dimensione, Cliente cliente, String dataEmissione, double percentualeTassa) {
        this.codice = codice;
        this.dimensione = dimensione;
        this.cliente = cliente;
        this.dataEmissione = dataEmissione;
        this.percentualeTassa = percentualeTassa;
        codice++;
        
        arrayProdotti = new Prodotto[dimensione];
    }
    
    public int getCodice() {
        return codice;
    }
    public int getDimensione() {
        return dimensione;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public String getDataEmissione() {
        return dataEmissione;
    }
    public double getPercentualeTassa() {
        return percentualeTassa;
    }
    
    void aggiungiProdotto(Prodotto p) {
        if (cont == this.dimensione) {
            int nuovaDim = dimensione + 1;
            Prodotto[] nuovoArray = new Prodotto[nuovaDim];
            for(int i = 0; i < cont; i++)
                nuovoArray[i] = arrayProdotti[i];
            this.arrayProdotti = nuovoArray;
            dimensione = nuovaDim;
        }
        this.arrayProdotti[cont] = p;
        cont++;
    }
    
    double calcolaImponibile() {
        double sum = 0;
        for(int i = 0; i < this.cont; i++) {
            sum += this.arrayProdotti[i].getCosto();
        }
        return sum;
    }
    
    double calcolaTotale() {
        return this.calcolaImponibile() * (1 + this.percentualeTassa);
    }

    String stampaFattura() {
        StringBuffer sb = new StringBuffer();
        sb.append("===== FATTURA ID: ").append(codice).append(" (").append(dataEmissione).append(") =====").append('\n');
        sb.append(cliente.stampaCliente()).append('\n');
        for (int i = 0; i < this.cont; i++)
            sb.append(this.arrayProdotti[i].stampaProdotto()).append('\n');
        sb.append("-------------------").append('\n');
        sb.append("Totale da pagare: €").append(String.format(Locale.ITALY, "%.2f", this.calcolaTotale())).append('\n');
        return sb.toString();
    }
}
