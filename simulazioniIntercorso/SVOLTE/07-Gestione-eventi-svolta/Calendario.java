import java.util.*;

public class Calendario {
    private final String nome;
    private final Set<Evento> eventi;

    public Calendario(String nome) {
        eventi = new TreeSet<>();
        this.nome = nome;
    }

    public void aggiungi(Evento evento) {
        for (Evento e : eventi) 
            if (evento.getCodice().equalsIgnoreCase(e.getCodice()))                return;
        eventi.add(evento);
    }

    public void iscriviPartecipante(String partecipante) {
        for (Evento evento : eventi) {
            if (evento instanceof Iscrivibile) {
                try {
                    ((Iscrivibile)evento).iscrivi(partecipante);
                } catch (EventoNonDisponibileException | DatiEventoException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }


    public double costoTotale() {
        double sum = 0;
        for (Evento evento : eventi) {
            sum += evento.calcolaCosto();
        }
        return sum;
    }

    public Calendario soloOnline() {
        Calendario filtered = new Calendario(nome + " - Online");
        for (Evento evento : eventi) {
            if (evento instanceof Online) {
                Online online = (Online)evento;
                if (online.isOnline()) {
                    filtered.aggiungi(evento);
                }
            }
        }
        return filtered;
    }

    @Override 
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome + '\n');
        for (Evento evento : eventi) {
            sb.append(evento);
        }
        return sb.toString();
    }
}