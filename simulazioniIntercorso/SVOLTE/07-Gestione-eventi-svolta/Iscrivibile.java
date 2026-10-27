public interface Iscrivibile {
    void iscrivi(String partecipante) throws EventoNonDisponibileException, DatiEventoException;
    void annullaIscrizione(String partecipante) throws EventoNonDisponibileException, DatiEventoException;
    int numeroIscritti();
}