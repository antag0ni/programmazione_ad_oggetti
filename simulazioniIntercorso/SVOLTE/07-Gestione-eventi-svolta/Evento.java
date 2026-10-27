import java.util.Objects;

public abstract class Evento implements Comparable<Evento> {

    private final String codice;
    private final String titolo;
    private final int durataMinuti;
    private final int postiMassimi;

    public Evento(String codice, String titolo, int durataMinuti, int postiMassimi) throws DatiEventoException{
        this.codice = codice;
        this.titolo = titolo;
        this.durataMinuti = durataMinuti;
        this.postiMassimi = postiMassimi;
        if (codice == null || codice.isEmpty() || titolo == null || titolo.isEmpty() || durataMinuti <= 0 || postiMassimi <= 0) {
            throw new DatiEventoException("Dati inseriti non validi");
        }
    }

    public String getCodice() {
        return codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getDurataMinuti() {
        return durataMinuti;
    }

    public int getPostiMassimi() {
        return postiMassimi;
    }

    public abstract double calcolaCosto();

    @Override 
    public final int hashCode() {
        return Objects.hashCode(getCodice().toLowerCase());
    }

    @Override 
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Evento)) return false;
        if (obj == this) return true;
        Evento that = (Evento)obj;
        return Objects.equals(this.getCodice().toLowerCase(), that.getCodice().toLowerCase());
    }

    @Override 
    public final int compareTo(Evento other) {
        int result = this.getTitolo().compareToIgnoreCase(other.getTitolo());
        if (result == 0) {
            return this.getCodice().compareToIgnoreCase(other.getCodice());
        }
        return result;
    }

    @Override 
    public String toString() {
        return String.format("codice=%s%ntitolo=%s%ndurataMinuti=%d%npostiMassimi=%d%n", codice, titolo, durataMinuti, postiMassimi);
    }

}