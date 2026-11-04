public interface Prenotabile {

    void prenota(int ore)
            throws PrenotazioneNonDisponibileException, DatiPrenotazioneException;

    void libera();

    boolean isOccupata();
}
