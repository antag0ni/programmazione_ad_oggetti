import java.util.*;


public abstract class Mezzo implements Comparable<Mezzo> {

    private final String codice;
    private final String modello;
    private final int annoImmatricolazione;

    protected Mezzo(String codice, String modello, int annoImmatricolazione) {
        this.codice = codice;
        this.modello = modello;
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public String getCodice() {
        return codice;
    }

    public String getModello() {
        return modello;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public abstract double calcolaCostoNoleggio(int ore);

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodice());
    }

    @Override
    public final boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Mezzo)) return false;

        Mezzo that = (Mezzo)o;
        return Objects.equals(this.getCodice(), that.getCodice());
    }

    @Override
    public final int compareTo(Mezzo altro) {
        if (this.getModello().equalsIgnoreCase(altro.getModello())) {
            return this.getCodice().compareToIgnoreCase(altro.getCodice());
        }
        return this.getModello().compareToIgnoreCase(altro.getModello());

        // Potrebbero avere lo stesso codice
    }

    @Override
    public String toString() {
        return String.format("codice=%s%nmodello=%s%ndataImmatricolazione=%d%n", codice, modello, annoImmatricolazione);
    }
}
