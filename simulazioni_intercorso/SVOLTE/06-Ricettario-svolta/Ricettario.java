import java.util.*;

public class Ricettario {

    private final String nome;
    private final Set<Ricetta> ricette;

    public Ricettario(String nome) {
        ricette = new HashSet<>();
        this.nome = nome;
    }

    public void aggiungi(Ricetta ricetta) {
        for (Ricetta r : ricette) 
            if (r.getCodice().equalsIgnoreCase(ricetta.getCodice()))
                return;
        ricette.add(ricetta);
    }

    public int calorieTotali() {
        int sum = 0;
        for (Ricetta r : ricette) {
            sum += r.calcolaCalorieTotali();
        }
        return sum;
    }

    public Ricettario soloVegetariane() {
        Ricettario filtered = new Ricettario(nome + " - Vegetariane");
        for (Ricetta r : ricette) {
            if (r instanceof Vegetariana) {
                if (((Vegetariana)r).isVegetariana()) {
                    filtered.aggiungi(r);
                }
            }
        }
        return filtered;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("***" + nome + "***\n");
        Iterator<Ricetta> it = ricette.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString() + '\n');
        }
        return sb.toString();
    }
}
