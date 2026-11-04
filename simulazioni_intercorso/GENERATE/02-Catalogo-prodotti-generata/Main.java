// NON MODIFICARE

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo("Emporio universitario");

        for (int i = 0; i < 10; i++) {
            catalogo.aggiungi(creaProdottoCasuale());
        }

        System.out.println(catalogo);
        System.out.println(catalogo.soloAlimentari());
    }

    private static Prodotto creaProdottoCasuale() {

        Random random = new Random();

        String[] nomi = {
            "Mela", "Pane", "Pasta", "Quaderno", "Penna",
            "Caffe", "Biscotti", "Zaino", "Latte", "Riso"
        };

        String codice = UUID.randomUUID()
                .toString()
                .replace("-", "")
                .substring(0, 8);

        String nome = nomi[random.nextInt(nomi.length)];
        double prezzo = 1 + random.nextInt(100);

        if (random.nextInt(2) == 0) {
            return new Alimentare(
                    codice,
                    nome,
                    prezzo,
                    LocalDate.of(
                            2027 + random.nextInt(3),
                            1 + random.nextInt(12),
                            1 + random.nextInt(27)));
        }

        return new Prodotto(codice, nome, prezzo);
    }
}
