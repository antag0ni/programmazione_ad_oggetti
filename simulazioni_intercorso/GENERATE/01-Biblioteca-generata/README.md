# Simulazione: gestione di una biblioteca

Completa le classi Java presenti nella cartella senza modificare `TestLibrary.java`.

## Traccia

Realizzare un piccolo sistema per la gestione dei documenti disponibili in una biblioteca.

### Classe `Book`

La classe rappresenta un libro e deve contenere:

- il codice ISBN, rappresentato da una `String`;
- il titolo, rappresentato da una `String`;
- la data di pubblicazione, rappresentata da un `LocalDate`.

Il costruttore deve inizializzare tutti gli attributi. Devono inoltre essere disponibili i
metodi getter indicati nello scheletro.

Due libri sono considerati uguali quando hanno lo stesso codice ISBN. Implementare quindi
correttamente `equals` e `hashCode`. Il metodo `toString` deve restituire una
rappresentazione leggibile dell'oggetto.

### Classe `EBook`

La classe rappresenta un libro digitale e deve estendere `Book`. Oltre agli attributi
ereditati, deve contenere:

- la dimensione del file in megabyte;
- il formato del file;
- un valore booleano che indica se il libro è disponibile con licenza open access.

Il costruttore riceve un `Book` e i tre attributi specifici dell'e-book. Se la dimensione
del file non è positiva oppure il formato è vuoto, deve essere lanciata una
`IllegalArgumentException`.

Implementare i getter richiesti e ridefinire `toString` includendo anche le informazioni
specifiche dell'e-book.

### Classe `Library`

La classe rappresenta una biblioteca identificata da un nome e contiene una collezione di
oggetti `Book`, inclusi gli eventuali `EBook`.

Il metodo `add` deve aggiungere un libro alla biblioteca. Non è possibile inserire due
libri con lo stesso ISBN: in questo caso deve essere lanciata una `IllegalArgumentException`.

Il metodo `filterOpenAccess` deve restituire una nuova `Library`, con nome
`<nome originale> - Open Access`, contenente soltanto gli e-book con licenza open access.
Gli oggetti presenti nella biblioteca originale non devono essere rimossi o modificati.

Il metodo `toString` deve riportare il nome della biblioteca e l'elenco dei libri
contenuti.

## Vincoli

- Usare `java.time.LocalDate` per le date.
- Non modificare `TestLibrary.java`.
- Mantenere le firme dei metodi già presenti negli scheletri.
- Utilizzare le collezioni standard della libreria Java.
- Gestire gli input non validi tramite `IllegalArgumentException`.

Il file `TestLibrary.java` contiene alcuni casi d'uso e una verifica esplicita del caso di
errore. Dopo aver completato l'implementazione, compilare ed eseguire il programma per
verificare l'output.
