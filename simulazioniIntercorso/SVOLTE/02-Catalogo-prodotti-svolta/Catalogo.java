import java.util.Set;
import java.util.TreeSet;

public class Catalogo {

    private final String nome;
    private final Set<Prodotto> catalogo;

    public Catalogo(String nome) {
        this.nome = nome;
        catalogo = new TreeSet<>();
    }

    public void aggiungi(Prodotto p) {
        for (Prodotto prodotto : catalogo) {
            if (p.getCodice().equals(prodotto.getCodice())) {
                return;
            }
        }
        catalogo.add(p);
    }

    public Catalogo soloAlimentari() {
        Catalogo filtered = new Catalogo(nome+" - Alimentari");
        for (Prodotto p : catalogo) {
            if (p instanceof Alimentare) {
                Alimentare a = (Alimentare)p;
                filtered.aggiungi(a);
            }
        }
        return filtered;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s%n", nome));
        for (Prodotto p : catalogo) {
            sb.append(p.toString());
        }
        return sb.toString();
    }
}
