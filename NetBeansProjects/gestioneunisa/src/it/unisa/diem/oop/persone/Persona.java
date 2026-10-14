/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.persone;

/**
 *
 * @author antagoni
 */

public class Persona implements Clonabile <Persona>, Comparable<Persona> {
    protected String nome;
    private String cognome;
    private String codiceFiscale;
    
    /*
    public Persona() {
    
    } */
    
    public Persona(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }
    
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public String getCodiceFiscale() { return codiceFiscale; }
    
    public void setNome(String nome) { this.nome = nome; }
    public void setCognome(String cognome) { this.cognome = cognome; }
    public void setCodiceFiscale(String codiceFiscale) { this.codiceFiscale = codiceFiscale; }
    
    @Override
    public final boolean equals(Object obj) { // Object invece di Persona perché non sappiamo che tipo passeremo
        // Verifica se l'oggetto esiste
        if (obj == null) return false;
        
        // Riflessività
        if (this == obj) return true;
        
        // Simmetria
        if (this.getClass() != obj.getClass()) return false;
        
        // if (!(obj instanceof Persona)) return false; // Non simmetrico (sconsigliata)
        
        Persona p = (Persona) obj; // Downcast
        return this.codiceFiscale.equals(p.codiceFiscale); 
    }
    /*
    @Override
    public int hashCode() {
        return this.codiceFiscale == null ? 0 : this.codiceFiscale.hashCode();
    }
    */
    /*
    // caso con più attributi
    @Override
    public int hashCode() {
        int result = 17; // numero primo
        result = 31 * result + this.nome.hashCode();
        result = 31 * result + this.codiceFiscale.hashCode();
        return result;
    }
    */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nome: ").append(nome).append('\n');
        sb.append("Cognome: ").append(cognome).append('\n');
        sb.append("Codice Fiscale: ").append(codiceFiscale).append('\n');
        return sb.toString();
    }

    @Override
    public Persona clona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Persona o) {
        return this.codiceFiscale.compareTo(o.codiceFiscale);
        // return Double.compare(28.5, 30); // esempio di comparazione tra due double
    }

}
