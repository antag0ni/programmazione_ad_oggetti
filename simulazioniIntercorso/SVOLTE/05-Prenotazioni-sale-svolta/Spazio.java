import java.util.Objects;


public abstract class Spazio implements Comparable<Spazio> {

    private final String codice;
    private final String nome;
    private final int capienza;

    protected Spazio(String codice, String nome, int capienza) {
        this.codice = codice;
        this.nome = nome;
        this.capienza = capienza;
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public int getCapienza() {
        return capienza;
    }

    public abstract double calcolaCosto(int ore);

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodice().toLowerCase());
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(this instanceof Spazio)) return false;

        Spazio s = (Spazio)obj;
        return this.getCodice().equalsIgnoreCase(s.getCodice());
    }

    @Override
    public final int compareTo(Spazio altro) {
        int result = this.getNome().compareToIgnoreCase(altro.getNome());
        if (result == 0) {
            return this.getCodice().compareToIgnoreCase(altro.getCodice());
        }
        return result;
        // potrebbero avere lo stesso codice
    }

    @Override
    public String toString() {
        return String.format("codice=%s%nnome=%s%ncapienza=%d%n", codice, nome, capienza);
    }
}
