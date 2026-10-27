# Simulazione: flotta di mezzi a noleggio

Completare le classi Java presenti nella cartella senza modificare `Main.java`.

## Traccia

Realizzare un sistema per la gestione di una flotta di mezzi disponibili per il
noleggio. La flotta può contenere mezzi di tipo diverso, alcuni dei quali alimentati
elettricamente.

### Interfaccia `Elettrico`

L'interfaccia rappresenta un mezzo dotato di batteria e deve dichiarare:

- un metodo per ottenere il livello attuale della batteria, espresso in percentuale;
- un metodo per ricaricare la batteria di una quantità indicata.

Il livello della batteria deve rimanere compreso tra `0` e `100`. Una ricarica che
porterebbe il livello oltre `100` deve impostarlo a `100`.

### Classe astratta `Mezzo`

La classe rappresenta le caratteristiche comuni di ogni mezzo e deve contenere:

- un codice identificativo;
- il modello;
- l'anno di immatricolazione.

La classe deve:

- essere astratta;
- implementare `Comparable<Mezzo>`;
- ordinare i mezzi per modello in ordine crescente e, a parità di modello, per codice
  crescente;
- considerare uguali due mezzi con lo stesso codice;
- dichiarare il metodo astratto `calcolaCostoNoleggio(int ore)`;
- fornire i getter e una rappresentazione testuale comune.

### Classe `Auto`

La classe deve estendere `Mezzo` e contenere il numero di posti.

Il costo di noleggio deve essere calcolato come:

- `25.0 * ore` per un'auto con al massimo 4 posti;
- `35.0 * ore` per un'auto con più di 4 posti.

Un numero di ore minore o uguale a zero e un numero di posti minore di `2` devono
produrre `IllegalArgumentException`.

### Classe `BiciclettaElettrica`

La classe deve estendere `Mezzo` e implementare `Elettrico`. Deve contenere:

- la dimensione della batteria in Wh;
- il livello attuale della batteria.

Il costo di noleggio deve essere `8.0 * ore`. La dimensione della batteria deve essere
positiva e il livello iniziale deve essere compreso tra `0` e `100`.

Il metodo `ricarica` deve rifiutare quantità negative e aggiornare il livello senza
superare `100`.

### Classe `Flotta`

La classe rappresenta una flotta identificata da un nome e contiene una collezione di
oggetti `Mezzo`.

La collezione deve:

- evitare duplicati tramite il codice del mezzo;
- mantenere l'ordine naturale definito da `Mezzo.compareTo`.

Implementare:

- `aggiungi(Mezzo mezzo)`;
- `costoTotaleNoleggio(int ore)`, che somma il costo di tutti i mezzi;
- `soloElettrici()`, che restituisce una nuova flotta con nome
  `<nome originale> - Elettrici` e contenente solo i mezzi che implementano
  `Elettrico`;
- `toString()`.

## Vincoli

- Non modificare `Main.java`.
- Mantenere le firme dei metodi presenti negli scheletri.
- Usare una classe astratta e un'interfaccia come richiesto.
- Usare una collezione standard coerente con unicità e ordinamento.
- Gestire gli input non validi tramite `IllegalArgumentException`.

Il file `Main.java` contiene casi d'uso per l'inserimento dei mezzi, il calcolo del costo
totale, la ricarica e il filtraggio dei mezzi elettrici.
