# Simulazione: gestione di un ricettario

Completare le classi Java presenti nella cartella senza modificare `Main.java`.

La soluzione deve essere compatibile con **Java 8**.

## Traccia

Realizzare un ricettario che contiene ricette di tipo diverso. Il ricettario deve usare
un `HashSet` per evitare ricette duplicate.

### Eccezione `RicettaNonValidaException`

Creare una classe che estenda `Exception`.

L'eccezione deve essere usata quando si tenta di creare una ricetta con dati non validi.
Deve contenere un costruttore che riceve un messaggio `String`.

### Interfaccia `Vegetariana`

L'interfaccia deve dichiarare:

- `boolean isVegetariana()`;
- `void impostaVegetariana(boolean vegetariana)`.

### Classe astratta `Ricetta`

La classe deve contenere:

- un codice identificativo;
- il nome;
- il numero di porzioni.

Deve:

- essere astratta;
- implementare `Comparable<Ricetta>`;
- ordinare le ricette per nome crescente e, a parità di nome, per codice crescente;
- considerare uguali due ricette con lo stesso codice, senza distinguere maiuscole e
  minuscole;
- implementare `hashCode` in modo coerente con `equals`;
- dichiarare il metodo astratto `calcolaCalorieTotali()`;
- fornire getter e `toString`.

Il codice e il nome non possono essere nulli o vuoti e il numero di porzioni deve essere
positivo. In caso di dati non validi il costruttore deve lanciare
`RicettaNonValidaException`.

### Classe `RicettaSalata`

Deve estendere `Ricetta` e implementare `Vegetariana`.

Deve contenere:

- il numero di grammi di sale;
- le calorie per porzione;
- il valore booleano che indica se è vegetariana.

Le calorie totali devono essere calcolate come:

```text
caloriePerPorzione * numeroPorzioni
```

Il numero di grammi di sale deve essere maggiore o uguale a zero.

### Classe `Dolce`

Deve estendere `Ricetta`. Deve contenere:

- le calorie per porzione;
- la quantità di zucchero in grammi.

Le calorie totali devono essere calcolate come:

```text
caloriePerPorzione * numeroPorzioni
```

Le calorie per porzione e lo zucchero devono essere non negativi.

### Classe `Ricettario`

La classe deve contenere:

- un nome;
- un `HashSet<Ricetta>`.

Implementare:

- `aggiungi(Ricetta ricetta)`: aggiunge la ricetta se il codice non è già presente;
- `calorieTotali()`: restituisce la somma delle calorie di tutte le ricette;
- `soloVegetariane()`: restituisce un nuovo ricettario con nome
  `<nome originale> - Vegetariane`, contenente le ricette che implementano
  `Vegetariana` e risultano vegetariane;
- `toString()`.

Il metodo `aggiungi` deve impedire duplicati anche quando il codice è scritto con
maiuscole o minuscole diverse.

## Vincoli

- Non modificare `Main.java`.
- Usare obbligatoriamente `HashSet`.
- Mantenere le firme dei metodi presenti negli scheletri.
- Usare una classe astratta e un'interfaccia.
- Gestire `RicettaNonValidaException` come eccezione checked.
- Non usare API introdotte dopo Java 8.
