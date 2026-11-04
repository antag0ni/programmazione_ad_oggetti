import java.util.Set;
import java.util.HashSet;

public class Conferenza extends Evento implements Iscrivibile {
    
    private final double costoFisso;
    private final Set<String> partecipanti;

    public Conferenza (String codice, String titolo, int durataMinuti, int postiMassimi, double costoFisso) throws DatiEventoException {
        super(codice, titolo, durataMinuti, postiMassimi);
        this.costoFisso = costoFisso;
        if (codice == null || codice.isEmpty() || titolo == null || titolo.isEmpty() || durataMinuti <= 0 || postiMassimi <= 0 || costoFisso < 0) {
            throw new DatiEventoException("Dati inseriti non validi");
        }
        partecipanti = new HashSet<>();
    }

    public double getCostoFisso() {
        return costoFisso;
    }

    @Override 
    public double calcolaCosto() {
        return costoFisso + 5.0 * numeroIscritti();
    }

    @Override 
    public void iscrivi(String partecipante) throws EventoNonDisponibileException, DatiEventoException {
        if (partecipante == null || partecipante.isEmpty()) {
            throw new DatiEventoException("Nome non valido");
        }
        if (partecipanti.contains(partecipante)) {
            return;
        }
        if (numeroIscritti() >= this.getPostiMassimi()) {
            throw new EventoNonDisponibileException("Evento pieno");
        }
        partecipanti.add(partecipante);
    }

    @Override 
    public void annullaIscrizione(String partecipante) throws EventoNonDisponibileException, DatiEventoException {
        if (partecipante == null || partecipante.isEmpty()) {
            throw new DatiEventoException("Nome non valido");
        }
        if (!(partecipanti.contains(partecipante))) {
            throw new EventoNonDisponibileException("Partecipante non presente");
        }
        partecipanti.remove(partecipante);
    }

    @Override 
    public int numeroIscritti(){
        return partecipanti.size();
    }

    @Override 
    public String toString() {
        return super.toString() + String.format("iscritti=%d%ncostoFisso=%.1f%n", numeroIscritti(), costoFisso);
    }
}