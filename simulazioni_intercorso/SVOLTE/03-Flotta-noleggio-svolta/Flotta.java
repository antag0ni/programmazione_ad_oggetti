import java.util.*;

public class Flotta {

    private final String nome;
    private final Set<Mezzo> mezzi;

    public Flotta(String nome) {
        mezzi = new TreeSet<>();
        this.nome = nome;
    }

    public void aggiungi(Mezzo mezzo) {
        for (Mezzo m : mezzi) {
            if (m.getCodice().equals(mezzo.getCodice()))
                return;
        } 
        mezzi.add(mezzo);
    }

    public double costoTotaleNoleggio(int ore) {
        double sum = 0;
        for (Mezzo mezzo : mezzi) {
            sum += mezzo.calcolaCostoNoleggio(ore);
        }
        return sum;
    }

    public Flotta soloElettrici() {
        Flotta filtered = new Flotta(nome + " - Elettrici");
        for (Mezzo mezzo : mezzi) {
            if (mezzo instanceof Elettrico) {
                filtered.aggiungi(mezzo);
            }
        }
        return filtered;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s%n", nome));
        for (Mezzo mezzo : mezzi) {
            sb.append(String.format("%s", mezzo.toString() ));
        }
        return sb.toString();
    }
}
