package exp2.t4;

public class FreezeBook extends BookDecorator {
    public FreezeBook(Book book) {
        super(book);
        System.out.println("Add function: freezeBook().");
    }

    public void freezeBook() {
        System.out.println("Freeze book");
    }
}
