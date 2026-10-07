/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.spazi;

/**
 *
 * @author antagoni
 */
public abstract class Spazio implements Accessibile {

    private String descrizione;
    private int maxPosti;
    
    public Spazio(String descrizione, int maxPosti) {
        this.descrizione = descrizione;
        this.maxPosti = maxPosti;
    }
    
    public String getDescrizione() {
        return descrizione;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    public int getMaxPosti() {
        return maxPosti;
    }
    
    public void setMaxPosti(int maxPosti) {
        this.maxPosti = maxPosti;
    }
    
    public abstract boolean isVuoto();
    public abstract boolean isPieno();
    public abstract String getTipo();
    
    @Override
    public String toString() {
        return getTipo() + ": " + descrizione + " Capienza: " + maxPosti + '\n';
    }
    
}
