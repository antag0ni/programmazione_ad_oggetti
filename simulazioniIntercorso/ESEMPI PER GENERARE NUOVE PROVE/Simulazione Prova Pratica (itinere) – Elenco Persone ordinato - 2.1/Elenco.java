/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Inserire import */
import java.util.*;

/**
 *
 * @author leonardorundo
 */
public class Elenco {
    
    /* Dichiarazione della Collection incapsulata */

    Set<Persona> elenco;

   /* Costruttore */
   public Elenco() {
       elenco = new HashSet<>();
   }
    

    public void aggiungi(Persona persona) {

        elenco.add(persona);

    }

    

    @Override

    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("L'elenco è formato da: \n");

        for (Persona persona : elenco) {

            stringBuffer.append(persona + "\n");

        }

        return stringBuffer.toString();

    }
    
}
