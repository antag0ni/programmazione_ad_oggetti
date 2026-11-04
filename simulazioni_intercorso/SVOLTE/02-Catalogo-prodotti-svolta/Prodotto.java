import java.util.Objects; 


public class Prodotto implements Comparable<Prodotto> {

    private final String codice;
    private final String nome;
    private final double prezzo;

    public Prodotto(String codice, String nome, double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getCodice());
    }

    @Override
    public final boolean equals(Object o) {
        if (o == null || !(o instanceof Prodotto)) return false;
        if (this == o) return true;
        Prodotto p = (Prodotto)o;
        return Objects.equals(this.getCodice(), p.getCodice());
    }

    @Override
    public final int compareTo(Prodotto altro) {
        if (altro.getNome().equals(this.getNome())) {
            return this.getCodice().compareTo(altro.getCodice());
        } else {
            return this.getNome().compareTo(altro.getNome());
        }
    }

    @Override
    public String toString() {
        return String.format("***PRODOTTO***%n  nome=%s%n  codice=%s%n  prezzo=%.2f%n", nome, codice, prezzo);
    }
}
