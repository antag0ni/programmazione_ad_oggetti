public class Aula extends Spazio implements Prenotabile {

    private final int piano;
    private boolean occupata;

    public Aula(String codice, String nome, int capienza, int piano) {
        super(codice, nome, capienza);
        if (piano < 0) {
            throw new IllegalArgumentException("Piano non valido");
        }
        this.piano = piano;
    }

    public int getPiano() {
        return piano;
    }

    @Override
    public void prenota(int ore) throws PrenotazioneNonDisponibileException, DatiPrenotazioneException {
        if (ore <= 0) {
            throw new DatiPrenotazioneException("Numero di ore non valido");
        }
        if (occupata) {
            throw new PrenotazioneNonDisponibileException("Aula già occupata");
        }
        occupata = true;
    }

    @Override
    public void libera() {
        occupata = false;
    }

    @Override
    public boolean isOccupata() {
        return occupata;
    }

    @Override
    public double calcolaCosto(int ore) {
        if (ore <= 0) {
            throw new IllegalArgumentException("Numero di ore non valido");
        }
        return 10.0 * ore + 2.0 * piano;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("piano=%d%noccupata=%b%n", piano, occupata);
    }
}
