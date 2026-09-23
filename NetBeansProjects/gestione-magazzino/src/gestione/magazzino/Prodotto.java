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
public class Prodotto {
    
    // Spazio attributi
    
    // Inizializzatore di classe
    private static int contatore;
    private final int codice; // variabili di istanza, non serve inizializzarle
    private String descrizione;
    private String dataDiProduzione;
    private float costo;
    
    // Inizializzatore statico eseguito al caricamento della classe in memoria
    static {
        contatore = -1;
    }
    // Inizializzatore di istanza (non si usa spesso)
    /*
    {
        this.codice = 1;
    }
    */
    // Spazio metodi
    
    // Costruttore
    public Prodotto() {
        this("0000-00-00", "Non disponibile", 0.0F);
        /*
        this.codice = -1;
        this.dataDiProduzione = "0000-00-00";
        this.descrizione = "Non disponibile";
        this.costo = 0.0F;*/
    }
    
    public Prodotto(int codice, String dataDiProduzione, String descrizione, float costo) {
        this.codice = codice;
        this.dataDiProduzione = dataDiProduzione;
        this.descrizione = descrizione;
        this.costo = costo;
        contatore++;
    } // Overloading
    
    public Prodotto(String dataDiProduzione, String descrizione, float costo) {
        this(contatore, dataDiProduzione, descrizione, costo);
    }
    
    public int getCodice() {
        return codice;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public String getDataDiProduzione() {
        return dataDiProduzione;
    }
    public float getCosto() {
        return costo;
    }
    public static int getContatore() {
        // this.codice = 1; // nel contesto statico this non può mai essere invocato
        return contatore;
    }
    /*
    public void setCodice(int codice) {
        this.codice = codice;
    }*/ //set non possibile se la variabile è final
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public void setDataDiProduzione(String dataDiProduzione) {
        this.dataDiProduzione = dataDiProduzione;
    }
    
    /*
    public void setDataDiProduzione(int anno, int mese, int giorno) { 
        
    }
    */ // Overloading
    
    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    public Prodotto clona() {
        return new Prodotto(this.dataDiProduzione, this.descrizione, this.costo);
    }
    
    public void stampaInfo() {
        
        // String descrizione = "Ciao!"; <-- variabile locale
        
        System.out.println("*** Prodotto ***");
        
        System.out.print("Codice: ");
        System.out.println(codice);
        
        System.out.print("Descrizione: ");
        System.out.println(descrizione);
        
        System.out.print("Costo: ");
        System.out.println(costo);
        
        System.out.print("Data di produzione: ");
        System.out.println(dataDiProduzione);
    }   
}
