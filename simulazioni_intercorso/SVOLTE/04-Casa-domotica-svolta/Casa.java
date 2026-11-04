import java.util.*;

public class Casa {

    private final String indirizzo;
    private final Set<Dispositivo> dispositivi;

    public Casa(String indirizzo) {
        dispositivi = new TreeSet<>();
        this.indirizzo = indirizzo;
    }

    public void aggiungi(Dispositivo d) {
        for (Dispositivo i : dispositivi)
            if (i.getCodice().equals(d.getCodice()))
                return;
        dispositivi.add(d);
    }

    public double consumoTotale(int ore) {
        double sum = 0;
        for (Dispositivo d : dispositivi) 
            if (d instanceof Connettibile && ((Connettibile)d).isConnesso()) {
                sum += d.consumo(ore);
            }
        return sum;
    }

    public Casa soloConnessi() {
        Casa filtered = new Casa(indirizzo + " - Connessi");
        for (Dispositivo d : dispositivi) {
            if (d instanceof Connettibile) {
                Connettibile c = (Connettibile)d;
                if (c.isConnesso()) {
                    filtered.aggiungi(d);
                }
            }
        }
        return filtered;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(indirizzo+'\n');
        for (Dispositivo d : dispositivi) {
            sb.append(d.toString());
        }
        return sb.toString();
    }
}
