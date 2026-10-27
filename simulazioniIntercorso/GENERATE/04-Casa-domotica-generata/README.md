# Simulazione: gestione di una casa domotica

Completare le classi Java presenti nella cartella senza modificare `Main.java`.

## Traccia

Realizzare un sistema per la gestione dei dispositivi presenti in una casa domotica.
La casa può contenere dispositivi di tipo diverso, alcuni dei quali possono essere
connessi o disconnessi dall'impianto.

### Interfaccia `Connettibile`

L'interfaccia rappresenta un dispositivo che può essere collegato all'impianto
domotico. Deve dichiarare:

- `connetti()`;
- `disconnetti()`;
- `isConnesso()`.

### Classe astratta `Dispositivo`

La classe rappresenta le caratteristiche comuni di ogni dispositivo e deve contenere:

- un codice identificativo;
- il nome del dispositivo;
- la potenza assorbita in watt.

La classe deve:

- essere astratta;
- implementare `Comparable<Dispositivo>`;
- ordinare i dispositivi per nome in ordine crescente e, a parità di nome, per codice
  crescente;
- considerare uguali due dispositivi con lo stesso codice;
- dichiarare il metodo astratto `consumo(int ore)`;
- fornire getter e `toString`.

Il metodo `consumo(int ore)` deve restituire il consumo energetico in Wh. Ogni
implementazione deve rifiutare un numero di ore minore o uguale a zero tramite
`IllegalArgumentException`.

### Classe `Lampada`

La classe deve estendere `Dispositivo` e implementare `Connettibile`.

Deve contenere la luminosità, espressa in lumen. Il consumo deve essere calcolato come:

```text
potenza * ore
```

La luminosità deve essere positiva. Una lampada appena creata deve risultare
disconnessa.

### Classe `Termostato`

La classe deve estendere `Dispositivo` e implementare `Connettibile`.

Deve contenere la temperatura impostata. Il consumo deve essere calcolato come:

```text
potenza * ore * 1.2
```

La temperatura deve essere compresa tra `5` e `35` gradi Celsius. Anche un termostato
appena creato deve risultare disconnesso.

### Classe `Casa`

La classe rappresenta una casa identificata da un indirizzo e contiene una collezione
di `Dispositivo`.

La collezione deve:

- evitare duplicati tramite il codice del dispositivo;
- mantenere l'ordine naturale definito da `Dispositivo.compareTo`.

Implementare:

- `aggiungi(Dispositivo dispositivo)`;
- `consumoTotale(int ore)`, che somma il consumo di tutti i dispositivi connessi;
- `soloConnessi()`, che restituisce una nuova casa con indirizzo
  `<indirizzo originale> - Connessi` e contiene soltanto i dispositivi che implementano
  `Connettibile` e risultano connessi;
- `toString()`.

## Vincoli

- Non modificare `Main.java`.
- Mantenere le firme dei metodi presenti negli scheletri.
- Usare una classe astratta e un'interfaccia come richiesto.
- Usare una collezione standard coerente con unicità e ordinamento.
- Gestire gli input non validi tramite `IllegalArgumentException`.

Il file `Main.java` contiene casi d'uso per la connessione dei dispositivi, il calcolo
del consumo e il filtraggio dei soli dispositivi connessi.
