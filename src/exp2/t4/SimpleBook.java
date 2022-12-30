package exp2.t4;

public class SimpleBook implements Book {
    @Override
    public void borrowBook() {
        System.out.println("Borrow book.");
    }

    @Override
    public void returnBook() {
        System.out.println("Return book.");
    }
}
