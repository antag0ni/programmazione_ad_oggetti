/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.veicoli;

/**
 *
 * @author antagoni
 */
public class Autovettura extends Veicolo {
    private final int numeroPosti;
    
    public Autovettura(String numTelaio, String modello, String alimentazione, String targa, int numeroPosti) {
        super(numTelaio, modello, alimentazione, targa);
        this.numeroPosti = numeroPosti;
    }
    
    public int getNumeroPosti() { return numeroPosti; }
    
    @Override
    public boolean controllaTarga() {
        if (super.getTarga() == null) {
            return false;
        }
        return super.getTarga().matches("[a-zA-Z]{2}\\d{3}[a-zA-Z]{2}$");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Numero posti: " + numeroPosti + '\n';
    }
}
