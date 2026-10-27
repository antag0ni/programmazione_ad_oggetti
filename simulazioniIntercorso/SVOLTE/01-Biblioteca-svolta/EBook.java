
public class EBook extends Book {

    private final int fileSizeMb;
    private final String format;
    private final boolean openAccess;

    public EBook(Book book, int fileSizeMb, String format, boolean openAccess) {
        super(book.getIsbn(), book.getTitle(), book.getPublicationDate());
        this.fileSizeMb = fileSizeMb;
        this.format = format;
        this.openAccess = openAccess;
        if (fileSizeMb <= 0 || format == null || format.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public int getFileSizeMb() {
        return fileSizeMb;
    }

    public String getFormat() {
        return format;
    }

    public boolean isOpenAccess() {
        return openAccess;
    }

    @Override
    public String toString() {
        return super.toString() + "fileSizeMb=" + fileSizeMb + "\nformat=" + format + "\nopenAccess=" + openAccess + '\n';
    }
}
