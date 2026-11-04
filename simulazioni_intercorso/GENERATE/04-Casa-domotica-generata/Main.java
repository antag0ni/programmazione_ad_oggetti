// NON MODIFICARE

public class Main {

    public static void main(String[] args) {

        Casa casa = new Casa("Via Roma 10");

        Lampada lampada = new Lampada("L100", "Lampada soggiorno", 12, 800);
        Lampada lampada2 = new Lampada("L200", "Lampada camera", 9, 600);
        Termostato termostato =
                new Termostato("T100", "Termostato principale", 100, 21.5);

        casa.aggiungi(lampada);
        casa.aggiungi(lampada2);
        casa.aggiungi(termostato);

        lampada.connetti();
        termostato.connetti();

        System.out.println(casa);
        System.out.println("Consumo per 4 ore: "
                + casa.consumoTotale(4) + " Wh");

        System.out.println(casa.soloConnessi());

        try {
            new Lampada("ERR", "Lampada non valida", 10, 0);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception test: " + ex);
        }
    }
}
