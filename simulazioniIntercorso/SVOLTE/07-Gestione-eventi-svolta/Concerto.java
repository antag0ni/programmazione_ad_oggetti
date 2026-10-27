import java.util.Set;
import java.util.HashSet;

public class Concerto extends Evento implements Iscrivibile, Online {
    
    private final double prezzoBiglietto;
    private final Set<String> partecipanti;
    private boolean online;

    public Concerto (String codice, String titolo, int durataMinuti, int postiMassimi, double prezzoBiglietto) throws DatiEventoException {
        super(codice, titolo, durataMinuti, postiMassimi);
        this.prezzoBiglietto = prezzoBiglietto;
        this.online = false;
        if (codice == null || codice.isEmpty() || titolo == null || titolo.isEmpty() || durataMinuti <= 0 || postiMassimi <= 0 || prezzoBiglietto < 0) {
            throw new DatiEventoException("Dati inseriti non validi");
        }
        partecipanti = new HashSet<>();
    }

    public double getPrezzoBiglietto() {
        return prezzoBiglietto;
    }

    @Override
    public boolean isOnline() {
        return online;
    }

    @Override 
    public void impostaOnline(boolean online) {
        this.online = online;
    }

    @Override 
    public double calcolaCosto() {
        return prezzoBiglietto * numeroIscritti();
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
        return super.toString() + String.format("iscritti=%d%nonline=%b%nprezzoBiglietto=%.1f%n", numeroIscritti(), online, prezzoBiglietto);
    }
}