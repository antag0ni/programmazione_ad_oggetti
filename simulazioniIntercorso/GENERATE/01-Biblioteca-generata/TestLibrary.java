// NON MODIFICARE QUESTO FILE

import java.time.LocalDate;

public class TestLibrary {

    public static void main(String[] args) {

        Library library = new Library("Biblioteca comunale");

        Book book1 = new Book(
                "978-8800000001",
                "Fondamenti di programmazione",
                LocalDate.of(2021, 5, 10));
        Book book2 = new Book(
                "978-8800000002",
                "Algoritmi e strutture dati",
                LocalDate.of(2020, 9, 21));
        Book book3 = new Book(
                "978-8800000003",
                "Sistemi operativi",
                LocalDate.of(2019, 2, 15));

        EBook ebook1 = new EBook(book1, 12, "PDF", true);
        EBook ebook2 = new EBook(book2, 18, "EPUB", false);

        library.add(ebook1);
        library.add(ebook2);
        library.add(book3);

        System.out.println(library);

        try {
            new EBook(book2, 0, "PDF", false);
        } catch (IllegalArgumentException ex) {
            System.out.println("\nException test:\n" + ex + "\n");
        }

        Library openAccess = library.filterOpenAccess();

        System.out.println(openAccess);
    }
}
