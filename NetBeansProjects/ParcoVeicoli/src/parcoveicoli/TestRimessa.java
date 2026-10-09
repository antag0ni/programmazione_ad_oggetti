/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcoveicoli;

import it.unisa.diem.oop.eccezioni.AutorimessaPienaException;
import it.unisa.diem.oop.eccezioni.AutorimessaVuotaException;
import it.unisa.diem.oop.eccezioni.BoxException;
import it.unisa.diem.oop.rimessa.Autorimessa;
import it.unisa.diem.oop.veicoli.Autovettura;
import it.unisa.diem.oop.veicoli.Camion;
import it.unisa.diem.oop.veicoli.Moto;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antagoni
 */
public class TestRimessa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Autorimessa autorimessa = new Autorimessa(5, "Parcheggio E1");
            
            // autorimessa.esce(); // AUTORIMESSA VUOTA
            
            
            autorimessa.entra(new Camion("sdf244", "Fiat CX45", "Gasolio", "TT656671", 4));
            // autorimessa.entra(new Camion("spl265", "Volvo PTG", "Gasolio", "YH96671", 6)); // TARGA NON VALIDA
            autorimessa.entra(new Autovettura("mk23t", "Fiat Punto", "Metano", "EA566FM", 5));
            // autorimessa.entra(new Autovettura("cgt612", "Fiat Idea", "Gasolio", "AQ9Y7UUU", 5)); // TARGA NON VALIDA
            autorimessa.entra(new Moto("das7896", "Honda Hornet", "Benzina", "AT51233", false));
            // autorimessa.entra(new Moto("gdt7896", "Suzuki Bandit", "Benzina", "AT5123N", false)); // TARGA NON VALIDA
            
            autorimessa.entra(new Camion("sdf244", "Fiat CX45", "Gasolio", "TT656671", 4));
            autorimessa.entra(new Camion("sdf244", "Fiat CX45", "Gasolio", "TT656671", 4));
            // autorimessa.entra(new Camion("sdf244", "Fiat CX45", "Gasolio", "TT656671", 4)); // AUTORIMESSA PIENA
            
            System.out.println(autorimessa);
        } catch (BoxException ex) {
            System.err.println(ex);
        }
    }
    
}
