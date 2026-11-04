# Simulazione finale: gestione di eventi

## Consegna

Realizzare un'applicazione Java 8 per la gestione degli eventi organizzati da un
centro culturale.

La prova è riepilogativa e richiede di utilizzare:

- classi astratte;
- interfacce;
- ereditarietà;
- polimorfismo;
- eccezioni personalizzate checked;
- `HashSet`;
- `TreeSet`;
- `Comparable`;
- `equals` e `hashCode`;
- `try-catch` e `throws`;
- filtraggio e calcolo di valori aggregati.

Non modificare `Main.java`.

## File da realizzare

### `EventoNonDisponibileException.java`

Creare un'eccezione personalizzata checked che estenda `Exception`.

Deve contenere un costruttore che riceve un messaggio `String`.

Utilizzarla quando si tenta di iscrivere una persona a un evento già pieno oppure
quando si tenta di annullare un'iscrizione inesistente.

### `DatiEventoException.java`

Creare una seconda eccezione personalizzata checked che estenda `Exception`.

Deve contenere un costruttore che riceve un messaggio `String`.

Utilizzarla quando si tenta di creare un evento con dati non validi o quando si
passa un numero di posti non valido.

### `Online.java`

Creare un'interfaccia con i metodi:

```java
boolean isOnline();
void impostaOnline(boolean online);
```

### `Iscrivibile.java`

Creare un'interfaccia con i metodi:

```java
void iscrivi(String partecipante)
        throws EventoNonDisponibileException, DatiEventoException;

void annullaIscrizione(String partecipante)
        throws EventoNonDisponibileException, DatiEventoException;

int numeroIscritti();
```

### `Evento.java`

Creare una classe astratta che implementi `Comparable<Evento>`.

Deve contenere i seguenti attributi privati e final:

- `String codice`;
- `String titolo`;
- `int durataMinuti`;
- `int postiMassimi`.

Il costruttore deve ricevere tutti gli attributi e dichiarare
`throws DatiEventoException`.

Il costruttore deve rifiutare con `DatiEventoException`:

- codice nullo o vuoto;
- titolo nullo o vuoto;
- durata minore o uguale a zero;
- posti massimi minori o uguali a zero.

Implementare i getter.

La classe deve dichiarare il metodo astratto:

```java
double calcolaCosto();
```

Implementare `equals` e `hashCode` usando il codice dell'evento. Il confronto deve
essere case-insensitive e `hashCode` deve essere coerente con `equals`.

Implementare `compareTo` ordinando gli eventi:

1. per titolo in ordine crescente, ignorando la differenza tra maiuscole e
   minuscole;
2. a parità di titolo, per codice in ordine crescente, ignorando la differenza
   tra maiuscole e minuscole.

Implementare `toString` con le informazioni comuni dell'evento.

### `Concerto.java`

Creare una classe che estenda `Evento` e implementi `Iscrivibile` e `Online`.

Deve contenere:

- `double prezzoBiglietto`;
- una collezione di partecipanti;
- lo stato online.

La collezione dei partecipanti deve essere un `HashSet<String>`.

Il costruttore deve ricevere gli attributi comuni e il prezzo del biglietto,
dichiarando `throws DatiEventoException`.

Il prezzo del biglietto deve essere maggiore o uguale a zero.

Il costo dell'evento deve essere calcolato come:

```text
prezzoBiglietto * numeroIscritti()
```

Il metodo `iscrivi` deve:

- rifiutare un nome nullo o vuoto con `DatiEventoException`;
- rifiutare l'iscrizione se l'evento è pieno con
  `EventoNonDisponibileException`;
- non inserire due volte lo stesso partecipante;
- aggiungere il partecipante al `HashSet`.

Il metodo `annullaIscrizione` deve:

- rifiutare un nome nullo o vuoto con `DatiEventoException`;
- lanciare `EventoNonDisponibileException` se il partecipante non è iscritto;
- rimuovere il partecipante se presente.

### `Conferenza.java`

Creare una classe che estenda `Evento` e implementi `Iscrivibile`.

Deve contenere:

- `double costoFisso`;
- una collezione di partecipanti;

La collezione deve essere un `HashSet<String>`.

Il costo fisso deve essere maggiore o uguale a zero.

Il costo dell'evento deve essere calcolato come:

```text
costoFisso + 5.0 * numeroIscritti()
```

Applicare a `iscrivi`, `annullaIscrizione` e `numeroIscritti` le stesse regole
descritte per `Concerto`.

### `Calendario.java`

Creare una classe che rappresenti il calendario degli eventi.

Deve contenere:

- un nome;
- una collezione di eventi.

La collezione deve essere un `TreeSet<Evento>` e deve mantenere l'ordinamento
naturale definito da `Evento.compareTo`.

Implementare:

```java
void aggiungi(Evento evento)
```

Il metodo deve ignorare gli eventi con codice già presente, anche se il codice è
scritto con maiuscole o minuscole diverse.

Implementare:

```java
double costoTotale()
```

Il metodo deve restituire la somma del costo di tutti gli eventi.

Implementare:

```java
Calendario soloOnline()
```

Il metodo deve restituire un nuovo calendario con nome:

```text
<nome originale> - Online
```

Deve contenere soltanto gli eventi che implementano `Online` e per i quali
`isOnline()` restituisce `true`.

Implementare:

```java
void iscriviPartecipante(String partecipante)
```

Il metodo deve tentare di iscrivere il partecipante a tutti gli eventi del
calendario. Deve gestire le eccezioni checked senza interrompere il ciclo e stampare
il messaggio dell'eccezione per ogni evento in cui l'iscrizione non è possibile.

Implementare `toString` mostrando il nome del calendario e tutti gli eventi nel
l'ordine del `TreeSet`.

## Vincoli obbligatori

- Non modificare `Main.java`.
- Usare Java 8.
- Usare un `HashSet<String>` per i partecipanti.
- Usare un `TreeSet<Evento>` per il calendario.
- Usare almeno due eccezioni personalizzate checked.
- Non usare `catch (Exception)` se è possibile usare catch specifici.
- Mantenere coerenti `equals` e `hashCode`.
- Gestire correttamente input nulli, vuoti e valori numerici non validi.
- Non utilizzare API introdotte dopo Java 8, come `String.isBlank()`, `List.of()`,
  `Set.of()`, `Map.of()`, `var` o `record`.

## Output di esempio

L'ordine effettivo degli eventi deve dipendere da `compareTo`. Il seguente output
mostra il formato atteso e un possibile risultato:

```text
Calendario Centro culturale
codice=C001
titolo=Concerto jazz
durataMinuti=120
postiMassimi=2
iscritti=2
online=true
prezzoBiglietto=25.0
codice=C002
titolo=Introduzione a Java
durataMinuti=90
postiMassimi=3
iscritti=1
costoFisso=100.0

Costo totale: 155.0
Evento non disponibile: evento pieno

Calendario Centro culturale - Online
codice=C001
titolo=Concerto jazz
durataMinuti=120
postiMassimi=2
iscritti=2
online=true
prezzoBiglietto=25.0

Exception test: durata non valida
```

L'output può differire nei dettagli dei messaggi, purché il comportamento richiesto
sia rispettato.
