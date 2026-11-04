public class Auto extends Mezzo {

    private final int posti;

    public Auto(String codice, String modello, int annoImmatricolazione, int posti) {
        super(codice, modello, annoImmatricolazione);
        this.posti = posti;
        if (getPosti() < 2) {
            throw new IllegalArgumentException();
        }
    }

    public int getPosti() {
        return posti;
    }

    @Override
    public double calcolaCostoNoleggio(int ore) {
        if (ore <= 0) {
            throw new IllegalArgumentException();
        }
        if (posti <= 4) {
            return 25.0 * ore;
        } else {
            return 35.0 * ore;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "posti=" + posti + '\n';
    }
}
