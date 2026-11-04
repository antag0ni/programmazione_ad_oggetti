import java.time.LocalDate;
import java.util.Objects;


public class Book {
    
    private final String isbn;
    private final String title;
    private final LocalDate dataPubblicazione;

    public Book(String isbn, String title, LocalDate dataPubblicazione) {
        this.isbn = isbn;
        this.title = title;
        this.dataPubblicazione = dataPubblicazione;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPublicationDate() {
        return dataPubblicazione;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getIsbn());
    }

    @Override
    public final boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        if (this == o) return true;

        Book that = (Book)o;
        return Objects.equals(this.getIsbn(), that.getIsbn());
        // return this.getIsbn().equals(that.getIsbn());
    }

    @Override
    public String toString() {
        return String.format("***Book***%ntitle=%s%nisbn=%s%ndataPubblicazione=%s%n", title, isbn, dataPubblicazione.toString());
    }
}
