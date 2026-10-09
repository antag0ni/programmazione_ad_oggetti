/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.rimessa;

import it.unisa.diem.oop.eccezioni.AutorimessaPienaException;
import it.unisa.diem.oop.eccezioni.AutorimessaVuotaException;
import it.unisa.diem.oop.eccezioni.BoxException;
import it.unisa.diem.oop.eccezioni.TargaNonValidaException;
import it.unisa.diem.oop.veicoli.Veicolo;

/**
 *
 * @author antagoni
 */
public class Autorimessa extends Box {

    private Veicolo[] veicoli;
    private int testa;
    private int coda;
    private int riemp;

    public Autorimessa(int maxPosti, String nome) {
        super(maxPosti, nome);
        this.veicoli = new Veicolo[maxPosti];
        this.testa = 0;
        this.coda = 0;
        this.riemp = 0;
    }

    private boolean autorimessaPiena() {
        return riemp == veicoli.length;
    }

    private boolean autorimessaVuota() {
        return riemp == 0;
    }

    @Override
    public void entra(Veicolo v) throws BoxException {
        if (autorimessaPiena()) {
            // System.out.println("Autorimessa piena. Ingresso vietato.");
            // return;
            throw new AutorimessaPienaException("Autorimessa piena. Ingresso vietato.");
        } else if (!v.controllaTarga()) {
            // System.out.println("Targa non valida. Ingresso vietato.");
            throw new TargaNonValidaException(String.format("Targa non valida. Ingresso vietato per %s.", v.getTarga()));
        } else {
            veicoli[coda] = v;
            riemp++;
            coda = (coda + 1) % veicoli.length;
        }

    }

    @Override
    public Veicolo esce() throws AutorimessaVuotaException{
        if (autorimessaVuota()) {
            // System.out.println("Autorimessa vuota. Uscita vietata.");
            // return null;
            throw new AutorimessaVuotaException("Autorimessa vuota. Uscita vietata.");
        } else {
            Veicolo v = veicoli[testa];
            veicoli[testa] = null;
            testa = (testa + 1) % veicoli.length;
            riemp--;
            return v;
        }
    }
  
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Veicoli presenti:\n");
        for (int i = 0; i < riemp; i++) {
            sb.append(veicoli[(testa + i) % veicoli.length].toString());
        }
        return super.toString() + sb.toString();
    }

}