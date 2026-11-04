import java.util.*;


public abstract class Dispositivo implements Comparable<Dispositivo> {

    private final String codice;
    private final String nome;
    private final int potenzaWatt;

    protected Dispositivo(String codice, String nome, int potenzaWatt) {
        this.codice = codice;
        this.nome = nome;
        this.potenzaWatt = potenzaWatt;
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public int getPotenzaWatt() {
        return potenzaWatt;
    }

    public abstract double consumo(int ore);

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getCodice());
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Dispositivo)) return false;

        Dispositivo that = (Dispositivo)obj;
        return Objects.equals(this.getCodice(), that.getCodice());
    }

    @Override
    public final int compareTo(Dispositivo altro) {
        int compare = this.getNome().compareToIgnoreCase(altro.getNome());
        if (compare == 0) {
            return this.getCodice().compareTo(altro.getCodice());
        }
        return compare;
        // potrebbe avere lo stesso codice
    }

    @Override
    public String toString() {
        return String.format("codice=%s%nnome=%s%npotenza=%s%n", codice, nome, potenzaWatt);
    }
}
