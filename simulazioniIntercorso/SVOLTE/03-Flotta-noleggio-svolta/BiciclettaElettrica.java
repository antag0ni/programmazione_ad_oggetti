
public class BiciclettaElettrica extends Mezzo implements Elettrico {

    private final int batteriaWh;
    private int livelloBatteria;

    public BiciclettaElettrica(String codice, String modello, int annoImmatricolazione, int batteriaWh, int livelloBatteria) {
        super(codice, modello, annoImmatricolazione);
        this.batteriaWh = batteriaWh;
        this.livelloBatteria = livelloBatteria;
        if (batteriaWh <= 0 || livelloBatteria < 0 || livelloBatteria > 100) {
            throw new IllegalArgumentException();
        } 
    }

    public int getBatteriaWh() {
        return batteriaWh;
    }

    @Override
    public int getLivelloBatteria() {
        return livelloBatteria;
    }

    @Override
    public void ricarica(int ricarica) {
        int tot = livelloBatteria + ricarica;
        if (tot > 100) {
            this.livelloBatteria = 100;
        } else if (ricarica < 0) {
            throw new IllegalArgumentException();
        } else {
            this.livelloBatteria = tot;
        }
    }

    @Override
    public double calcolaCostoNoleggio(int ore) {
        if (ore <= 0) {
            throw new IllegalArgumentException();
        }
        return 8.0 * ore;
    }

    @Override
    public String toString() {
        return super.toString() + "batteriaWh=" + batteriaWh + "\nlivelloBatteria=" + livelloBatteria + '\n';
    }
}
