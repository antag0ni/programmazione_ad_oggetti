// NON MODIFICARE

public class Main {

    public static void main(String[] args) {

        Centro centro = new Centro("Centro studio");

        Aula aula = new Aula("A100", "Aula Magna", 120, 1);
        Laboratorio laboratorio =
                new Laboratorio("L100", "Laboratorio informatico", 30, 20);
        Aula aulaPiccola = new Aula("A200", "Aula Piccola", 25, 2);

        centro.aggiungi(aula);
        centro.aggiungi(laboratorio);
        centro.aggiungi(aulaPiccola);

        try {
            aula.prenota(3);
            aula.prenota(2);
        } catch (PrenotazioneNonDisponibileException
                | DatiPrenotazioneException ex) {
            System.out.println("Prenotazione aula: " + ex.getMessage());
        }

        try {
            laboratorio.prenota(0);
        } catch (PrenotazioneNonDisponibileException
                | DatiPrenotazioneException ex) {
            System.out.println("Prenotazione laboratorio: " + ex.getMessage());
        }

        centro.prenotaDisponibili(2);

        System.out.println(centro);
        System.out.println("Costo totale: " + centro.costoTotale(2));
        System.out.println(centro.soloLiberi());
    }
}
