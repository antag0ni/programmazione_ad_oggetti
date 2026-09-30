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
public class Tecnico extends PersonaUnisa {
    
    private String dipartimento;
    
    public Tecnico(String nome, String cognome, String codiceFiscale, String matricola, String dipartimento) {
        super(nome, cognome, codiceFiscale, matricola);
        this.dipartimento = dipartimento;
    }
    
    public String getDipartimento() { return dipartimento; }
    public void setDipartimento(String insegnamento) { this.dipartimento = dipartimento; }

    @Override
    public String getRuolo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Tecnico";
    }
    
    @Override
    public String toString() {
        return super.toString() + "Dipartimento: " + dipartimento;
    }
}
