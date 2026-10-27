import java.util.Objects;


public abstract class Ricetta implements Comparable<Ricetta> {

    private final String codice;
    private final String nome;
    private final int porzioni;

    protected Ricetta(String codice, String nome, int porzioni) throws RicettaNonValidaException {
        this.codice = codice;
        this.nome = nome;
        this.porzioni = porzioni;
        if (codice == null || nome == null || codice.isEmpty() || nome.isEmpty() || porzioni <= 0) {
            throw new RicettaNonValidaException("Argomenti non validi");
        }
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public int getPorzioni() {
        return porzioni;
    }

    public abstract int calcolaCalorieTotali();

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodice().toLowerCase());
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Ricetta)) return false;
        if (this == obj) return true;
        Ricetta that = (Ricetta)obj;
        return this.getCodice().equalsIgnoreCase(that.getCodice());
    }

    @Override
    public final int compareTo(Ricetta altra) {
        int result = this.getNome().compareToIgnoreCase(altra.getNome());
        if (result == 0) {
            return this.getCodice().compareToIgnoreCase(altra.getCodice());
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("codice=%s%nnome=%s%nporzioni=%d%n", codice, nome ,porzioni);
    }
}
