import java.time.LocalDate;

public class ProdottoNonAlimentare extends Prodotto {
  /* completare con eventuali attributi */
    private final String materiale;

    public ProdottoNonAlimentare(String codice, String descrizione, double prezzo, String materiale) {
        /* completare */
        super(codice, descrizione, prezzo);
        this.materiale = materiale;
    }

    public boolean isRiciclabile() {
       /*completare*/
       return this.materiale.equals("cotone");
   }   
   
    /* completare implementando altri metodi se necessario */
   
    public String getMateriale() {return this.materiale;}
    
    @Override
    public double applicaSconto() {
        return (this.isRiciclabile()) ? this.getPrezzo() * 0.9 : this.getPrezzo();
    }

    @Override
    public String toString() {
        /*completare */
        return super.toString() + "\nmateriale=" + materiale;
    }

}