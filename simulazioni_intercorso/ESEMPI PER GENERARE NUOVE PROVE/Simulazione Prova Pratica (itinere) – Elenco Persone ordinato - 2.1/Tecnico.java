/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leonardorundo
 */
import java.time.LocalDate;



public class Tecnico extends Persona implements Comparable<Persona> {

    

    private final String dipartimento;

    

    public Tecnico(String nome, LocalDate dataNascita, String codiceFiscale, String dipartimento) {

        super(nome, dataNascita, codiceFiscale);

        this.dipartimento = dipartimento;

    }

    

    public String getDipartimento() {

        return dipartimento;

    }

    

    @Override

    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(super.toString());

        stringBuffer.append("Dipartimento : ");

        stringBuffer.append(getDipartimento());

        stringBuffer.append("\n");

        return stringBuffer.toString();

    }
    
    /* Completare con altri metodi ed eventuali override */

    

}