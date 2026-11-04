import java.util.*;

public class Centro {

    private final String nome;
    private final Set<Spazio> spazi;

    public Centro(String nome) {
        spazi = new TreeSet<>();
        this.nome = nome;
    }

    public void aggiungi(Spazio s) {
        Iterator<Spazio> it = spazi.iterator();
        while (it.hasNext()) 
            if (it.next().getCodice().equalsIgnoreCase(s.getCodice()))
                return;
        spazi.add(s);
    }

    public void prenotaDisponibili(int ore) {
        Iterator<Spazio> it = spazi.iterator();
        while (it.hasNext()) {
            Spazio spazio = it.next();
            if (spazio instanceof Prenotabile) {
                if (((Prenotabile)spazio).isOccupata() == false) {
                    try {
                        ((Prenotabile)spazio).prenota(ore);
                    } catch (PrenotazioneNonDisponibileException | DatiPrenotazioneException ex) {
                        ex.getMessage();
                    }
                }
            }
        }
    }

    public double costoTotale(int ore) {
        double sum = 0;
        Iterator<Spazio> it = spazi.iterator();
        while (it.hasNext()) {
            Spazio spazio = it.next();
            if (spazio instanceof Prenotabile) {
                if (((Prenotabile)spazio).isOccupata()) {
                    sum += spazio.calcolaCosto(ore);
                }
            }
        }
        return sum;
    }

    public Centro soloLiberi() {
        Centro filtered = new Centro(nome + " - Liberi");
        for (Spazio spazio : spazi) {
            if (spazio instanceof Prenotabile) {
                if (((Prenotabile)spazio).isOccupata() == false) {
                    filtered.aggiungi(spazio);
                }
            }
        }
        return filtered;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome+'\n');
        for (Spazio s : spazi) {
            sb.append(s.toString());
        }
        return sb.toString();
    }
}
