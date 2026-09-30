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
public class Docente extends PersonaUnisa {
    private String insegnamento;
    
    public Docente(String nome, String cognome, String codiceFiscale, String matricola, String insegnamento) {
        super(nome, cognome, codiceFiscale, matricola);
        this.insegnamento = insegnamento;
    }

    @Override
    public String getRuolo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Docente";
    }
    
    public String getInsegnamento() { return insegnamento; }
    public void setInsegnamento(String insegnamento) { this.insegnamento = insegnamento; }
    
    @Override
    public String toString() {
        return super.toString() + "Insegnamento: " + insegnamento;
    }
    
}
 