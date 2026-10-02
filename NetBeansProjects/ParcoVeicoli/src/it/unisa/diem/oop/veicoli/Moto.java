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
public class Moto extends Veicolo {
    private final boolean guidaLibera;
    
    public Moto(String numTelaio, String modello, String alimentazione, String targa, boolean guidaLibera) {
        super(numTelaio, modello, alimentazione, targa);
        this.guidaLibera = guidaLibera;
    }
    
    public boolean getGuidaLibera() { return guidaLibera; }
    
    @Override
    public boolean controllaTarga() {
        if (super.getTarga() == null) {
            return false;
        }
        return super.getTarga().matches("[a-zA-Z]{2}\\d{5}$");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Guida libera: " + guidaLibera + '\n';
    }
}
