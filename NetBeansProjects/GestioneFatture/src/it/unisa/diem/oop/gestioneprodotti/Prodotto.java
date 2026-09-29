/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.gestioneprodotti;
import java.util.Locale;
/**
 *
 * @author antagoni
 */

/*
 *  La classe Prodotto deve incapsulare i seguenti attributi in sola lettura: codice, descrizione, costo e dataProduzione. 
 *  Oltre ai metodi getter, deve essere previsto il metodo stampaProdotto (che restituisca le informazioni relative al cliente in forma testuale mediante una String). 
 */

public class Prodotto {
    private int codice;
    private String descrizione;
    private double costo;
    private String dataProduzione;
    
    public Prodotto() {
        this(-1, "Non disponibile", 0.00, "Non disponibile");
    }
    
    public Prodotto(int codice, String descrizione, double costo, String dataProduzione) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.costo = costo;
        this.dataProduzione = dataProduzione;
    }
    
    public int getCodice() {
        return codice;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public double getCosto() {
        return costo;
    }
    public String getDataProduzione() {
        return dataProduzione;
    }

    public String stampaProdotto() {
        StringBuffer sb = new StringBuffer();
        sb.append(codice).append(": ");
        sb.append(descrizione).append(' ');
        sb.append("(Costo: ").append(String.format(Locale.ITALY, "%.2f", costo)).append(" €) --- ");
        sb.append("Data Produzione: ").append(dataProduzione);
        return sb.toString();
    }
}
