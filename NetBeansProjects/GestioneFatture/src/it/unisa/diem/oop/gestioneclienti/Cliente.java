/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.gestioneclienti;

/**
 *
 * @author antagoni
 */

/*
 *  La classe Cliente deve incapsulare i seguenti attributi in sola lettura: nome, cognome, codiceFiscale e indirizzo. Oltre ai metodi getter, 
 *  deve essere previsto il metodo stampaCliente (che restituisca le informazioni relative al cliente in forma testuale mediante una String).
 */

public class Cliente {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String indirizzo;
    
    public Cliente() {
        this("Non disponibile", "Non disponibile", "Non disponibile", "Non disponibile");
    }
    
    public Cliente(String nome, String cognome, String codiceFiscale, String indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.indirizzo = indirizzo;
    }
    
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    //Cliente: Luca Bianchi | CF: BNCGLC90C01F205Y | Indirizzo: Via Milano 25, Torino
    public String stampaCliente() {
        StringBuffer sb = new StringBuffer();
        sb.append("Cliente: ").append(nome).append(" ").append(cognome).append(" | ");
        sb.append("CF: ").append(codiceFiscale).append(" | ");
        sb.append("Indirizzo: ").append(indirizzo);
        return sb.toString();
    }
}
