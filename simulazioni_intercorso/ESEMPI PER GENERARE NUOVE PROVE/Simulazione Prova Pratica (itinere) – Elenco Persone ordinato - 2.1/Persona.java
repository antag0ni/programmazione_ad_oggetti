/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDate;

/**
 *
 * @author leonardorundo
 */
public class Persona implements Comparable<Persona> {
    
    private final String nome;

    private final LocalDate dataNascita;

    private final String codiceFiscale;

    

    public Persona(String nome, LocalDate dataNascita, String codiceFiscale) {

        this.nome = nome;

        this.dataNascita = dataNascita;

        this.codiceFiscale = codiceFiscale;

    }

    

    public String getNome() {

        return nome;

    }

    

    public LocalDate getDataNascita() {

        return dataNascita;

    }

    

    public String getCodiceFiscale() {

        return codiceFiscale;

    }

    

    @Override

    public int hashCode() {

        int hash = 31 * codiceFiscale.hashCode();

        return hash;

    }

    

    @Override

    public boolean equals(Object other) {

        if (this == other) {
            return true;
        }

        if (other == null) {
            return false;
        }

        if (this.getClass() != other.getClass()) {
            return false;
        }

        return getCodiceFiscale().equals(((Persona) other).getCodiceFiscale());

    }
    
    
    /* Completare con altri metodi ed eventuali override */
    
    @Override
    public final int compareTo(Persona p) {
        if (this.getNome().equals(p.getNome())) {
            return this.getCodiceFiscale().compareTo(p.getCodiceFiscale());
        } else {
            return this.getNome().compareTo(p.getNome());
        }
        /*
        int res = this.getNome().compareTo(p.getNome());
        
        return (res == 0) ? this.getCodiceFiscale().compareTo(p.getCodiceFiscale()) : res;
        */
    }

    

    @Override

    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("***");
        stringBuffer.append("\nNome : ");
        stringBuffer.append(getNome());
        stringBuffer.append("\nData di nascita : ");
        stringBuffer.append(getDataNascita());
        stringBuffer.append("\nCodice fiscale : ");
        stringBuffer.append(getCodiceFiscale());
        stringBuffer.append("\n");

        return stringBuffer.toString();

    }
    
}
