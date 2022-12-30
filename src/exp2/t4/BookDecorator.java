package exp2.t4;

public abstract class BookDecorator implements Book{
    public Book book;

    public BookDecorator(Book book) {
        this.book = book;
    }

    @Override
    public void borrowBook() {
        book.borrowBook();
    }

    @Override
    public void returnBook() {
        book.returnBook();
    }
}
