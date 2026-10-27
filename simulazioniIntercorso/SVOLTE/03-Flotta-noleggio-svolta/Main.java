// NON MODIFICARE

public class Main {

    public static void main(String[] args) {

        Flotta flotta = new Flotta("City Rent");

        Auto auto1 = new Auto("A100", "City Car", 2022, 4);
        Auto auto2 = new Auto("A200", "Station Wagon", 2021, 5);
        BiciclettaElettrica bici =
                new BiciclettaElettrica("B100", "Urban Bike", 2024, 500, 40);

        flotta.aggiungi(auto1);
        flotta.aggiungi(auto2);
        flotta.aggiungi(bici);

        System.out.println(flotta);
        System.out.println("Costo per 3 ore: "
                + flotta.costoTotaleNoleggio(3));

        bici.ricarica(35);
        System.out.println("Batteria dopo la ricarica: "
                + bici.getLivelloBatteria() + "%");

        System.out.println(flotta.soloElettrici());

        try {
            new Auto("ERR", "Errore", 2025, 1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception test: " + ex);
        }
    }
}
