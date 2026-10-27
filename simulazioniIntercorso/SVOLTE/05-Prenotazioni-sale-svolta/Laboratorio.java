public class Laboratorio extends Spazio implements Prenotabile {

    private final int numeroComputer;
    private boolean occupata;

    public Laboratorio(String codice, String nome, int capienza, int numeroComputer) {
        super(codice, nome, capienza);
        if (numeroComputer <= 0) {
            throw new IllegalArgumentException("Numero di computer non valido");
        }
        this.numeroComputer = numeroComputer;
    }

    public int getNumeroComputer() {
        return numeroComputer;
    }

    @Override
    public void prenota(int ore) throws PrenotazioneNonDisponibileException, DatiPrenotazioneException {
        if (ore <= 0) {
            throw new DatiPrenotazioneException("Numero di ore non valido");
        }
        if (occupata) {
            throw new PrenotazioneNonDisponibileException("Laboratorio già occupato");
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
        return 18.0 * ore + 3.0 * numeroComputer;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("numeroComputer=%d%noccupata=%b%n", numeroComputer, occupata);
    }
}
