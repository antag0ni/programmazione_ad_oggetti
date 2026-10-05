/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.spazi;

import it.unisa.diem.oop.persone.Persona;

/**
 *
 * @author antagoni
 */
public class Aula extends Spazio {
    
    private Persona persone[];
    private int riemp;
    public Aula(String descrizione, int maxPosti) {
        super(descrizione, maxPosti);
        this.persone = new Persona[maxPosti];
    }
    
    @Override
    public boolean isVuoto() {
        return riemp == 0;
    }

    @Override
    public boolean isPieno() {
        return riemp == persone.length;
    }

    @Override
    public String getTipo() {
        return "AULA";
    }

    @Override
    public void entra(Persona p) {
        if(isPieno()) {
            System.out.println("Spazio pieno");
            return;
        }
        persone[riemp++] = p;
    }

    @Override
    public Persona esce() {
        if (isVuoto()) {
            System.out.println("Spazio vuoto");
            return null;
        }
        
        Persona p = persone[--riemp];
        persone[riemp] = null; 
        
        return p;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        for(int i = 0; i < riemp; i++) {
            sb.append('\n');
            sb.append(persone[i]);
        }
        return sb.toString();
    }
}
