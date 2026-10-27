// NON MODIFICARE

public class Main {

    public static void main(String[] args) {

        Ricettario ricettario = new Ricettario("Ricettario di famiglia");

        try {
            RicettaSalata pasta = new RicettaSalata(
                    "R001", "Pasta al pomodoro", 4, 320, 3, true);
            RicettaSalata lasagna = new RicettaSalata(
                    "R002", "Lasagna", 6, 540, 5, false);
            Dolce torta = new Dolce(
                    "D001", "Torta di mele", 8, 280, 35);

            ricettario.aggiungi(pasta);
            ricettario.aggiungi(lasagna);
            ricettario.aggiungi(torta);

            System.out.println(ricettario);
            System.out.println("Calorie totali: "
                    + ricettario.calorieTotali());
            System.out.println(ricettario.soloVegetariane());
        } catch (RicettaNonValidaException ex) {
            System.out.println("Errore ricetta: " + ex.getMessage());
        }

        try {
            new Dolce("ERR", "Dolce non valido", 0, -10, 20);
        } catch (RicettaNonValidaException ex) {
            System.out.println("Exception test: " + ex.getMessage());
        }
    }
}
