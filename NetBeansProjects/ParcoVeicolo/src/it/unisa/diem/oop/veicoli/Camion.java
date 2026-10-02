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
public class Camion extends Veicolo {
    private final int numeroAssi;
    public Camion(String numTelaio, String modello, String alimentazione, String targa, int numeroAssi) {
        super(numTelaio, modello, alimentazione, targa);
        this.numeroAssi = numeroAssi;
    }
    
    public int getNumeroAssi() { return numeroAssi; }

    @Override
    public boolean controllaTarga() {
        if (super.getTarga() == null) {
            return false;
        }
        return super.getTarga().matches("[a-zA-Z]{2}\\d{6}$");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Numero assi: " + numeroAssi + '\n';
    }
}
