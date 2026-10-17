import java.time.LocalDate;

/**
 *
 */
public class ProdottoAlimentare extends Prodotto {
    private final LocalDate dataScadenza;

    public ProdottoAlimentare(String codice, String descrizione, double prezzo, LocalDate dataScadenza) {
        /*completare */
        super(codice, descrizione, prezzo);
        this.dataScadenza = dataScadenza;
    }

    /* completare implementando ulteriori metodi se necessario */

    public LocalDate getDataScadenza() {return dataScadenza;}
    
    @Override
    public double applicaSconto() {
        return (LocalDate.now().isBefore(this.getDataScadenza()) && LocalDate.now().isAfter(this.getDataScadenza().minusDays(10))) ? this.getPrezzo() * 0.8 : this.getPrezzo();
    }

    @Override
    public String toString() {
        /* completare */
        return super.toString() + "\ndata scadenza=" + dataScadenza;
    }
    
}