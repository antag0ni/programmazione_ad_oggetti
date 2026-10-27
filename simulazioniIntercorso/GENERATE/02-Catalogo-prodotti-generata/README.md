# Simulazione: catalogo di prodotti ordinato

Completare le classi Java presenti nella cartella senza modificare `Main.java`.

## Traccia

Realizzare un catalogo di prodotti ordinato alfabeticamente e privo di duplicati.
Nel catalogo possono essere presenti prodotti generici e prodotti appartenenti a una
categoria specifica.

### Classe `Prodotto`

La classe rappresenta un prodotto e deve contenere:

- il codice univoco del prodotto, rappresentato da una `String`;
- il nome del prodotto, rappresentato da una `String`;
- il prezzo, rappresentato da un `double`.

Il costruttore deve inizializzare gli attributi. Implementare i metodi getter presenti
nello scheletro.

Due prodotti sono considerati uguali quando hanno lo stesso codice. Implementare quindi
correttamente `equals` e `hashCode`.

La classe deve implementare `Comparable<Prodotto>`. Il confronto naturale deve ordinare
i prodotti prima per nome e, quando i nomi coincidono, per codice. Implementare
`compareTo` rispettando questo criterio.

Il metodo `toString` deve restituire una rappresentazione leggibile del prodotto.

### Classe `Alimentare`

La classe rappresenta un prodotto alimentare e deve estendere `Prodotto`. Deve aggiungere
l'attributo:

- la data di scadenza, rappresentata da un `LocalDate`.

Il costruttore deve ricevere tutti gli attributi necessari, compresi quelli ereditati.
Implementare il getter e ridefinire `toString` includendo anche la data di scadenza.

### Classe `Catalogo`

La classe rappresenta un catalogo identificato da un nome e contiene una collezione di
oggetti `Prodotto`, inclusi gli eventuali `Alimentare`.

La collezione deve:

- evitare duplicati secondo il codice del prodotto;
- mantenere i prodotti nell'ordine naturale definito da `compareTo`.

Il metodo `aggiungi` deve inserire un prodotto nel catalogo.
Se è già presente un prodotto con lo stesso codice, il metodo non deve inserire un
duplicato.

Il metodo `soloAlimentari` deve restituire un nuovo `Catalogo`, con nome
`<nome originale> - Alimentari`, contenente soltanto gli oggetti di tipo `Alimentare`.
Il catalogo originale non deve essere modificato.

Il metodo `toString` deve riportare il nome del catalogo e tutti i prodotti nell'ordine
in cui vengono restituiti dalla collezione.

## Vincoli

- Usare `java.time.LocalDate` per le date.
- Non modificare `Main.java`.
- Mantenere le firme dei metodi già presenti negli scheletri.
- Usare una collezione standard coerente con i requisiti di unicità e ordinamento.
- Gestire correttamente il confronto tra oggetti e la verifica dei codici duplicati.

Il file `Main.java` crea prodotti generici e alimentari, li inserisce nel catalogo e
stampa il catalogo completo e quello filtrato. Compilare ed eseguire il programma dopo
aver completato gli scheletri.
