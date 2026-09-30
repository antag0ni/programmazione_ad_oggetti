/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.persone;
import it.unisa.diem.oop.persone.Persona;

/**
 *
 * @author antagoni
 */
public abstract class PersonaUnisa extends Persona {
    
    private String matricola;
    
    public PersonaUnisa(String nome, String cognome, String codiceFiscale, String matricola) {
        super(nome, cognome, codiceFiscale);
        this.matricola = matricola;
    }
    
    public String getMatricola() {
        return matricola;
    }
    
    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
    
    public abstract String getRuolo();
    
    @Override
    public String toString() {
        return super.toString() + "Matricola: " + matricola + '\n' + "Ruolo: " + this.getRuolo() + '\n';
    }
}
