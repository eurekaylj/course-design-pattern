package exp2.t4;

public class LoseBook extends BookDecorator {

    public LoseBook(Book book) {
        super(book);
        System.out.println("Add function: loseBook().");
    }

    public void loseBook() {
        System.out.println("Lose book.");
    }
}
