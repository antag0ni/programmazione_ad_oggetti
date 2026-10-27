import java.time.LocalDate;


public class Alimentare extends Prodotto {

    private final LocalDate dataScadenza;

    public Alimentare(String codice, String nome, double prezzo, LocalDate dataScadenza) {
        super(codice, nome, prezzo);
        this.dataScadenza = dataScadenza;
    }

    public LocalDate getDataScadenza() {
        return dataScadenza;
    }

    @Override
    public String toString() {
        return super.toString() + "  dataScadenza=" + dataScadenza + '\n';
    }
}
