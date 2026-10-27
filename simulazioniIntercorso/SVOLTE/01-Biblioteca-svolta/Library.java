import java.util.*;

public class Library {

    private final String name;
    private final Set<Book> library;

    public Library(String name) {
        library = new HashSet<>();
        this.name = name;
    }

    public void add(Book book) {
        if (library.contains(book)) {
            throw new IllegalArgumentException();
        } else {
            library.add(book);
        }
    }

    public Library filterOpenAccess() {
        Library filtered = new Library(this.name + " - Open Access");
        for (Book book : library) {
            if (book instanceof EBook) {
                EBook ebook = (EBook)book;
                if (ebook.isOpenAccess()) {
                    filtered.add(ebook);
                }
            }
        }
        return filtered;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s%n", this.name));
        for (Book b : library) {
            sb.append(String.format("%s%n", b.toString()));
        }
        return sb.toString();
    }
}
