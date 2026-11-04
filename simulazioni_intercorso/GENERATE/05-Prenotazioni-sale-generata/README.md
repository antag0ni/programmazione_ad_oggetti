# Simulazione: prenotazione di sale

Completare le classi Java presenti nella cartella senza modificare `Main.java`.

## Traccia

Realizzare un sistema per la gestione delle sale di un centro universitario.
Le sale possono essere di tipo diverso e possono essere prenotate per un certo numero
di ore.

La prova richiede di definire e utilizzare eccezioni personalizzate **checked**.

### Eccezione `PrenotazioneNonDisponibileException`

Creare una classe che estenda `Exception`.

L'eccezione deve essere utilizzata quando si tenta di prenotare una sala già occupata.
Deve avere almeno un costruttore che riceva un messaggio `String`.

### Eccezione `DatiPrenotazioneException`

Creare una seconda eccezione personalizzata checked, estendendo `Exception`.

Deve essere utilizzata quando il numero di ore richiesto non è valido oppure quando
vengono forniti dati non validi alla prenotazione.

### Interfaccia `Prenotabile`

L'interfaccia deve dichiarare il metodo:

```java
void prenota(int ore)
        throws PrenotazioneNonDisponibileException, DatiPrenotazioneException;
```

Deve inoltre dichiarare:

- `libera()`;
- `isOccupata()`.

### Classe astratta `Spazio`

La classe rappresenta le caratteristiche comuni di ogni spazio e deve contenere:

- un codice identificativo;
- un nome;
- la capienza massima.

La classe deve:

- essere astratta;
- implementare `Comparable<Spazio>`;
- ordinare gli spazi per nome in ordine crescente e, a parità di nome, per codice;
- considerare uguali due spazi con lo stesso codice;
- dichiarare il metodo astratto `calcolaCosto(int ore)`;
- fornire getter e `toString`.

### Classe `Aula`

La classe deve estendere `Spazio` e implementare `Prenotabile`.

Deve contenere il numero di piano. Il costo deve essere calcolato come:

```text
10.0 * ore + 2.0 * piano
```

Una prenotazione deve:

- rifiutare un numero di ore minore o uguale a zero tramite
  `DatiPrenotazioneException`;
- rifiutare una sala già occupata tramite `PrenotazioneNonDisponibileException`;
- impostare la sala come occupata quando la prenotazione va a buon fine.

### Classe `Laboratorio`

La classe deve estendere `Spazio` e implementare `Prenotabile`.

Deve contenere il numero di computer. Il costo deve essere calcolato come:

```text
18.0 * ore + 3.0 * numeroComputer
```

Deve applicare le stesse regole di prenotazione dell'aula.

### Classe `Centro`

La classe rappresenta un centro identificato da un nome e contiene una collezione di
oggetti `Spazio`.

La collezione deve:

- evitare duplicati tramite il codice;
- mantenere l'ordine naturale definito da `Spazio.compareTo`.

Implementare:

- `aggiungi(Spazio spazio)`;
- `prenotaDisponibili(int ore)`, che tenta di prenotare tutti gli spazi liberi;
- `costoTotale(int ore)`, che somma il costo degli spazi occupati;
- `soloLiberi()`, che restituisce un nuovo centro con nome
  `<nome originale> - Liberi`;
- `toString()`.

Il metodo `prenotaDisponibili` deve gestire le eccezioni checked senza interrompere la
prenotazione degli altri spazi. Per ogni spazio non prenotabile deve stampare il
messaggio dell'eccezione.

## Vincoli

- Non modificare `Main.java`.
- Mantenere le firme dei metodi presenti negli scheletri.
- Usare almeno due eccezioni personalizzate checked.
- Gestire le eccezioni tramite `try-catch` e dichiararle con `throws` dove necessario.
- Usare una classe astratta, un'interfaccia e una collezione standard ordinata.
- Gestire gli input non validi senza usare eccezioni generiche non motivate.
