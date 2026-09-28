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
public class Studente extends PersonaUnisa {
    private double votoMedio;

    public Studente(String nome, String cognome, String codiceFiscale, String matricola, double votoMedio) {
        super(nome, cognome, codiceFiscale, matricola);
        this.votoMedio = votoMedio;
    }
    
    public double getVotoMedio() {
        return votoMedio;
    }
    
    public void setVotoMedio(double votoMedio) {
        this.votoMedio = votoMedio;
    }
    
    @Override
    public String getRuolo() {
        return "Studente";
    }
    
    @Override
    public String toString() {
        return super.toString() + "Voto medio: " + votoMedio;
    }
}
