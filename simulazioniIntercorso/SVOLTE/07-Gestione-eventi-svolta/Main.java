// NON MODIFICARE

public class Main {

    public static void main(String[] args) {

        Calendario calendario = new Calendario("Centro culturale");

        try {
            Concerto concerto = new Concerto(
                    "C001", "Concerto jazz", 120, 3, 25.0);
            Conferenza conferenza = new Conferenza(
                    "C002", "Introduzione a Java", 90, 3, 100.0);

            concerto.impostaOnline(true);
            calendario.aggiungi(concerto);
            calendario.aggiungi(conferenza);

            concerto.iscrivi("Anna");
            concerto.iscrivi("Luca");
            conferenza.iscrivi("Marco");

            System.out.println(calendario);
            System.out.println("Costo totale: "
                    + calendario.costoTotale());
            System.out.println(calendario.soloOnline());

            calendario.iscriviPartecipante("Sara");

            try {
                concerto.iscrivi("Paolo");
            } catch (EventoNonDisponibileException ex) {
                System.out.println("Evento non disponibile: "
                        + ex.getMessage());
            }

            concerto.annullaIscrizione("Anna");
            try {
                concerto.annullaIscrizione("Anna");
            } catch (EventoNonDisponibileException ex) {
                System.out.println("Annullamento non disponibile: "
                        + ex.getMessage());
            }
        } catch (EventoNonDisponibileException ex) {
            System.out.println("Evento non disponibile: "
                    + ex.getMessage());
        } catch (DatiEventoException ex) {
            System.out.println("Dati evento non validi: "
                    + ex.getMessage());
        }

        try {
            new Conferenza("ERR", "Evento non valido", 0, 10, 50.0);
        } catch (DatiEventoException ex) {
            System.out.println("Exception test: " + ex.getMessage());
        }
    }
}
